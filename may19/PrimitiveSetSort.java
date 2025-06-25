package may19;

import java.util.Set;
import java.util.TreeSet;

public class PrimitiveSetSort {
	 public static void main(String[] args) {
	        Set<Integer> set = new TreeSet<>();
	        set.add(5);
	        set.add(3);
	        set.add(8);
	        set.add(3); // duplicate
	        set.add(1);
	        set.add(5); // duplicate

	        System.out.println("Sorted Set Elements:");
	        for (Integer num : set) {
	            System.out.println(num);
	        }
	    }
	}


