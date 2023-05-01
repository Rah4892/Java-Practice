import java.util.LinkedHashSet;
import java.util.Set;

public class LRUCache {
    static int cacheCapacity = 3;
    public static Set<Integer> cache = new LinkedHashSet<>(cacheCapacity);

    public static void main(String[] args) {
        refer(1);
        refer(2);
        refer(3);
        refer(2);
        refer(4);
        refer(1);
        refer(5);
        System.out.println(cache);
    }

    public static void refer( int page) {
        if(!cache.contains(page)) {
           put(page);
        }
        else{
            cache.remove(page);
            cache.add(page);
        }
    }

    public static void put(int page) {
        if (cache.size() == cacheCapacity) {
            int key = cache.iterator().next();
            cache.remove(key);
        }
        cache.add(page);
    }
}
