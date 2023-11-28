public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            myLinkedList.add(i * 2);
        }

        System.out.println("조회");
        for (int i = 0; i < myLinkedList.size; i++) {
            System.out.print(myLinkedList.get(i)+" ");
        }
        System.out.println();

        System.out.println("삭제");
        myLinkedList.delete(5);
        for (int i = 0; i < myLinkedList.size; i++) {
            System.out.print(myLinkedList.get(i)+" ");
        }
        System.out.println();

        System.out.println("iterator 생성 후 forEach");
        MyIterator<Integer> myIterator = myLinkedList.iterator();
        myIterator.forEachRemaining(el -> System.out.print(el+" "));
        System.out.println();

        System.out.println("queue");
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(1); myQueue.add(2); myQueue.add(3);
        for (int i = 0; i < 3; i++) {
            System.out.print(myQueue.poll()+" ");
        }
        System.out.println();

        System.out.println("stack");
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1); myStack.push(2); myStack.push(3);
        for (int i = 0; i < 3; i++) {
            System.out.print(myStack.pop()+" ");
        }
    }
}