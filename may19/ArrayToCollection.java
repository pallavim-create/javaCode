package may19;
import java.util.*;

public class ArrayToCollection {
	

	
	    public static <T> Collection<T> convertArrayToCollection(T[] array) {
	        Collection<T> collection = new ArrayList<>();
	        Collections.addAll(collection, array);
	        return collection;
	    }

	    public static void main(String[] args) {
	        String[] array = {"Java", "Python", "C++"};
	        Collection<String> collection = convertArrayToCollection(array);

	        for (String item : collection) {
	            System.out.println(item);
	        }
	    }
	}



