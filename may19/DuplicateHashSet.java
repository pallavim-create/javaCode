package may19;
import java.util.*;

class Student4 {
    int id;
    String name;

    Student4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student4)) return false;
        Student4 s = (Student4) o;
        return id == s.id && name.equals(s.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toString() {
        return id + " " + name;
    }
}

public class DuplicateHashSet {
    public static void main(String[] args) {
        HashSet<Student4> set = new HashSet<>();
        set.add(new Student4(1, "Alice"));
        set.add(new Student4(2, "Bob"));
        set.add(new Student4(1, "Alice")); // Duplicate

        for (Student4 s : set) {
            System.out.println(s);
        }
    }
}



