import java.util.Iterator;

public class MyLinkedList <T> implements Iterable<T>{
    public int size;
    public Node<T> head;

    public MyLinkedList() {
        size = 0;
        head = null;
    }

    public void add(T data) {
        if (head == null) {
            head = new Node<>(null);
            head.next = new Node<>(data);
        } else {
            Node<T> cur = head.next;
            for(int i=0;i<size-1;i++){
                cur = cur.next;
            }
            cur.next = new Node<>(data);
        }
        size++;
    }

    public void add(T data, int index) {
        if(index<0 || index>=size) throw new IndexOutOfBoundsException();
        if(head == null){
                head = new Node<>(null);
                head.next = new Node<>(data);
        } else {
            Node<T> prev = head.next;
            for(int i=0;i<index-1;i++){
                prev = prev.next;
            }
            Node<T> cur = new Node<>(data);
            cur.next = prev.next;
            prev.next = cur;
        }
        size++;
    }

    public T get(int index) {
        Node<T> cur = head.next;
        for(int i=0;i<index;i++){
            cur = cur.next;
        }
        return cur.data;
    }

    public void delete(int index) {
        if(index<0 || index>=size) throw new IndexOutOfBoundsException();
        Node<T> prev = head;
        for(int i=0;i<index;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        size--;
    }

    @Override
    public MyIterator<T> iterator() {
        return new MyIterator<>(head);
    }
}