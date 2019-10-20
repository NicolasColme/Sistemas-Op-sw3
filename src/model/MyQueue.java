package model;

public class MyQueue <T>{
    protected Node<T> first;
    protected Node<T> last;

    public MyQueue() {
        this.first = this.last = null;
    }
    
    public boolean isEmpty(){
        return this.first == null;
    }
    
    public void put(T info){
        if(isEmpty()){
            this.first = this.last = new Node<>(info);
        }else{
            this.last.next = new Node<>(info);
            this.last = this.last.next;
        }
    }
    
    public T get() {
        T aux = null;
        if (!isEmpty()) {
            aux = first.info;
            first = first.next;
        }
        return aux;
    }
}
