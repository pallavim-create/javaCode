package may19;


// Generic Class
class Box<T> {
	private T value;

	public void setValue(T value) { 
		this.value = value;
		}
	public T getValue() {
		return value; 
		}
}

// Generic Interface
interface Container<T> {
	void set(T item);
	T get();
}

// Implementation
class MyContainer<T> implements Container<T> {
	private T item;

	public void set(T item) { 
		this.item = item;
}
	public T get() {
		return item; 
		}
}

public class GenericClasses {
	public static void main(String[] args) {
		Box<String> stringBox = new Box<>();
		stringBox.setValue("Hello");
		System.out.println(stringBox.getValue());

		Box<Integer> intBox = new Box<>();
		intBox.setValue(123);
		System.out.println(intBox.getValue());

		Container<Double> doubleContainer = new MyContainer<>();
		doubleContainer.set(3.14);
		System.out.println(doubleContainer.get());
	}
}


