package Cash;


import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache extends LinkedHashMap<String, Integer> {
    private int maxSize;
    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.maxSize = capacity;
    }

    //return -1 if miss
    public int get(Users.userName) {
        Integer v = super.get(Users.userName);
        return v == null ? -1 : v;
    }

    public void put(Users.userName,Users.age) {
        super.put(Users.userName, Users.age);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return this.size() > maxSize; //must override it if used in a fixed cache
    }
}


    final int MAX_CAPACITY = 1000;
    Map<K, V> lruCache = new LinkedHashMap<K, V>(MAX_CAPACITY, 0.75f, true){
        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > MAX_CAPACITY;
        }
    };