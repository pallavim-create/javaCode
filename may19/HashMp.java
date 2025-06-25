package may19;


	import java.util.HashMap;
	import java.util.Map;

	public class HashMp {
	    public static void main(String[] args) {
	        HashMap<String, String> map = new HashMap<>();
	        map.put("101", "Alice");
	        map.put("102", "Bob");

	        for (Map.Entry<String, String> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }
	}


