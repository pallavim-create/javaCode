package may19;
import java.util.*;

class Students implements Comparable<Students> {
    int id;
    String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Students s) {
        return Integer.compare(this.id, s.id); // Sort by ID
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students)) return false;
        Students s = (Students) o;
        return id == s.id && name.equals(s.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class DuplicateSetSort {
    public static void main(String[] args) {
        Set<Students> students = new TreeSet<>();

        students.add(new Students(3, "Alice"));
        students.add(new Students(1, "Bob"));
        students.add(new Students(2, "Charlie"));
        students.add(new Students(1, "Bob")); // duplicate

        System.out.println("Sorted unique students:");
        for (Students s : students) {
            System.out.println(s);
        }
    }
}



