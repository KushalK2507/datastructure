package queue;

public class QueueMain {

    public static void main(String[] args){

        QueueUsingArray queueArray = new QueueUsingArray(4);
        System.out.println("Queue is Empty: "+queueArray.isEmpty());
        System.out.println("Queue is Full: "+queueArray.isFull());
        queueArray.offer(2);
        queueArray.offer(5);
        queueArray.offer(6);
        queueArray.offer(9);
        System.out.println(queueArray.peek());
        System.out.println(queueArray.poll());
        System.out.println("Queue is Empty: "+queueArray.isEmpty());
        System.out.println("Queue is Full: "+queueArray.isFull());
        queueArray.deleteQueue();
        System.out.println("Queue is Empty: "+queueArray.isEmpty());
        System.out.println("Queue is Full: "+queueArray.isFull());

        System.out.println("Queue is Linked List");
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
        System.out.println("Queue is Empty: "+queueUsingLinkedList.isEmpty());
        queueUsingLinkedList.offer(3);
        queueUsingLinkedList.offer(25);
        queueUsingLinkedList.offer(32);
        queueUsingLinkedList.offer(45);
        System.out.println(queueUsingLinkedList.peek());
        System.out.println(queueUsingLinkedList.poll());
        System.out.println("Queue is Empty: "+queueUsingLinkedList.isEmpty());
        queueUsingLinkedList.deleteQueue();
        System.out.println("Queue is Empty: "+queueUsingLinkedList.isEmpty());

    }
}
