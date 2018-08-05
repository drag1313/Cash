package Cash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cash cash = new Cash();
        Users user = new Users();
        LRUCache lruCash = new LRUCache(2);
        hello(cash, user,lruCash);
    }

    public static void hello(Cash cash, Users user,LRUCache lruCash) {
        int x = 0;
        Scanner in = new Scanner(System.in);
        String searchName;
        System.out.println("Добро пожаловать в базу данных! ");
        System.out.println("Для добавления пользователя нажмие  - 1 ");
        System.out.println("Для получения данных из базы нажмите  - 2");
        System.out.println("Для выхода - 3");

        while (true) {
            if (x > 0) {
                System.out.println();
                System.out.println("Добавление - 1");
                System.out.println("Поиск - 2");
                System.out.println("Выход - 3");
            }
            int num = in.nextInt();
            if (num == 1) {
                user.scan();
                cash.addUserInWHM(user.userName, user.age);
                lruCash.addUserInLHM(user.userName,user.age);


                user.addUserInFile();
                System.out.println("Новый пользователь успешно добавлен!");
                cash.printSize();
                lruCash.printSize();
            } else if (num == 2) {
                System.out.println("ВВедите имя пользователя:  ");
                in.nextLine();
                searchName = in.nextLine();
                System.out.println("Поиск  " + searchName);
                if (cash.searchUserWHM(searchName)) {

                } else {
                    user.searchUserInFile(searchName);
                }
                System.out.println();
            } else {
                break;
            }
            x = 1;
        }
    }

}