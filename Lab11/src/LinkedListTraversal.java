import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTraversal {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }

        long startTime = System.nanoTime();
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.nanoTime();
        long durationIterator = endTime - startTime;
        System.out.println("Time taken using iterator: " + durationIterator + " nanoseconds");

        startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.nanoTime();
        long durationGet = endTime - startTime;
        System.out.println("Time taken using get(index): " + durationGet + " nanoseconds");
    }
}
