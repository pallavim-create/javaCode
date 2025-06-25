package may19;


import java.util.*;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListComparison {

	public static void main(String[] args) {
		// ArrayList: Dynamic array, not synchronized, faster
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");

		System.out.println("ArrayList: " + arrayList);

		// Vector: Dynamic array, synchronized, slower (legacy class)
		Vector<String> vector = new Vector<>();
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Cherry");

		System.out.println("Vector: " + vector);

		// LinkedList: Doubly linked list, not synchronized, efficient for insertions/deletions
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Cherry");

		System.out.println("LinkedList: " + linkedList);

		//Demonstrating Performance Differences
		//Time taken to add elements
		long startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			arrayList.add("Element " + i);
		}
		long endTime = System.nanoTime();
		System.out.println("Time taken by ArrayList to add 100000 elements: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			vector.add("Element " + i);
		}
		endTime = System.nanoTime();
		System.out.println("Time taken by Vector to add 100000 elements: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.add("Element " + i);
		}
		endTime = System.nanoTime();
		System.out.println("Time taken by LinkedList to add 100000 elements: " + (endTime - startTime) + " ns");

		//Time taken to access elements
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("Time taken by ArrayList to access 100000 elements: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			vector.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("Time taken by Vector to access 100000 elements: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("Time taken by LinkedList to access 100000 elements: " + (endTime - startTime) + " ns");
	}
}



