package may19;
import java.util.*;

public class ListForwardAndBackWord{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        System.out.println("Forward:");
        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println("\nBackward:");
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
    }
}


