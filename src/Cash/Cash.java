package Cash;

import java.util.WeakHashMap;

public class Cash {
    WeakHashMap<String, Integer> hm = new WeakHashMap<String, Integer>();

    void addUserInWHM(String userName, int age) {
        hm.put(userName, age);
    }

    void getSize() {
        Integer size = hm.size();
        System.out.println("Размер WeakHashMap :" + size);
        System.out.println();
    }

    boolean searchUserWHM(String userName) {
        if (hm.containsKey(new String(userName))) {
            String get = String.valueOf(hm.get(new String(userName)));
            System.out.println("Возраст: " + get);
            return true;
        }else {
            System.out.println("Данный пользователь в кеше не обнаружен.");
            System.out.println("Поиск в файле");
            return false;
        }
    }
}
