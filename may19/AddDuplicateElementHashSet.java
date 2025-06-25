package may19;

import java.util.HashSet;

public class  AddDuplicateElementHashSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        boolean isAdded = fruits.add("Apple"); // Duplicate entry

        System.out.println("HashSet elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        if (!isAdded) {
            System.out.println("\n'Duplicate Apple' not added. HashSet ignores duplicates.");
        }
    }
}



