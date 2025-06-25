package may19;
import java.util.*;

public class DifferenceInLists {
	


	    public static void main(String[] args) {
	        // ArrayList Example
	        List<String> arrayList = new ArrayList<>();
	        arrayList.add("A");
	        arrayList.add("B");
	        arrayList.add("C");
	        System.out.println("ArrayList: " + arrayList);

	        // Vector Example (thread-safe)
	        List<String> vector = new Vector<>();
	        vector.add("A");
	        vector.add("B");
	        vector.add("C");
	        System.out.println("Vector: " + vector);

	        // LinkedList Example
	        List<String> linkedList = new LinkedList<>();
	        linkedList.add("A");
	        linkedList.add("B");
	        linkedList.add("C");
	        System.out.println("LinkedList: " + linkedList);

	        // Access element at index 1
	        System.out.println("ArrayList get(1): " + arrayList.get(1));
	        System.out.println("Vector get(1): " + vector.get(1));
	        System.out.println("LinkedList get(1): " + linkedList.get(1));

	        // Remove element at index 1
	        arrayList.remove(1);
	        vector.remove(1);
	        linkedList.remove(1);
	        System.out.println("After removing index 1:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("Vector: " + vector);
	        System.out.println("LinkedList: " + linkedList);

	        // Demonstrate iteration
	        System.out.print("Iterating LinkedList: ");
	        for (String s : linkedList) {
	            System.out.print(s + " ");
	        }
	        System.out.println();

	        // Demonstrate LinkedList as Queue
	        LinkedList<String> queue = new LinkedList<>();
	        queue.add("First");
	        queue.add("Second");
	        queue.add("Third");
	        System.out.println("LinkedList as Queue (remove): " + queue.remove());
	        System.out.println("LinkedList after remove: " + queue);
	    }
	}



