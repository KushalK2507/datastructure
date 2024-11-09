package stack;

import linkedList.node.SingleLinkedListNode;
import linkedList.singlyLinkedList.SinglyLinkedList;

public class StackUsingLinkedList {

    SinglyLinkedList linkedList;

    public  StackUsingLinkedList(){
        linkedList = new SinglyLinkedList();
    }

    public SingleLinkedListNode getLinkedListHeadNode(){
        return linkedList.head;
    }

    public void push(int data){
        if(linkedList.head == null){
            linkedList.create(data);
        }
        else{
            linkedList.insertAtBegining(data);
        }
    }

    public int pop(){
        return linkedList.deletionFromLocation(1);
    }

    public int peek(){
        SingleLinkedListNode node = linkedList.getNodeAtLocation(1);
        if(node == null){
            System.out.println("Stack is Empty");
            return -1;
        }
        else {
            return node.value;
        }
    }

    public boolean isEmpty(){
        if(linkedList == null){
            return true;
        } else if (linkedList.head == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public void deleteStack(){

        linkedList.head = null;
    }

}
