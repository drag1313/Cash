package Cash;


import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache extends LinkedHashMap<String, Integer> {
    private int maxSize;

    LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.maxSize = capacity;
    }

    void printSize() {
        int size = LRUCache.size();
        System.out.println("Размер LinkedHashMap :" + size);
        System.out.println();
    }

    boolean searchUserWHM(String userName) {
        if (LRUCache.containsKey(new String(userName))) {
            String get = String.valueOf(LRUCache.get(new String(userName)));
            System.out.printf("Возраст пользователя %s : %s лет  ", userName, get);
            return true;
        } else {
            System.out.println("Данный пользователь в LRU-кеше не обнаружен.");
            System.out.println("Поиск в файле");
            return false;
        }
    }

    void addUserInLHM(String userName, int age) {
        LRUCache.put(userName, age);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
        return this.size() > maxSize;
    }
}

