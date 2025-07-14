package K_list.tester;

import K_list.A_SinglyLinkedList;

public class SingleLinkedListTester {

  public static void main(String[] args) {

    A_SinglyLinkedList ASinglyLinkedList = new A_SinglyLinkedList();
    ASinglyLinkedList.create(5);
    ASinglyLinkedList.insertAtFirst(4);
    ASinglyLinkedList.insertAtLast(10);
    ASinglyLinkedList.insertInMid(6);
    ASinglyLinkedList.insertInMid(2);
    ASinglyLinkedList.insertInMid(9);
    System.out.print("Traversal = ");
    ASinglyLinkedList.traversal();
    ASinglyLinkedList.deleteAtFirst();
    System.out.print("After deletion At first Traversal = ");
    ASinglyLinkedList.traversal();

    ASinglyLinkedList.deleteAtLast();
    System.out.print("After deletion At Last Traversal = ");
    ASinglyLinkedList.traversal();

    ASinglyLinkedList.deleteAtSpecificPosition(2);
    System.out.print("After deletion At position 2 Traversal = ");
    ASinglyLinkedList.traversal();

    ASinglyLinkedList.deleteSpecificElement(2);
    System.out.print("After deletion \"2\" element Traversal = ");
    ASinglyLinkedList.traversal();
    }
}
