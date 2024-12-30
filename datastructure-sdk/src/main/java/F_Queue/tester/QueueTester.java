package F_Queue.tester;

import F_Queue.A_QueueUsingArray;
import F_Queue.B_QueueUsingList;
import F_Queue.C_BinaryNumberUsingQueue;
import F_Queue.D_QueueUsing2Stacks;

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

  public static void queueUsing2Stack() {
    D_QueueUsing2Stacks queueUsingArray = new D_QueueUsing2Stacks();
    queueUsingArray.offer(5);
    queueUsingArray.offer(8);
    System.out.println("Peek = " + queueUsingArray.peek());
    System.out.println("Poll = " + queueUsingArray.poll());
    System.out.println("Peek = " + queueUsingArray.peek());
    queueUsingArray.offer(11);
    System.out.println("Poll = " + queueUsingArray.poll());
    System.out.println("Peek = " + queueUsingArray.peek());
  }

  public static void binaryNumber() {
    C_BinaryNumberUsingQueue binaryNumberUsingQueue = new C_BinaryNumberUsingQueue();
    System.out.println("Binary Number = " + binaryNumberUsingQueue.binaryUsingQueue(2));
  }

  public static void queueUsingList() {
    B_QueueUsingList queueUsingArray = new B_QueueUsingList();
    queueUsingArray.offer(5);
    queueUsingArray.offer(8);
    System.out.println("Peek = " + queueUsingArray.peek());
    System.out.println("Poll = " + queueUsingArray.poll());
    System.out.println("Peek = " + queueUsingArray.peek());
    queueUsingArray.offer(11);
    System.out.println("Poll = " + queueUsingArray.poll());
    System.out.println("Peek = " + queueUsingArray.peek());
  }

  public static void queueUsingArray() {

    A_QueueUsingArray queueUsingArray = new A_QueueUsingArray(5);
    queueUsingArray.offer(5);
    queueUsingArray.offer(8);
    System.out.println("Peek = " + queueUsingArray.peek());
    System.out.println("Poll = " + queueUsingArray.poll());
    System.out.println("Peek = " + queueUsingArray.peek());
    queueUsingArray.offer(11);
    System.out.println("Poll = " + queueUsingArray.poll());
    System.out.println("Peek = " + queueUsingArray.peek());
  }
}
