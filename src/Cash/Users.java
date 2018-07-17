package Cash;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Users {
    String userName;
    int age;

    public void addUser() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        userName = in.nextLine();
        System.out.print("Введите возраст: ");
        age = in.nextInt();
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
