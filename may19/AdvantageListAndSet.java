package may19;
import java.util.*;

class Product {
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product p = (Product) o;
        return id == p.id && name.equals(p.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class AdvantageListAndSet {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Book"));
        productList.add(new Product(2, "Pen"));
        productList.add(new Product(1, "Book")); // duplicate

        Set<Product> productSet = new HashSet<>(productList);

        System.out.println("List (allows duplicates):");
        for (Product p : productList) System.out.println(p);

        System.out.println("\nSet (removes duplicates):");
        for (Product p : productSet) System.out.println(p);
    }
}


