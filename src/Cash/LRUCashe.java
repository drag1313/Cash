package Cash;


import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache extends LinkedHashMap<String, Integer> {
    private int maxSize;
    private LinkedHashMap<String, Integer> LRU = new LinkedHashMap<>();

    LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.maxSize = capacity;
    }

    void printSize() {
        int size = LRU.size();
        System.out.println("Размер LinkedHashMap :" + size);
        System.out.println();
    }

    boolean searchUserLHM(String userName) {
        if (LRU.containsKey(userName)) {
            String get = String.valueOf(LRU.get(userName));
            System.out.printf("Возраст пользователя %s : %s лет  ", userName, get);
            return true;
        } else {
            System.out.println("Данный пользователь в LRU-кеше не обнаружен.");
            System.out.println("Поиск в файле");
            return false;
        }
    }

    void addUserInLHM(String userName, int age) {
        LRU.put(userName, age);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
        return this.size() > maxSize;
    }
}

