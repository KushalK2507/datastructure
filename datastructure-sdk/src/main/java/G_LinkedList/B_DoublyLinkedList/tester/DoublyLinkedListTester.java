package G_LinkedList.B_DoublyLinkedList.tester;

import G_LinkedList.B_DoublyLinkedList.DoublyLinkedList;

public class DoublyLinkedListTester {

  public static void main(String[] args) {

    doublyLinkedList();
  }

  public static void doublyLinkedList() {

    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    doublyLinkedList.create(4);
    doublyLinkedList.insertAtEnd(8);
    doublyLinkedList.insertAtFirst(1);
    doublyLinkedList.insertAtMid(2);
    doublyLinkedList.insertAtEnd(10);

    doublyLinkedList.traversal();
  }
}
