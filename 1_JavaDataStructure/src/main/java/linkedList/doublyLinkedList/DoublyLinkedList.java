package linkedList.doublyLinkedList;

import linkedList.node.DoubleLinkedListNode;
import linkedList.node.SingleLinkedListNode;

public class DoublyLinkedList {

    DoubleLinkedListNode head=null;

    public static void main(String[] args){

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.create(5);
        doublyLinkedList.traversal();

        //Insert at the start
        System.out.println("Insert At Start");
        doublyLinkedList.insertAtStart(2);
        doublyLinkedList.traversal();

        //Insert At Last
        System.out.println("Insert At Last");
        doublyLinkedList.insertAtLast(9);
        doublyLinkedList.traversal();

        //Insert At Specified Location
        System.out.println("Insert At Specified Location");
        doublyLinkedList.insertAtSpecifiedLocation(7,2);
        doublyLinkedList.insertAtSpecifiedLocation(9,2);
        doublyLinkedList.insertAtSpecifiedLocation(11,2);
        doublyLinkedList.traversal();

        //Search element
        System.out.println("Search An Element");
        boolean result = doublyLinkedList.searchElement(2);
        System.out.println("Search Result : "+result);

        //Delete At First
        System.out.println("Delete the First Element");
        doublyLinkedList.deleteAtFirst();
        doublyLinkedList.traversal();

        //Delete At End
        System.out.println("Delete At End");
        doublyLinkedList.deleteAtLast();
        doublyLinkedList.traversal();

        //Delete At Specified Location
        System.out.println("Delete At Specified Location");
        doublyLinkedList.deleteAtLocation(2);
        doublyLinkedList.traversal();

        //Reverse The Double Linked List
        System.out.println("Reverse the Double Linked List");
        doublyLinkedList.reverse();
        doublyLinkedList.traversal();

    }

    public void create(int data){
        DoubleLinkedListNode node = new DoubleLinkedListNode(null,data,null);
        head = node;
    }

    public void traversal(){

        DoubleLinkedListNode headCopy = head;
        while (headCopy !=null){
            System.out.print("Prev: "+(headCopy.prevNode != null ? headCopy.prevNode.hashCode() : headCopy.prevNode));
            System.out.print(" Value: "+headCopy.value + " HasCode "+headCopy.hashCode());
            System.out.print(" Next: "+(headCopy.nextNode != null ? headCopy.nextNode.hashCode()+" --> " : headCopy.nextNode));
            headCopy = headCopy.nextNode;
        }
        System.out.println();
    }

    public void insertAtStart(int data){
        DoubleLinkedListNode node = new DoubleLinkedListNode(null,data,head);
        head.prevNode = node;
        head = node;
    }

    public void insertAtLast(int data){

        DoubleLinkedListNode headCopy = head;
        while(headCopy.nextNode != null){
            headCopy = headCopy.nextNode;
        }
        DoubleLinkedListNode node = new DoubleLinkedListNode(headCopy,data,null);
        headCopy.nextNode = node;

    }

    public void insertAtSpecifiedLocation(int data, int location){

        DoubleLinkedListNode headCopy = head;
        if (location ==1){
            insertAtStart(data);
            return;
        }

        for (int i=1;i<location-1;i++) {

            if (headCopy.nextNode == null) {
                if (i == location) {
                    insertAtLast(data);
                    return;
                } else if (i < location) {
                    System.out.println("Specified Location is greater than list size");
                }
            }
            headCopy = headCopy.nextNode;

        }

        DoubleLinkedListNode node = new DoubleLinkedListNode(headCopy, data, headCopy.nextNode);
        headCopy.nextNode.prevNode = node;
        headCopy.nextNode= node;

    }


    public boolean searchElement(int data){
        DoubleLinkedListNode headCopy = head;
        while (headCopy !=null){
            if(headCopy.value == data){
                return true;
            }
            headCopy = headCopy.nextNode;
        }
        return false;
    }

    public void deleteAtFirst(){

        head = head.nextNode;
        head.prevNode = null;

    }

    public void deleteAtLast(){
        DoubleLinkedListNode headCopy = head;

        //List contain only single node
        if (headCopy.nextNode == null){
            deleteAtFirst();
        }

        while (headCopy.nextNode.nextNode != null){
            headCopy = headCopy.nextNode;
        }
        headCopy.nextNode = null;

    }

    public void deleteAtLocation(int location){
        DoubleLinkedListNode headCopy = head;

        if (location == 1){
            deleteAtFirst();
            return;
        }
        for (int i =1; i <=location-1;i++){

            if (headCopy.nextNode == null ){
                    System.out.println("Given Location is greater than list length");
                    return;
                }
            headCopy = headCopy.nextNode;
        }

        if (headCopy.nextNode == null){
            deleteAtLast();
            return;
        }
        headCopy.nextNode.prevNode = headCopy.prevNode;
        headCopy.prevNode.nextNode = headCopy.nextNode;
    }

    public void reverse(){

        DoubleLinkedListNode current = head;
        DoubleLinkedListNode temp =null;
        while (current !=null){
            temp = current.prevNode;
            current.prevNode = current.nextNode;
            current.nextNode = temp;
            current = current.prevNode;
        }
        if(temp != null){
            head = temp.prevNode;
        }

    }
}
