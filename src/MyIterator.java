import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {
    private Node<T> cur;

    public MyIterator (Node<T> head) {
        cur = head;
    }

    @Override
    public boolean hasNext() {
        return cur.next != null;
    }

    @Override
    public T next() {
        if(!hasNext()) throw new NoSuchElementException();
        cur = cur.next;
        return cur.data;
    }
}