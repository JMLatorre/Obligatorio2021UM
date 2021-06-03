package TADs.ArbolB;

public class Node<K extends Comparable<K>, T> {
    private K key;
    private T data;
    private Node leftChild;
    private Node rightChild;

    public Node(K key, T data) {
        this.key = key;
        this.data = data;
        leftChild=null;
        rightChild=null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
