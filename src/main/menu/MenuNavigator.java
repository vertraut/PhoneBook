package main.menu;

import main.menu.pages.MenuPages;

import java.util.Scanner;

import static main.helpers.FileHelper.readFile;


public class MenuNavigator {

    public static void main(String[] args) {
        new MenuNavigator().openMainMenu();
    }


    private void openMainMenu() { //вывод меню
        while (true) {
            print(MenuPages.MAIN.getContent());
            switch (read()) {
                case 1:
                    openContactListViewMenu();
                    break;
                case 2:
                    openAddContact();
                    break;
                default:
                    //TODO: MenuPages.ERROR
                    print("!!!Неверный ввод!!!");
                    print("________________________");
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
            //TODO: MenuPages.ERROR
            print("!!!Неверный ввод!!!");
            print("________________________");
        }
        return a;
    }

    private void openAddContact() {
        //TODO: MenuPages.ADD_CONTACT
        print("-== Добавление нового контакта ==-");
    }

    private void openContactListViewMenu() { //вывод меню
        while (true) {
            //TODO: MenuPages.VIEW_CONTACTS
            print("-== Список контактов ==-");
            readFile();//вывод всех контактов
            //TODO: MenuPages.ACTIONS
            print("Выберете действие:");
            print("1. Просмотреть контакт");
            print("2. Удалить контакт");
            print("3. Редактировать контакт");
            print("4. Поиск по контактам");
            print("5. В главное меню");

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
                    //TODO: MenuPages.ERROR
                    print("!!!Неверный ввод!!!");
                    print("________________________");
                    break;
            }
        }
    }

    private void print(String text){
        System.out.println(text);
    }



}

