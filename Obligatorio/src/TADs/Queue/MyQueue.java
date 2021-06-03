package TADs.Queue;

public interface MyQueue<T extends Comparable> {

    void enqueue(T valor);

    void dequeque() throws EmptyQueueException;

    boolean isEmpty();

    boolean contains(T value);

    int size();
}
