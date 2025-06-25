package may19;
import java.util.*;

public class HashMapIterationTec {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("Using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUsing keySet:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("\nUsing values:");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        System.out.println("\nUsing forEach (lambda):");
        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}



