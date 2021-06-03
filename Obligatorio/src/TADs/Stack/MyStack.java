package TADs.Stack;

public interface MyStack<T extends Comparable<T>> {

    void pop () throws EmptyStackException;

    T top() throws EmptyStackException;

    void push(T valor);

    boolean isEmpty();

    void makeEmpty() throws EmptyStackException;
}
