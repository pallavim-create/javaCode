package may19;
import java.util.*;

class Student2 implements Comparable<Student2> {
    int id;
    String name;

    Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student2 s) {
        return this.id - s.id; // Sort by ID
    }

    public String toString() {
        return id + " " + name;
    }
}

class NameComparator implements Comparator<Student2> {
    public int compare(Student2 s1, Student2 s2) {
        return s1.name.compareTo(s2.name); // Sort by name
    }
}

public class SortStudents {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        list.add(new Student2(2, "John"));
        list.add(new Student2(1, "Alice"));

        System.out.println("Sorted by ID (Comparable):");
        Collections.sort(list);
        for (Student2 s : list) System.out.println(s);

        System.out.println("\nSorted by Name (Comparator):");
        Collections.sort(list, new NameComparator());
        for (Student2 s : list) System.out.println(s);
    }
}


