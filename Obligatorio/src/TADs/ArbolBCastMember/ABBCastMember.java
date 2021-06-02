package TADs.ArbolBCastMember;

import Clases.CastMember;

public class ABBCastMember implements MyTree{
    private Node raiz;

    private Node findAux(Node raiz,String key)
    {
        if(raiz==null)
        {
            return null;
        }
        else{
            if(raiz.getKey().equalsIgnoreCase(key))
            {
                return raiz;
            }
            else{
                if(raiz.getKey().compareTo(key)<0)
                {
                    return findAux(raiz.getRightChild(),key);
                }
                else{
                    return findAux(raiz.getLeftChild(),key);
                }
            }
        }

    }

    @Override
    public Node find(String key) {
        return findAux( raiz, key);
    }

    private Node insertAux(Node raiz,String id,CastMember idata)
    {
        if(raiz==null)
        {
            raiz=new Node(id,idata);

        }
        else{
            if(raiz.getKey().compareTo(id)>0)
            {
                raiz.setLeftChild(insertAux(raiz.getLeftChild(),id,idata));
            }
            else{
                raiz.setRightChild(insertAux(raiz.getRightChild(),id,idata));
            }
        }
        return raiz;
    }

    @Override
    public void insert(String id, CastMember value) {
        raiz=insertAux( raiz, id, value);
    }

    public Node borrarMayor(Node raiz)
    {
        if(raiz.getRightChild()!=null)
        {
            return borrarMayor(raiz.getRightChild());

        }
        else{
            Node aux=raiz;
            raiz.setRightChild(raiz.getLeftChild());
            return aux;
        }
    }
    private Node removeAux(Node raiz,String key)
    {
        if(raiz==null)
        {
            return null;
        }
        else{
            if(raiz.getKey().equalsIgnoreCase(key))
            {
                if(raiz.getRightChild()==null && raiz.getLeftChild()==null)
                {
                    raiz=null;
                }
                else
                if(raiz.getLeftChild()==null)
                {
                    raiz=raiz.getRightChild();
                }
                else{
                    if(raiz.getRightChild()==null)
                    {
                        raiz=raiz.getLeftChild();
                    }
                    else{
                        Node nodoMayor=borrarMayor(raiz.getLeftChild());
                        raiz.setKey(nodoMayor.getKey());
                        raiz.setData(nodoMayor.getData());
                    }
                }
                return raiz;
            }
            else{
                if(raiz.getKey().compareTo(key)<0)
                {
                    return removeAux(raiz.getRightChild(),key);
                }
                else{
                    return removeAux(raiz.getLeftChild(),key);
                }
            }
        }

    }
    @Override
    public void delete(String id) {
        raiz=removeAux(raiz,id);

    }



}
