import java.util.Scanner;

import static helpers.FileHelper.readFile;


public class PhoneBook {


    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.openMainMenu();
    }


    private void openMainMenu() { //вывод меню
        while (true) {
            System.out.println("-== Телефонная книга ==-");
            System.out.println("Выберете действие:");
            System.out.println("1. Просмотр контактов");
            System.out.println("2. Добавление нового контакта");
            switchMainMenu(read());
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

    private void switchMainMenu(int choice) {//переход по основному меню
        switch (choice) {
            case 1:
                openContactListViewMenu();
                break;
            case 2:
                addContact();
                break;
            default:
                System.out.println("!!!Неверный ввод!!!");
                System.out.println("________________________");
                break;
        }
    }

    private void addContact() {
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

            switchContactListViewMenu(read());
        }
    }

    private void switchContactListViewMenu(int choice) {//переход по меню просмотра телефонной книги
        switch (choice) {
            case 1:
                openContactListViewMenu();
                break;
            case 2:
                addContact();
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

