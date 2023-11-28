public class MyQueue<T> {
    private final MyLinkedList<T> myLinkedList = new MyLinkedList<>();

    public void add(T data) {
        myLinkedList.add(data);
    }

    public T poll() {
        if(myLinkedList.size==0) return null;
        T data = myLinkedList.get(0);
        myLinkedList.delete(0);
        return data;
    }

    public int size() {
        return myLinkedList.size;
    }
}
