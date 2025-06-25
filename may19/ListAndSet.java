package may19;
import java.util.*;

class Employee1 {
    int id;
    String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee1)) return false;
        Employee1 e = (Employee1) o;
        return id == e.id && name.equals(e.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class  ListAndSet{
    public static void main(String[] args) {
        List<Employee1> empList = new ArrayList<>();
        empList.add(new Employee1(1, "Alice"));
        empList.add(new Employee1(2, "Bob"));
        empList.add(new Employee1(1, "Alice")); // duplicate allowed

        Set<Employee1> empSet = new HashSet<>(empList); // duplicates removed

        System.out.println("List (allows duplicates):");
        for (Employee1 e : empList) {
            System.out.println(e);
        }

        System.out.println("\nSet (unique only):");
        for (Employee1 e : empSet) {
            System.out.println(e);
        }
    }
}


