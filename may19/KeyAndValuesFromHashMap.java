package may19;

import java.util.*;

public class KeyAndValuesFromHashMap{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Alice");
        map.put(101, "Bob");
        map.put(102, "Charlie");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}



