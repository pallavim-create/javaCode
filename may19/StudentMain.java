package may19;


	import java.util.*;

	class Student {
	    int id;
	    String name;

	    Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public String toString() {
	        return "ID: " + id + ", Name: " + name;
	    }
	}

	public class StudentMain {
	    public static void main(String[] args) {
	        ArrayList<Student> students = new ArrayList<>();
	        students.add(new Student(1, "Alice"));
	        students.add(new Student(2, "Bob"));

	        // Using for loop
	        for (int i = 0; i < students.size(); i++) {
	            System.out.println(students.get(i));
	        }

	        // Using Iterator
	        Iterator<Student> it = students.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }
	}



