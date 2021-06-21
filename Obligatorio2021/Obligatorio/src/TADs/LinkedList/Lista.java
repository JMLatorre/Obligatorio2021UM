package TADs.LinkedList;

public interface Lista<T extends Comparable<T>> {
    void add(T value);
    void remove(int position );
    Nodo get(int position);
    boolean exist(T value);
    void addFirst(T value);
    void addLast(T value);

}
