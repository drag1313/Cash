package Cash;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        String searchName;
        Users user = new Users();
        Cash cash=new Cash();
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте,вас приветствует база данных! ");
        System.out.println("Для добавления пользователя нажмие  - 1 ");
        System.out.println("Для получения данных из базы нажмите  - 2");
        x = in.nextInt();
        if (x == 1) {
            user.scan();
            cash.addUserInWHM(user.age,user.userName);
            user.addUserInFile();
            cash.getSize();
        }else {
            System.out.println("ВВедите имя пользователя:");
            searchName = in.nextLine();
            System.out.println("Поиск" + searchName);

        }
    }
}