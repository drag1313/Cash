package Cash;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Users {
    static String userName;
    static int age;
    static Scanner in = new Scanner(System.in);

    public static void scan() {
        System.out.print("Введите имя: ");
        userName = in.nextLine();
        System.out.print("Введите возраст: ");
        age = in.nextInt();

    }

    public void addUserInFile() {

        File myFile = new File("C:/Users/drag/Desktop/SC11/cash/Users.txt");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));
            String lineSeparator = System.getProperty("line.separator");
            writer.write(userName + lineSeparator);
            writer.write(age + lineSeparator);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Пользователь успешно добавлен!");


    }

}
