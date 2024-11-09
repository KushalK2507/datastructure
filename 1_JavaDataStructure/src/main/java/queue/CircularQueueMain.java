package queue;

public class CircularQueueMain {

    public static void main(String[] args){

        CircularQueueUsingArray circularQueueUsingArray = new CircularQueueUsingArray(4);
        System.out.println("Queue is Empty: "+circularQueueUsingArray.isEmpty());
        System.out.println("Queue is Full: "+circularQueueUsingArray.isFull());
        circularQueueUsingArray.offer(2);
        circularQueueUsingArray.offer(4);
        circularQueueUsingArray.offer(6);
        circularQueueUsingArray.offer(10);
        circularQueueUsingArray.displayQueue();
        System.out.println("Queue is Empty: "+circularQueueUsingArray.isEmpty());
        System.out.println("Queue is Full: "+circularQueueUsingArray.isFull());
        System.out.println("Peek Element: "+circularQueueUsingArray.peek());
        System.out.println("Polled Element: "+circularQueueUsingArray.poll());
        circularQueueUsingArray.displayQueue();
        circularQueueUsingArray.offer(25);
        circularQueueUsingArray.displayQueue();
        System.out.println("Peek Element: "+circularQueueUsingArray.peek());
        System.out.println("Queue is Empty: "+circularQueueUsingArray.isEmpty());
        System.out.println("Queue is Full: "+circularQueueUsingArray.isFull());

        System.out.println("Queue Using Linked List");



    }
}
