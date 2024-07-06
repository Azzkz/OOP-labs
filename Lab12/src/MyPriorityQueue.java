import java.util.Comparator;
import java.util.PriorityQueue;

public class MyPriorityQueue<E> extends PriorityQueue<E> {
    public MyPriorityQueue(Comparator<? super E> comparator) {
        super(comparator);
    }

    public static void main(String[] args) {
        Comparator<Integer> comparator = (a, b) -> b - a;
        MyPriorityQueue<Integer> queue = new MyPriorityQueue<>(comparator);

        queue.add(10);
        queue.add(20);
        queue.add(15);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
