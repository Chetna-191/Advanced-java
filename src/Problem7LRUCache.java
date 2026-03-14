import java.util.*;

public class Problem7LRUCache {

    private LinkedHashMap<Integer, String> cache;

    public Problem7LRUCache(int capacity) {

        cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > capacity;
            }
        };
    }

    public void put(int key, String value) {
        cache.put(key, value);
    }

    public String get(int key) {
        return cache.getOrDefault(key, "Not Found");
    }

    public void display() {
        System.out.println(cache);
    }

    public static void main(String[] args) {

        Problem7LRUCache lru = new Problem7LRUCache(3);

        lru.put(1, "A");
        lru.put(2, "B");
        lru.put(3, "C");
        lru.get(1);
        lru.put(4, "D");

        lru.display();
    }
}