package queue.tester;

import queue.BinaryNumberUsingQueue;
import queue.QueueUsing2Stack;
import queue.QueueUsingArray;
import queue.QueueUsingList;

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
        QueueUsing2Stack queueUsingArray = new QueueUsing2Stack();
        queueUsingArray.offer(5);
        queueUsingArray.offer(8);
        System.out.println("Peek = "+queueUsingArray.peek());
        System.out.println("Poll = "+queueUsingArray.poll());
        System.out.println("Peek = "+queueUsingArray.peek());
        queueUsingArray.offer(11);
        System.out.println("Poll = "+queueUsingArray.poll());
        System.out.println("Peek = "+queueUsingArray.peek());
    }

    public static void binaryNumber(){
        BinaryNumberUsingQueue binaryNumberUsingQueue = new BinaryNumberUsingQueue(2);
        System.out.println("Binary Number = "+binaryNumberUsingQueue.binNumber());

    }
    public static void queueUsingList(){
        QueueUsingList queueUsingArray = new QueueUsingList();
        queueUsingArray.offer(5);
        queueUsingArray.offer(8);
        System.out.println("Peek = "+queueUsingArray.peek());
        System.out.println("Poll = "+queueUsingArray.poll());
        System.out.println("Peek = "+queueUsingArray.peek());
        queueUsingArray.offer(11);
        System.out.println("Poll = "+queueUsingArray.poll());
        System.out.println("Peek = "+queueUsingArray.peek());
    }
    public static void queueUsingArray(){

        QueueUsingArray queueUsingArray = new QueueUsingArray(5);
        queueUsingArray.offer(5);
        queueUsingArray.offer(8);
        System.out.println("Peek = "+queueUsingArray.peek());
        System.out.println("Poll = "+queueUsingArray.poll());
        System.out.println("Peek = "+queueUsingArray.peek());
        queueUsingArray.offer(11);
        System.out.println("Poll = "+queueUsingArray.poll());
        System.out.println("Peek = "+queueUsingArray.peek());

    }

}
