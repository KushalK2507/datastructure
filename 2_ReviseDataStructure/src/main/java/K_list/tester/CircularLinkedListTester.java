package K_list.tester;

import K_list.C_CircularLinkedList;

public class CircularLinkedListTester {

  public static void main(String[] args) {

    C_CircularLinkedList CCircularLinkedList = new C_CircularLinkedList();
    CCircularLinkedList.create(4);
    System.out.print("Creating Circular LinkedList = ");
    CCircularLinkedList.traversal();

    CCircularLinkedList.insertAtFirst(1);
    System.out.print("Inserting At First in Circular LinkedList = ");
    CCircularLinkedList.traversal();

    CCircularLinkedList.insertInMid(3);
    System.out.print("Inserting At Mid in Circular LinkedList = ");
    CCircularLinkedList.traversal();

    CCircularLinkedList.insertAtLast(6);
    System.out.print("Inserting At Last in Circular LinkedList = ");
    CCircularLinkedList.traversal();

    CCircularLinkedList.deleteAtLast();
    System.out.print("Delete At Last in Circular LinkedList = ");
    CCircularLinkedList.traversal();

    CCircularLinkedList.deleteAtFirst();
    System.out.print("Delete At First in Circular LinkedList = ");
    CCircularLinkedList.traversal();

    CCircularLinkedList.reversal();
    System.out.print("Reversed Linked List = ");
    CCircularLinkedList.traversal();
    }
}
