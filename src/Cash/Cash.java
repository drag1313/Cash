package Cash;

import java.util.Map;
import java.util.WeakHashMap;

class Cash {
    private Map<String, Integer> hm = new WeakHashMap<>();

    void addUserInWHM(String userName, int age) {
        hm.put(userName, age);
    }

    void printSize() {
        int size = hm.size();
        System.out.println("Размер WeakHashMap :" + size);
        System.out.println();
    }

    boolean searchUserWHM(String userName) {
        if (hm.containsKey(userName)) {
            String get = String.valueOf(hm.get(userName));
            System.out.printf("Возраст пользователя %s : %s лет  ", userName, get);
            return true;
        } else {
            System.out.println("Данный пользователь в WHM-кеше не обнаружен.");
            System.out.println("Поиск в файле");
            return false;
        }
    }
}
