package may19;

public class Utility {

	    public <T> void printArray(T[] array) {
	        for (T item : array) {
	            System.out.print(item + " ");
	        }
	        System.out.println();
	    }
	}

	class GenericMethodDemo {
	    public static void main(String[] args) {
	        Utility util = new Utility();
	        Integer[] intArray = {1, 2, 3};
	        String[] strArray = {"A", "B", "C"};

	        util.<Integer>printArray(intArray);
	        util.<String>printArray(strArray);
	    }
	}



