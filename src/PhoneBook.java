import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class PhoneBook {

    static String fileName = "src\\phoneBook.txt";
    public static void main(String[] args) throws Exception{
        PhoneBook book  = new PhoneBook();

            book.maneMenu();



    }


    void maneMenu() throws Exception{ //вывод меню
        while (true) {
        System.out.println("-== Телефонная книга ==-");
        System.out.println("Выберете действие:");
        System.out.println("1. Просмотр контактов");
        System.out.println("2. Добавление нового контакта");
        switchMainMenu(reader());
        }
    }

    int reader() {//чтение консоли
        Scanner in = new Scanner(System.in);
        int a=0;
        try {
            a = in.nextInt();

        } catch (Exception ex) {

            System.out.println("!!!Неверный ввод!!!");
            System.out.println("________________________");}

        return a;
    }

    void switchMainMenu(int choice) throws Exception{//переход по основному меню
        switch(choice) {
            case 1:
               contactListView();
                break;
            case 2:
                contactAdd();
                break;
            default:
                System.out.println("!!!Неверный ввод!!!");
                System.out.println("________________________");
        break;

        }
    }


    void contactListView() throws Exception{

            ContactListViewMenu();

    }

    void contactAdd () {
        System.out.println("-== Добавление нового контакта ==-");}

    void ContactListViewMenu() throws Exception{ //вывод меню
        while (true) {
        System.out.println("-== Список контактов ==-");
        fileRead();//вывод всех контактов
        System.out.println("Выберете действие:");
        System.out.println("1. Просмотреть контакт");
        System.out.println("2. Удалить контакт");
        System.out.println("3. Редактировать контакт");
        System.out.println("4. Поиск по контактам");
        System.out.println("5. В главное меню");

        switchContactListViewMenu(reader());
        }
    }

    void switchContactListViewMenu(int choice) throws Exception{//переход по меню просмотра телефонной книги
        switch(choice) {
            case 1:
                contactListView();
                break;
            case 2:
                contactAdd();
                break;
            case 5:
                maneMenu();

                break;
            default:
                System.out.println("!!!Неверный ввод!!!");
                System.out.println("________________________");
                break;

        }
    }


    static void fileRead() throws Exception{ // чтение файла
        int num = 1;
        FileReader fr = new FileReader(fileName);
        BufferedReader b = new BufferedReader(fr);
        String str;
        while ((str = b.readLine()) != null) {
            System.out.println(num + ". "  + str);
            num++;

        }
        fr.close();

    }

    void fileWrite(String firstName, String lastName, String number) throws Exception { // Добавление номера в файл



        FileWriter fw = new FileWriter(fileName, true);
        fw.write(firstName + " " + lastName + " " + number + "\n");
        fw.close();
    }

}

