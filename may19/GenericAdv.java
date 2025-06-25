package may19;
import java.util.*;

public class GenericAdv {
	

	
	    public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("Hello");
	        // list.add(10); // Compile-time error

	        for (String str : list) {
	            System.out.println(str); // Safe and no cast needed
	        }
	    }
	}


