package LinkedList;

public class NodeClass<T> {
    T data;
    NodeClass<T> next;
    NodeClass(T data){
        this.data = data;
        next = null;
    }
}
