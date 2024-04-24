package saving.core.tasks;

import saving.core.Verification;

public class DateResearch implements Verification {
    @Override
    public int explore(String elem, int currentNumber) throws RuntimeException {
        RuntimeException e = new RuntimeException("День, месяц или год даты рождения введены не корректно.");
        elem = elem.replace(".", " ");
        String[] dateValues = elem.split(" ");
        if ((dateValues[0].length() == 2) && (dateValues[1].length() == 2) &&
                isDigits(dateValues[0]) && isDigits(dateValues[1]) &&
                (dateValues[2].length() == 4) && isDigits(dateValues[2]) &&
                (dateValues.length == 3)) {
            Integer day = Integer.parseInt(dateValues[0]);
            Integer month = Integer.parseInt(dateValues[1]);
            if ((day > 0) && (day <= 31) &&
                    (month > 0) && (month <= 12)) return currentNumber + 1;
            else throw e;
        } else throw e;
    }
}
