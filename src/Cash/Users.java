package Cash;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Users {

    static String userName;

    static int age;
    Scanner in = new Scanner(System.in);


    void scan() {
        System.out.println("Введите имя: ");
        userName = in.nextLine();
        System.out.println("Введите возраст: ");
        age = in.nextInt();
        in.nextLine();

    }

    void addUserInFile() {

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
    }


}
