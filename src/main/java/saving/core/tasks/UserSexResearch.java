package saving.core.tasks;

import saving.core.Verification;

public class UserSexResearch implements Verification {
    @Override
    public int explore(String elem, int controlCount) throws RuntimeException {
        if (elem.equals("m") || elem.equals("f"))
            return controlCount + 1;
        else throw new RuntimeException("Пол введён некорректно.");
    }
}
