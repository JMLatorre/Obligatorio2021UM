package TADs.LinkedList;

public class Nodo <T extends Comparable<T>>{
    private T value;
    private Nodo siguiente;

    public Nodo(T value)
    {
        this.value=value;
        siguiente=null;
    }

    public T getValue()
    {
        return value;
    }

    public void setValue(T nuevoValue)
    {
        value=nuevoValue;
    }

    public Nodo getSiguiente()
    {
        return siguiente;
    }

    public void setSiguiente(Nodo nuevoSiguiente)
    {
        siguiente=nuevoSiguiente;
    }
}
