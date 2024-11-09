package list.tester;

import list.SinglyLinkedList;

public class SingleLinkedListTester {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.create(5);
        singlyLinkedList.insertAtFirst(4);
        singlyLinkedList.insertAtLast(10);
        singlyLinkedList.insertInMid(6);
        singlyLinkedList.insertInMid(2);
        singlyLinkedList.insertInMid(9);
        System.out.print("Traversal = ");
        singlyLinkedList.traversal();
        singlyLinkedList.deleteAtFirst();
        System.out.print("After deletion At first Traversal = ");
        singlyLinkedList.traversal();

        singlyLinkedList.deleteAtLast();
        System.out.print("After deletion At Last Traversal = ");
        singlyLinkedList.traversal();

        singlyLinkedList.deleteAtSpecificPosition(2);
        System.out.print("After deletion At position 2 Traversal = ");
        singlyLinkedList.traversal();

        singlyLinkedList.deleteSpecificElement(2);
        System.out.print("After deletion \"2\" element Traversal = ");
        singlyLinkedList.traversal();

    }
}
