package TADs.LinkedList;

import TADs.Queue.EmptyQueueException;
import TADs.Queue.MyQueue;
import TADs.Stack.EmptyStackException;
import TADs.Stack.MyStack;

public class ListaEnlazada<T extends Comparable<T>> implements Lista<T>, MyStack<T>, MyQueue<T> {
    private Nodo primero;

    public ListaEnlazada() {
        primero = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo nuevoPrimero) {
        primero = nuevoPrimero;
    }

    @Override
    public void add(T value) {

    }

    @Override
    public void remove(int position) {
        int contador = 0;
        Nodo presente = primero;
        Nodo pasado = null;
        while(presente != null && contador < position)
        {
            pasado = presente;
            presente = presente.getSiguiente();
            contador++;
        }

        if(presente != null) {
            if(pasado != null) {
                pasado.setSiguiente(presente.getSiguiente());
            }
            else{
                primero = primero.getSiguiente();//Se desea eliminar el primer nodo
            }
        }


    }

    @Override
    public Nodo get(int position) {
        if(position >= 0) {
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
    public boolean exist(T value) {
        Nodo aux = primero;

        while(aux != null && !aux.getValue().equals(value)) {

            aux = aux.getSiguiente();
        }

        return aux != null;
    }

    @Override
    public void addFirst(T value) {
        Nodo nuevo = new Nodo(value);
        nuevo.setSiguiente(primero);
        primero = nuevo;
    }

    @Override
    public void addLast(T value) {
        Nodo aux = primero;
        Nodo nuevo = new Nodo(value);
        if(primero != null) {
            while (aux.getSiguiente() != null) {

                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        else{
            primero = nuevo;
        }
    }

    @Override
    public void enqueue(T valor) {

    }

    @Override
    public void dequeque() throws EmptyQueueException {

    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void pop() throws EmptyStackException {

    }

    @Override
    public T top() throws EmptyStackException {
        return null;
    }

    @Override
    public void push(T valor) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void makeEmpty() throws EmptyStackException {

    }
}
