package TADs.ClosedHash;

public class ClosedHash<K, V> implements MyHash<K, V> {

    private static final int DEFAULT_SIZE = 10; //Agregar numero default que tenga sentido
    int hashTableSize;
    int hashLoad = 0;
    float loadFactor;

    private ClosedHashEntry[] hashTable;

    public ClosedHash(){
        hashTable = new ClosedHashEntry[DEFAULT_SIZE];
    }

    public ClosedHash(int size, float loadFactor){

        hashTable = new ClosedHashEntry[size];
        this.loadFactor = loadFactor;
        this.hashTableSize = size;
    }

    private int getHash(K key) {

        int intKey = (int) key;
        int hashIndex = intKey % hashTableSize; //Ver funcion hash a usar.
        return hashIndex;
    }

    @Override
    public void put(K key, V value) {

        int hashIndex = getHash(key);
        ClosedHashEntry newEntry = new ClosedHashEntry(key, value);

        if (hashTable[hashIndex] == null){
            hashTable[hashIndex] = newEntry;
            hashLoad++;
        }
        else{
            if (hashTable[hashIndex].isDeleted() == true) {
                hashTable[hashIndex].setKey(key);
                hashTable[hashIndex].setValue(value);
                hashLoad++;
            }
            else{
                for (int i = hashIndex + 1; i <= hashTableSize; i++){
                    if (hashTable[i] == null) {
                        hashTable[i] = newEntry;
                        hashLoad++;
                    }
                    else if (hashTable[i].isDeleted() == true) {
                        hashTable[i].setKey(key);
                        hashTable[i].setValue(value);
                        hashLoad++;
                    }
                    else{
                        rehasing();
                        put(key, value);
                    }
                }
            }
        }
    }

    public void rehasing(){

        if (hashLoad / hashTableSize == loadFactor){//Compara el loadFactor con la carga que tiene el hash
            ClosedHashEntry[] rehashedTable = new ClosedHashEntry[hashTableSize*2];//Agranda al doble el hash
            for (int i = 0; i < hashTableSize; i++){
                rehashedTable[i] = hashTable[i];
            }

        }
    }

    @Override
    public boolean contains(K key) {

        int hashIndex = getHash(key);

        if (hashTable[hashIndex].getKey() == key){
            return true;
        }
        else{
            for (int i = hashIndex + 1; i <= hashTableSize; i++){
                if (hashTable[i].getKey() == key){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void remove(K key) {

        int hashIndex = getHash(key);

        if (hashTable[hashIndex].getKey() == key){
            hashTable[hashIndex].setKey(null);
            hashTable[hashIndex].setValue(null);
        }
        else{
            for (int i = hashIndex + 1; i <= hashTableSize; i++){
                if (hashTable[i].getKey() == key){
                    hashTable[i].setKey(null);
                    hashTable[i].setValue(null);
                }
            }
        }
    }

    public V get(K key){

        int hashIndex = getHash(key);

        if (hashTable[hashIndex].getKey() == key){
            return (V) hashTable[hashIndex].getValue();
        }
        else{
            for (int i = hashIndex + 1; i <= hashTableSize; i++){
                if (hashTable[i].getKey() == key){
                    return (V) hashTable[i].getValue();
                }
            }
        }
        return null;
    }
}
