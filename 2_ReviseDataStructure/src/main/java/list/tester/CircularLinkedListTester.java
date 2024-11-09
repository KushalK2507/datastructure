package list.tester;

import list.CircularLinkedList;

public class CircularLinkedListTester {

    public static void main(String[] args) {

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.create(4);
        System.out.print("Creating Circular LinkedList = ");
        circularLinkedList.traversal();

        circularLinkedList.insertAtFirst(1);
        System.out.print("Inserting At First in Circular LinkedList = ");
        circularLinkedList.traversal();

        circularLinkedList.insertInMid(3);
        System.out.print("Inserting At Mid in Circular LinkedList = ");
        circularLinkedList.traversal();

        circularLinkedList.insertAtLast(6);
        System.out.print("Inserting At Last in Circular LinkedList = ");
        circularLinkedList.traversal();

        circularLinkedList.deleteAtLast();
        System.out.print("Delete At Last in Circular LinkedList = ");
        circularLinkedList.traversal();

        circularLinkedList.deleteAtFirst();
        System.out.print("Delete At First in Circular LinkedList = ");
        circularLinkedList.traversal();

        circularLinkedList.reversal();
        System.out.print("Reversed Linked List = ");
        circularLinkedList.traversal();

    }
}
