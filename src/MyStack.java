public class MyStack<T> {
    private final MyLinkedList<T> myLinkedList = new MyLinkedList<>();

    public void push(T data) {
        myLinkedList.add(data);
    }

    public T pop() {
        T data = myLinkedList.get(myLinkedList.size-1);
        myLinkedList.delete(myLinkedList.size-1);
        return data;
    }

    public int size() {
        return myLinkedList.size;
    }
}
