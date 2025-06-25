package may19;
import java.util.HashSet;
import java.util.Objects;

class NumberWrapper {
    private int number;

    public NumberWrapper(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    // Override equals() to compare by value
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumberWrapper)) return false;
        NumberWrapper that = (NumberWrapper) o;
        return number == that.number;
    }

    // Override hashCode() to be consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}

public class  PrimitiveHashSet {
    public static void main(String[] args) {
        HashSet<NumberWrapper> set = new HashSet<>();

        set.add(new NumberWrapper(10));
        set.add(new NumberWrapper(20));
        set.add(new NumberWrapper(30));
        set.add(new NumberWrapper(10)); // Duplicate

        System.out.println("Unique elements in HashSet:");
        for (NumberWrapper number : set) {
            System.out.println(number);
        }
    }
}



