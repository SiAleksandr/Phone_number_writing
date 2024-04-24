package saving.view;

import saving.core.Organizer;

import java.io.IOException;
import java.util.Scanner;

public class UserView {
    private final static Organizer organizer = new Organizer();
    private String[] arr;
    public void buttonClick() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Фамилия Имя Отчество дата _ рождения номер _ телефона пол\n" +
                "Введите данные в таком формате (f - Мужск. m - Женск. пол)");
        System.out.print("-> ");
        String data = scanner.nextLine();
        String[] arr = organizer.getArray(data);
        int controlCount = 0;
        try {
            for (int i = 0; i <= 2; i++)
            controlCount = organizer.nameDataCheck(arr[i], controlCount);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            controlCount = organizer.dateCheck(arr[3], controlCount);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            controlCount = organizer.phoneNumCheck(arr[4], controlCount);
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            controlCount = organizer.userSexCheck(arr[5], controlCount);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            int rightValue = 6;
            if(controlCount == rightValue) {
                String confirmation = organizer.writePerson(arr);
                System.out.println(confirmation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
