package org.singlyLinkedList;

public class SinglyLinkedListMain {

    public static void main(String[] args){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.create(5);
        System.out.print("Creating LinkedList = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.insertAtStart(1);
        System.out.print("Insertion At First in LinkedList = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.insertInMid(3);
        System.out.print("Insertion At Mid in LinkedList = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.insertAtLast(8);
        System.out.print("Insertion At Last in LinkedList = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.deleteAtLast();
        System.out.print("Deletion At Last in LinkedList = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.deleteAtFirst();
        System.out.print("Deletion At first in LinkedList = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.insertAtStart(1);
        System.out.print("Insertion At First in LinkedList = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.insertInMid(3);
        System.out.print("Insertion At Mid in LinkedList = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.insertAtLast(7);
        System.out.print("Insertion At Last in LinkedList = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.insertAtLast(3);
        System.out.print("Insertion At Last in LinkedList = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.insertAtStart(1);
        System.out.print("Insertion At First in LinkedList = ");
        singlyLinkedList.displayLinkedList();
        
        singlyLinkedList.removeDuplicates();
        System.out.print("Removed Duplicates = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.head = singlyLinkedList.sortSinglyLinkedList(singlyLinkedList.head);
        System.out.print("Sorted List = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.insertInSortedList(2);
        System.out.print("Insertion in Sorted List = ");
        singlyLinkedList.displayLinkedList();

        singlyLinkedList.reverse();
        System.out.print("Reverse Linked List = ");
        singlyLinkedList.displayLinkedList();


        SinglyLinkedListNode headOfLinkedListWithLoop = singlyLinkedList.linkedListWithLoop();
        System.out.print("Linked List With Loop = ");
        singlyLinkedList.displayLinkedListWithLoop(headOfLinkedListWithLoop);

        System.out.print("Detect Loop in Linked List = ");
        SinglyLinkedListNode node = singlyLinkedList.detectLoop(headOfLinkedListWithLoop);
        System.out.println(node != null);


        System.out.print("Starting Point of Loop in Linked List = ");
        SinglyLinkedListNode loopPoint = singlyLinkedList.startingNodeLoop(headOfLinkedListWithLoop);
        System.out.println(loopPoint.val);

        System.out.println("Loop removed ="+singlyLinkedList.removeLoop(headOfLinkedListWithLoop));

        System.out.print("Displaying Linked List with removed Loop = ");
        singlyLinkedList.displayLinkedList(headOfLinkedListWithLoop);

















    }





}
