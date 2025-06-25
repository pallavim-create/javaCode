package may19;
import java.util.*;


public class GenericProblem {

	
	    public static void main(String[] args) {
	        List list = new ArrayList();
	        list.add("Hello");
	        list.add(10); // No type safety

	        for (Object obj : list) {
	            String str = (String) obj; // ClassCastException at runtime
	            System.out.println(str);
	        }
	    }
	}



