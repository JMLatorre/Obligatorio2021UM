package TADs.Hash;

public class HashImpl<K,V> implements MyHash<K, V> {

    Entry[] arrayHash;
    int size;

    public HashImpl(int size){
        this.size = size;
        arrayHash = new Entry[size];
        init_hash_array(size);
    }

    private void init_hash_array(int size){
        for (int i = 0; i < size; i++){
            arrayHash[i] = new Entry();
        }
    }

    private int getHash(K key){
        return 0; //Ver funcion hash a usar.
    }

    @Override
    public void put(K key, V value) {

        int hashIndex = getHash(key);
        Entry arrayValue = arrayHash[hashIndex];
        Entry newEntry = new Entry(key, value);
        newEntry.next = arrayValue.next;
        arrayValue.next = newEntry;
    }

    public V get(K key){

        V value = null;
        int hashIndex = getHash(key);
        Entry arrayValue = arrayHash[hashIndex];
        while(arrayValue != null){
            if (arrayValue.getKey() == key){
                value = (V) arrayValue.getValue();
                break;
            }
            arrayValue = arrayValue.getNext();
        }

        return value;
    }

    @Override
    public boolean contains(K key) {
        return false;
    }

    @Override
    public void remove(K key) {

    }
}
