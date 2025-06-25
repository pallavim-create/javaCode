package may19;


	import java.util.*;

	class Student1 implements Comparable<Student1> {
	    String name;
	    int marks;
	    Student1(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	    }
	    public int compareTo(Student1 s) {
	        return this.marks - s.marks; // Ascending order
	    }
	    public String toString() {
	        return name + ": " + marks;
	    }
	}

	public class ComparableDemo {
	    public static void main(String[] args) {
	        ArrayList<Student1> list = new ArrayList<>();
	        list.add(new Student1("Alice", 90));
	        list.add(new Student1("Bob", 85));
	        list.add(new Student1("Charlie", 95));
	        Collections.sort(list);
	        System.out.println(list);
	    }
	}



