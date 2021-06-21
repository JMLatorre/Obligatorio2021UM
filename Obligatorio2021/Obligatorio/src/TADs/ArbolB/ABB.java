package TADs.ArbolB;

public class ABB<K extends Comparable<K>, T> implements MyTree<K,T>{
    private Node raiz;

    private Node findAux(Node raiz, K key)
    {
        if(raiz == null)
        {
            return null;
        }
        else{
            if(raiz.getKey().equals(key))
            {
                return raiz;
            }
            else{
                if(raiz.getKey().compareTo(key) < 0)
                {
                    return findAux(raiz.getRightChild(), key);
                }
                else{
                    return findAux(raiz.getLeftChild(), key);
                }
            }
        }

    }

    @Override
    public Node find(K key) {
        return findAux(raiz, key);
    }

    private Node insertAux(Node raiz, K newkey, T data) {
        if(raiz==null)
        {
            raiz=new Node(newkey, data);

        }
        else{
            if(raiz.getKey().compareTo(newkey) > 0)
            {
                raiz.setLeftChild(insertAux(raiz.getLeftChild(), newkey, data));
            }
            else{
                raiz.setRightChild(insertAux(raiz.getRightChild(), newkey, data));
            }
        }
        return raiz;
    }

    @Override
    public void insert(K key, T value) {
        raiz=insertAux( raiz, key, value);
    }

    public Node borrarMayor(Node raiz)
    {
        if(raiz.getRightChild() != null)
        {
            return borrarMayor(raiz.getRightChild());

        }
        else{
            Node aux = raiz;
            raiz.setRightChild(raiz.getLeftChild());
            return aux;
        }
    }
    private Node removeAux(Node raiz, K key)
    {
        if(raiz == null)
        {
            return null;
        }
        else{
            if(raiz.getKey().equals(key)) {
                if(raiz.getRightChild() == null && raiz.getLeftChild() == null) {
                    raiz = null;
                }
                else if(raiz.getLeftChild() == null) {
                    raiz = raiz.getRightChild();
                }
                else{
                    if(raiz.getRightChild() == null) {
                        raiz = raiz.getLeftChild();
                    }
                    else{
                        Node nodoMayor = borrarMayor(raiz.getLeftChild());
                        raiz.setKey(nodoMayor.getKey());
                        raiz.setData(nodoMayor.getData());
                    }
                }
                return raiz;
            }
            else{
                if(raiz.getKey().compareTo(key) < 0)
                {
                    return removeAux(raiz.getRightChild(), key);
                }
                else{
                    return removeAux(raiz.getLeftChild(), key);
                }
            }
        }

    }
    @Override
    public void delete(K key) {
        raiz=removeAux(raiz,key);
    }
}
