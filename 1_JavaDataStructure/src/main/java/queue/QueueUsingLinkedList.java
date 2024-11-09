package queue;

import linkedList.singlyLinkedList.SinglyLinkedList;

public class QueueUsingLinkedList {

    SinglyLinkedList linkedList;

    public QueueUsingLinkedList(){
        linkedList = new SinglyLinkedList();
    }

    public boolean isEmpty(){

        if(linkedList == null || linkedList.head == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void offer(int data){
        if(linkedList.head== null){
            linkedList.create(data);
        }
        linkedList.insertAtLast(data);
    }

    public int poll(){

        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int value = linkedList.head.value;
        linkedList.head = linkedList.head.next;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return linkedList.head.value;

    }

    public void deleteQueue(){
        linkedList = null;
    }

}
