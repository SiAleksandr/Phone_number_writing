package saving.core;


import java.io.FileWriter;
import java.io.IOException;

import saving.core.tasks.WordResearch;
import saving.core.tasks.DateResearch;
import saving.core.tasks.PhoneNumResearch;
import saving.core.tasks.UserSexResearch;

public class Organizer {
    private static WordResearch wordResearch;
    private static DateResearch dateResearch;
    private static PhoneNumResearch phoneNumResearch;
    private static UserSexResearch userSexResearch;

    {
        wordResearch = new WordResearch();
        dateResearch = new DateResearch();
        phoneNumResearch = new PhoneNumResearch();
        userSexResearch = new UserSexResearch();
    }

    public String[] getArray(String s) {
        return s.split(" ");
    }

    public int nameDataCheck(String word, int currentNum) throws RuntimeException {
        return wordResearch.explore(word, currentNum);
    }

    public int dateCheck(String value, int currentNum) throws RuntimeException {
        return dateResearch.explore(value, currentNum);
    }

    public int phoneNumCheck(String value, int currentNum) throws RuntimeException {
        return phoneNumResearch.explore(value, currentNum);
    }

    public int userSexCheck(String value, int currentNum) throws RuntimeException {
        return userSexResearch.explore(value, currentNum);
    }

    public String writePerson(String arr[]) throws IOException {
        String fileName = arr[0] + ".txt";
        try (FileWriter fw = new FileWriter(fileName, true)) {
            String record = String.format("<%s> <%s> <%s> <%s> <%s> <%s>\n",
                    arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
            fw.write(record);
            fw.flush();
            return record + "Запись в файл прошла успешно.";
        } catch (IOException e) {
            throw e;
        }
    }
}
