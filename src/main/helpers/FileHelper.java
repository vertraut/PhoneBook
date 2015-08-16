package main.helpers;

import java.io.*;

public class FileHelper {

    private static final String FILE_NAME = "src\\resources\\phoneBook.txt";

    public static void readFile() { // чтение файла
        int num = 1;
        FileReader fr;
        BufferedReader b = null;
        try {
            fr = new FileReader(FILE_NAME);
            b = new BufferedReader(fr);
            String str;
            while ((str = b.readLine()) != null) {
                System.out.println(num + ". " + str);
                num++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (b != null) {
                    b.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeFile(String firstName, String lastName, String number) { // Добавление
        // номера в файл
        //TODO: add buffer
        FileWriter fw;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(FILE_NAME, true);
            bw = new BufferedWriter(fw);
            fw.write(firstName + " " + lastName + " " + number + "\n");
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

