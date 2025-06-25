package may19;


	
	class Calculator {
	    // Method accepts only subclasses of Number
	    public <T extends Number> void showDoubleValue(T num) {
	        double result = num.doubleValue() * 2;
	        System.out.println("Double value: " + result);
	    }
	}

	public class BoundedType {
	    public static void main(String[] args) {
	        Calculator calc = new Calculator();
	        calc.showDoubleValue(10);       // Integer
	        calc.showDoubleValue(5.5f);     // Float
	        // calc.showDoubleValue("Text"); // Compile-time error
	    }
	}


	


