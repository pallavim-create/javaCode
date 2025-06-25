package may19;
import java.util.*;

class Employee6 {
    int id;
    String name;

    Employee6(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Must override equals() and hashCode()
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee6)) return false;
        Employee6 e = (Employee6) o;
        return id == e.id && name.equals(e.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class EmployeeAsKey {
    public static void main(String[] args) {
        HashMap<Employee6, String> map = new HashMap<>();
        map.put(new Employee6(1, "Alice"), "HR");
        map.put(new Employee6(2, "Bob"), "IT");
        map.put(new Employee6(1, "Alice"), "Finance"); // Duplicate key (same ID and name)

        for (Map.Entry<Employee6, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

