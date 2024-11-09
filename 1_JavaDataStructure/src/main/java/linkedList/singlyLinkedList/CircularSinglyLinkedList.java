package linkedList.singlyLinkedList;

import linkedList.node.SingleLinkedListNode;

public class CircularSinglyLinkedList {

    SingleLinkedListNode head =null;

    public static void main (String[] args){

        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();

        //Creating of Circular Linked List
        circularSinglyLinkedList.create(5);
        circularSinglyLinkedList.traversal();

        //Insertion of element at the start
        circularSinglyLinkedList.insertAtStart(8);
        circularSinglyLinkedList.traversal();

        circularSinglyLinkedList.insertAtSpecifiedLocation(10, 3);
        circularSinglyLinkedList.traversal();

        circularSinglyLinkedList.insertAtSpecifiedLocation(11, 4);
        circularSinglyLinkedList.traversal();

        circularSinglyLinkedList.insertAtEnd(32);
        circularSinglyLinkedList.traversal();

        boolean result = circularSinglyLinkedList.searchElement(5);
        System.out.println("Search result : "+result);

        System.out.println("Delete from Start");
        circularSinglyLinkedList.deleteAtStart();
        circularSinglyLinkedList.traversal();

        System.out.println("Delete at End");
        circularSinglyLinkedList.deleteAtEnd();
        circularSinglyLinkedList.traversal();

        System.out.println("Delete at Specified location");
        circularSinglyLinkedList.deleteAtSpecifiedLocation(2);
        circularSinglyLinkedList.traversal();

        System.out.println("Reverse Circular Singly Linked List");
        circularSinglyLinkedList.reverse();
        circularSinglyLinkedList.traversal();

    }
    public void create(int data){

        SingleLinkedListNode node = new SingleLinkedListNode();
        node.value=data;
        node.next = node;
        head = node;
    }
    public void traversal(){

        SingleLinkedListNode headCopy = head;

        //This will check for empty list also if list has only single element
        if (headCopy ==null){
            return;
        }
        while (headCopy.next != head){
            System.out.print(headCopy.value+" ");
            headCopy = headCopy.next;
        }
        System.out.print(headCopy.value);
        System.out.println();
    }
    public void insertAtStart(int data){

        SingleLinkedListNode node = new SingleLinkedListNode();
        SingleLinkedListNode temp = head;
        node.value=data;
        node.next=head;
        while(temp.next != head){
            temp = temp.next;
        }
        head = node;
        temp.next= node;
    }
    public void insertAtSpecifiedLocation(int data, int location){

        SingleLinkedListNode headCopy = head;
        if(location==1){
            //If specified location is first position
            insertAtStart(data);
            return;
        }
        for (int i=1;i<location-1;i++){

            //If specified location is last element
            if(headCopy.next == head && i==location){
                insertAtEnd(data);
                return;
            }
            //If Specified location is greater than the length of the list
            if(headCopy.next == head && i < location){
                System.out.println("Specified Location is greater than list");
                return;
            }
            headCopy= headCopy.next;
        }
        //Inserting at the given location
        SingleLinkedListNode node = new SingleLinkedListNode();
        node.value= data;
        node.next = headCopy.next;
        headCopy.next = node;
    }
    public void insertAtEnd(int data){

        SingleLinkedListNode headCopy = head;
        while (headCopy.next != head){
            headCopy = headCopy.next;
        }
        SingleLinkedListNode node = new SingleLinkedListNode();
        node.value= data;
        node.next = headCopy.next;
        headCopy.next = node;
    }

    public boolean searchElement(int data){

        SingleLinkedListNode headCopy = head;
        if(headCopy == null){
            return false;
        }
        if(headCopy.value == data){
            return true;
        }
        while (headCopy.next != head){
            if (headCopy.value == data){
                return true;
            }
            headCopy = headCopy.next;
        }
        return false;
    }

    public void deleteAtStart(){

        SingleLinkedListNode headCopy = head;
        SingleLinkedListNode temp = head.next;
        while (headCopy.next != head){
            headCopy = headCopy.next;
        }
        headCopy.next =temp;
        head = head.next;
    }

    public void deleteAtEnd(){
        SingleLinkedListNode headCopy = head;
        while (headCopy.next.next != head){
            headCopy = headCopy.next;
        }
        headCopy.next = head;
    }

    public void deleteAtSpecifiedLocation(int location){

        SingleLinkedListNode headCopy = head;
        if (location == 1){
            deleteAtStart();
            return;
        }
        for (int i=1;i<location-1;i++){
            while (headCopy.next != head ){
                if (headCopy.next == head && i==location ){
                    deleteAtEnd();
                    return;
                }
                headCopy = headCopy.next;
            }
        }
        headCopy.next = headCopy.next.next;
    }

    public void reverse(){

        SingleLinkedListNode current = head;
        SingleLinkedListNode previous = null;
        SingleLinkedListNode temp = null;
        do{
            temp = current.next;
            current.next=previous;
            previous = current;
            current = temp;
        }
        while ( current != head);

        head.next = previous;
        head = previous;

    }

}
