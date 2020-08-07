package edu.escuelaing.arep.ASE.app.utilities;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {

    private Node<T> current;

    public LinkedListIterator(LinkedList<T> linkedList) {
        current= linkedList.getHead();
    }

    @Override
    public boolean hasNext() {
        return current!=null;
    }

    @Override
    public T next() {
        T value =current.getValue();
        current=current.getNext();
        return value;
    }
}
