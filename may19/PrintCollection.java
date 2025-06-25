package may19;
import java.util.*;

public class PrintCollection {
	

	
	    public static void main(String[] args) {
	        Collection<String> collection = new ArrayList<>();
	        collection.add("Apple");
	        collection.add("Banana");
	        collection.add("Cherry");

	        // Method 1: Enhanced for loop
	        for (String item : collection) {
	            System.out.println(item);
	        }

	        // Method 2: Using Iterator
	        Iterator<String> it = collection.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }
	}



