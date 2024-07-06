import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList<E> {
    public void enqueue(E e) {
        addLast(e);
    }

    public E dequeue() {
        return removeFirst();
    }

    public int getSize() {
        return size();
    }

    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        while (queue.getSize() > 0) {
            System.out.println(queue.dequeue());
        }
    }
}
