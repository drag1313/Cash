package Cash;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Cash {
    private Map<String, Integer> hm = new WeakHashMap<>();

    void addUserInWHM(String userName, int age) {
        hm.put(userName, age);
    }

    void printSize() {
        Integer size = hm.size();
        System.out.println("Размер WeakHashMap :" + size);
        System.out.println();
    }

    boolean searchUserWHM(String userName) {
        if (hm.containsKey(new String(userName))) {
            String get = String.valueOf(hm.get(new String(userName)));
            System.out.printf("Возраст пользователя %s : %s лет  ", userName, get);
            return true;
        } else {
            System.out.println("Данный пользователь в кеше не обнаружен.");
            System.out.println("Поиск в файле");
            return false;
        }
    }
}
