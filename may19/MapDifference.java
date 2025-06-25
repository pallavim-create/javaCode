package may19;
import java.util.*;

public class MapDifference {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> hashtable = new Hashtable<>();

        int[] keys = {3, 1, 2};

        for (int key : keys) {
            hashMap.put(key, "Hash" + key);
            linkedHashMap.put(key, "Linked" + key);
            hashtable.put(key, "Table" + key);
        }

        System.out.println("HashMap (unordered): " + hashMap);
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap);
        System.out.println("Hashtable (unordered, thread-safe): " + hashtable);
    }
}



