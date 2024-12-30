package G_LinkedList.A_SinglyLinkedList.tester;

import G_LinkedList.A_SinglyLinkedList.A_SinglyLinkedList;
import G_LinkedList.A_SinglyLinkedList.B_LoopInSinglyLinkedList;

public class SingleLinkedListTester {

  public static void main(String[] args) {

    singleLinkedList();

    loopInSinglyLinkedList();
  }

  public static void loopInSinglyLinkedList() {

    B_LoopInSinglyLinkedList singlyLinkedListWithLoop = new B_LoopInSinglyLinkedList();
    singlyLinkedListWithLoop.createListWithLoop();

    var isLoopPresent = singlyLinkedListWithLoop.detectLoop() != null;
    System.out.println("Loop Present = " + isLoopPresent);

    System.out.println(
        "Starting Point Of Loop = " + singlyLinkedListWithLoop.startingPointOfLoop());

    System.out.print("Traversal = ");
    singlyLinkedListWithLoop.traversal();
    System.out.println();

    singlyLinkedListWithLoop.removeLoop();

    isLoopPresent = singlyLinkedListWithLoop.detectLoop() != null;
    System.out.println("Loop Present = " + isLoopPresent);

    System.out.print("Traversal = ");
    singlyLinkedListWithLoop.traversal();
    System.out.println();
  }

  private static void singleLinkedList() {
    A_SinglyLinkedList singlyLinkedList = new A_SinglyLinkedList();
    singlyLinkedList.create(5);
    singlyLinkedList.insertAtFirst(4);
    singlyLinkedList.insertAtEnd(10);
    singlyLinkedList.insertAtMid(6);
    singlyLinkedList.insertAtMid(2);
    singlyLinkedList.insertAtMid(9);
    System.out.print("Traversal = ");
    singlyLinkedList.traversal();
    singlyLinkedList.deleteAtFirst();
    System.out.print("After deletion At first Traversal = ");
    singlyLinkedList.traversal();

    singlyLinkedList.deleteAtEnd();
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
