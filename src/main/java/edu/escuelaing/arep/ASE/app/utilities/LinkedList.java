package edu.escuelaing.arep.ASE.app.utilities;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;



    public LinkedList () {
        size=0;
    }

    public void add(T value) {
        Node<T> newNode;
        if(size==0){
            newNode= new Node<>(value,null,null);
            this.head=newNode;
        }
        else{
            newNode=new Node<>(value,null,tail);
            tail.setNext(newNode);
        }
        this.tail=newNode;
        size++;
    }

    public void remove(T element){
        if(head!=null && head.getValue().equals(element)){
            removeHead();
        }
        else if (tail!=null && tail.getValue().equals(element)){
            removeTail();
        }
        else {
            Node<T> current =head;
            while (current!=null){
                if(current.getValue().equals(element)){
                    Node<T> prev=current.getPrev();
                    Node<T> next=current.getNext();
                    prev.setNext(next);
                    next.setPrev(prev);
                    size--;
                }
                current=current.getNext();
            }
        }
    }

    public Node<T> getHead() {
        return head;
    }
    public Node<T> getTail() {
        return tail;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>(this);
    }

    public int size() {
        return this.size;
    }

    private void removeHead(){
        if(size==1){
            head=null;
            tail=null;
        }
        else {
            Node<T>second=head.getNext();
            second.setPrev(null);
            head=second;
        }
        size--;
    }
    private void removeTail(){
        if(size==1){
            head=null;
            tail=null;
        }
        else {
            Node<T>prevTail=tail.getPrev();
            prevTail.setNext(null);
            tail=prevTail;
        }
        size--;

    }
}
