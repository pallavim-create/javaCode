package may19;
import java.util.*;

public class HashMapWithoutKeys {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 85);
        marks.put("Bob", 90);
        marks.put("Charlie", 78);

        System.out.println("Values in Map:");
        for (Integer value : marks.values()) {
            System.out.println(value);
        }
    }
}


