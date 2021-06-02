package TADs.ArbolBCastMember;

import Clases.CastMember;

public class Node {
    private String key;
    private CastMember data;
    private Node leftChild;
    private Node rightChild;

    public Node(String key, CastMember data) {
        this.key = key;
        this.data = data;
        leftChild=null;
        rightChild=null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CastMember getData() {
        return data;
    }

    public void setData(CastMember data) {
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
