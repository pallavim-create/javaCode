package may19;
import java.util.*;

public class PrimitiveToArryList {
	

	public class PrimitiveToArrayList {
	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(10); // Autoboxed to Integer
	        numbers.add(20);
	        numbers.add(30);

	        // Using for loop
	        for (int i = 0; i < numbers.size(); i++) {
	            System.out.println(numbers.get(i));
	        }

	        // Using Iterator
	        Iterator<Integer> it = numbers.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }
	}

}
