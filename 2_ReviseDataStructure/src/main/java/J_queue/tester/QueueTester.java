package J_queue.tester;

import J_queue.A_QueueUsingArray;
import J_queue.B_QueueUsingList;
import J_queue.C_BinaryNumberUsingQueue;
import J_queue.D_QueueUsing2Stack;

public class QueueTester {

    public static void main(String[] args) {

        System.out.println("Queue Using Arrays");
        queueUsingArray();
        System.out.println("----------------------------");

        System.out.println("Queue Using List");
        queueUsingList();
        System.out.println("----------------------------");

        System.out.println("Binary Number Using Queue");
        binaryNumber();
        System.out.println("----------------------------");

        System.out.println("Queue Using 2 Stack");
        queueUsing2Stack();
        System.out.println("----------------------------");
    }
    public static void queueUsing2Stack(){
    D_QueueUsing2Stack queueUsingArray = new D_QueueUsing2Stack();
        queueUsingArray.offer(5);
        queueUsingArray.offer(8);
        System.out.println("Peek = "+queueUsingArray.peek());
        System.out.println("Poll = "+queueUsingArray.poll());
        System.out.println("Peek = "+queueUsingArray.peek());
        queueUsingArray.offer(11);
        System.out.println("Poll = "+queueUsingArray.poll());
        System.out.println("Peek = "+queueUsingArray.peek());
    }

  public static void binaryNumber() {
    C_BinaryNumberUsingQueue CBinaryNumberUsingQueue = new C_BinaryNumberUsingQueue(2);
    System.out.println("Binary Number = " + CBinaryNumberUsingQueue.binNumber());
  }

    public static void queueUsingList(){
    B_QueueUsingList queueUsingArray = new B_QueueUsingList();
        queueUsingArray.offer(5);
        queueUsingArray.offer(8);
        System.out.println("Peek = "+queueUsingArray.peek());
        System.out.println("Poll = "+queueUsingArray.poll());
        System.out.println("Peek = "+queueUsingArray.peek());
        queueUsingArray.offer(11);
        System.out.println("Poll = "+queueUsingArray.poll());
        System.out.println("Peek = "+queueUsingArray.peek());
    }

  public static void queueUsingArray() {

    A_QueueUsingArray AQueueUsingArray = new A_QueueUsingArray(5);
    AQueueUsingArray.offer(5);
    AQueueUsingArray.offer(8);
    System.out.println("Peek = " + AQueueUsingArray.peek());
    System.out.println("Poll = " + AQueueUsingArray.poll());
    System.out.println("Peek = " + AQueueUsingArray.peek());
    AQueueUsingArray.offer(11);
    System.out.println("Poll = " + AQueueUsingArray.poll());
    System.out.println("Peek = " + AQueueUsingArray.peek());
  }
}
