package TADs.List;

public class Nodo {
    private Object value;
    private Nodo siguiente;

    public Nodo(Object value)
    {
        this.value=value;
        siguiente=null;
    }

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object nuevoValue)
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
