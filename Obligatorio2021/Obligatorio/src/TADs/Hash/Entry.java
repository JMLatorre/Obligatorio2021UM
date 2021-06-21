package TADs.Hash;

public class Entry<K, V> {

    K key;
    V value;
    Entry next;

    public Entry(K key, V value){
        this.key = key;
        this.value = value;
        next = null;
    }

    public Entry(){
        next = null;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Entry getNext() {
        return next;
    }
}
