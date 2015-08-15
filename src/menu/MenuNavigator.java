package menu;

import java.util.Scanner;

import static helpers.FileHelper.readFile;


public class MenuNavigator {

    public static void main(String[] args) {
        new MenuNavigator().openMainMenu();
    }


    private void openMainMenu() { //вывод меню
        while (true) {
            System.out.println("-== Телефонная книга ==-");
            System.out.println("Выберете действие:");
            System.out.println("1. Просмотр контактов");
            System.out.println("2. Добавление нового контакта");
            switch (read()) {
                case 1:
                    openContactListViewMenu();
                    break;
                case 2:
                    openAddContact();
                    break;
                default:
                    System.out.println("!!!Неверный ввод!!!");
                    System.out.println("________________________");
                    break;
            }
        }
    }

    private int read() {//чтение консоли
        Scanner in = new Scanner(System.in);
        int a = 0;
        try {
            a = in.nextInt();
        } catch (Exception ex) {

            System.out.println("!!!Неверный ввод!!!");
            System.out.println("________________________");
        }
        return a;
    }

    private void openAddContact() {
        System.out.println("-== Добавление нового контакта ==-");
    }

    private void openContactListViewMenu() { //вывод меню
        while (true) {
            System.out.println("-== Список контактов ==-");
            readFile();//вывод всех контактов
            System.out.println("Выберете действие:");
            System.out.println("1. Просмотреть контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Редактировать контакт");
            System.out.println("4. Поиск по контактам");
            System.out.println("5. В главное меню");

            switch (read()) {
                case 1:
                    openContactListViewMenu();
                    break;
                case 2:
                    break;
                case 5:
                    openMainMenu();

                    break;
                default:
                    System.out.println("!!!Неверный ввод!!!");
                    System.out.println("________________________");
                    break;
            }
        }
    }



}

