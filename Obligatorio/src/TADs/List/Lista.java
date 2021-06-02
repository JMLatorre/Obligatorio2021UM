package TADs.List;

public interface Lista {
    void add(Object value);
    void remove(int position );
    Object get(int position);
    boolean exist(Object value);
    void addFirst(Object value);
    void addLast(Object value);

}
