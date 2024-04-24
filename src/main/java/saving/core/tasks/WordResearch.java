package saving.core.tasks;

import saving.core.Verification;

public class WordResearch implements Verification {
    @Override
    public int explore(String element, int currentNumber) throws RuntimeException {
        element = element.replace(",", "0");
        element = element.replace(".", "0");
        if (isDigits(element)) {
            throw new RuntimeException("Вместо имени, отчества или фамилии введено число.");
        } else return currentNumber + 1;
    }
}


