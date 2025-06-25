package may19;
import java.util.*;


public class ItertaorAndEnumarator {
	
	
	    public static void main(String[] args) {
	        Vector<String> vector = new Vector<>();
	        vector.add("A");
	        vector.add("B");
	        vector.add("C");

	        // Using Enumeration
	        Enumeration<String> enumeration = vector.elements();
	        System.out.println("Using Enumeration:");
	        while (enumeration.hasMoreElements()) {
	            System.out.println(enumeration.nextElement());
	        }

	        // Using Iterator
	        Iterator<String> iterator = vector.iterator();
	        System.out.println("Using Iterator:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}



