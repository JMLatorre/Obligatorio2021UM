package TADs.ArbolB;

public interface MyTree<K extends Comparable<K>, T> {
    public Node find(K key);
    public void insert (K newKey, T value);
    public void delete (K key);
}
