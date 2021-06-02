package TADs.List;

public class ListaEnlazada implements Lista {
    private Nodo primero;

    public ListaEnlazada()
    {
        primero=null;
    }

    public Nodo getPrimero()
    {
        return primero;
    }

    public void setPrimero(Nodo nuevoPrimero)
    {
        primero=nuevoPrimero;
    }

    @Override
    public void add(Object value) {

    }

    @Override
    public void remove(int position) {
        int contador=0;
        Nodo presente=primero;
        Nodo pasado=null;
        while(presente!=null && contador<position)
        {
            pasado=presente;
            presente=presente.getSiguiente();
            contador++;
        }

        if(presente!=null)
        {
            if(pasado!=null) {
                pasado.setSiguiente(presente.getSiguiente());
            }
            else{
                primero=primero.getSiguiente();//Se desea eliminar el primer nodo
            }
        }


    }

    @Override
    public Object get(int position) {
        if(position>=0) {
            Nodo aux = primero;
            int pos = 0;
            while (aux != null && pos < position) {
                pos++;
                aux = aux.getSiguiente();
            }
            return aux;
        }
        else{
            return null;
        }
    }

    @Override
    public boolean exist(Object value) {
        Nodo aux=primero;

        while(aux!=null && !aux.getValue().equals(value))
        {

            aux=aux.getSiguiente();
        }

        return aux!=null;
    }

    @Override
    public void addFirst(Object value) {
        Nodo nuevo=new Nodo(value);
        nuevo.setSiguiente(primero);
        primero=nuevo;
    }

    @Override
    public void addLast(Object value) {
        Nodo aux=primero;
        Nodo nuevo=new Nodo(value);
        if(primero!=null) {
            while (aux.getSiguiente() != null) {

                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        else{
            primero=nuevo;
        }
    }
}
