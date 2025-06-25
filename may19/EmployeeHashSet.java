package may19;


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Objects;

	class Employee {
	    int id;
	    String name;

	    public Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    // hashCode and equals are overridden for proper key comparison
	    @Override
	    public int hashCode() {
	        return Objects.hash(id, name);
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof EmployeeHashSet)) return false;
	        EmployeeHashSet emp = (EmployeeHashSet) o;
	        return id == emp.id && name.equals(emp.name);
	    }

	    @Override
	    public String toString() {
	        return id + ": " + name;
	    }
	}

	public class EmployeeHashSet {
		
	    public Object name;

		public static void main(String[] args) {
	        Map<Employee, String> map = new HashMap<>();
	        map.put(new Employee(1, "John"), "Manager");
	        map.put(new Employee(2, "Jane"), "Developer");

	        for (Map.Entry<Employee, String> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }
	}



