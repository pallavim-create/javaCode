package may19;
import java.util.*;


public class CollectionToArray {
	
	
	    public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("Java");
	        list.add("Python");
	        list.add("C++");

	        // Convert to array
	        String[] array = list.toArray(new String[0]);

	        // Print the array
	        for (String item : array) {
	            System.out.println(item);
	        }
	    }
	}



