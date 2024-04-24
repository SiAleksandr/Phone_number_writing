package saving.core.tasks;

import saving.core.Verification;

public class PhoneNumResearch implements Verification {
    @Override
    public int explore(String elem, int controlCount) {
        if (isDigits(elem) && elem.length() >= 3) {
            return controlCount + 1;
        }
        else throw  new RuntimeException("Номер телефона введён некорректно");
    }
}
