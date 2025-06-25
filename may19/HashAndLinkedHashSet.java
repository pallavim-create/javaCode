package may19;
import java.util.*;

public class HashAndLinkedHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");

        linkedHashSet.addAll(hashSet);

        System.out.println("HashSet (unordered):");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        System.out.println("\nLinkedHashSet (insertion order):");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }
}

