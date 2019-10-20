package model;

public class Node <T>{
    
    protected Node<T> next;
    protected T info;
    
    public Node(T info){
        this.info = info;
    }
    
    public Node(T info, Node next){
        this.next = next;
        this.info = info;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getInfo() {
        return info;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
