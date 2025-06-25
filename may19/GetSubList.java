package may19;
import java.util.*;

public class GetSubList {
    public static void main(String[] args) {
        List<String> originalList = Arrays.asList("Java", "Python", "C", "Go", "Rust");
        ArrayList<String> newList = new ArrayList<>();
        newList.addAll(originalList);

        System.out.println("All Elements:");
        System.out.println(newList);

        List<String> subList = newList.subList(1, 4); // index 1 to 3
        System.out.println("Sublist (index 1 to 3):");
        System.out.println(subList);
    }
}


