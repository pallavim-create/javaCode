package may19;

import java.util.*;

class Employee7{
    int id;
    String name;
    String location;

    Employee7(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public String toString() {
        return id + " - " + name + " - " + location;
    }
}

public class SortByNameAndLocation {
    public static void main(String[] args) {
        List<Employee7> list = new ArrayList<>();
        list.add(new Employee7(1, "Alice", "Hyderabad"));
        list.add(new Employee7(2, "Bob", "Bangalore"));
        list.add(new Employee7(3, "Charlie", "Chennai"));

        // Sort by name
        list.sort(Comparator.comparing(e -> e.name));
        System.out.println("Sorted by Name:");
        list.forEach(System.out::println);

        // Sort by location
        list.sort(Comparator.comparing(e -> e.location));
        System.out.println("\nSorted by Location:");
        list.forEach(System.out::println);
    }
}


