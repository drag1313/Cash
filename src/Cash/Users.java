package Cash;

import java.io.*;
import java.util.Scanner;

public class Users {
    private static final String FILENAME = "C:\\Users\\drag\\Desktop\\SC11\\Cash\\Users.txt";
    static String userName;
    String name;

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

    void searchUserInFile(String searchName) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            while (!(name = br.readLine()).equals(searchName)) {
                age = Integer.parseInt(br.readLine());
            }
            age = Integer.parseInt(br.readLine());
            System.out.printf("Возраст пользователя %s : %d лет  ", searchName, age);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
