package may19;


	import java.util.*;

	public class HashAndTree {
	    public static void main(String[] args) {
	        Set<String> hashSet = new HashSet<>();
	        Set<String> treeSet = new TreeSet<>();

	        hashSet.add("Banana");
	        hashSet.add("Apple");
	        hashSet.add("Mango");

	        treeSet.addAll(hashSet);

	        System.out.println("HashSet (unordered):");
	        for (String fruit : hashSet) {
	            System.out.println(fruit);
	        }

	        System.out.println("\nTreeSet (sorted):");
	        for (String fruit : treeSet) {
	            System.out.println(fruit);
	        }
	    }
	}



