package G_LinkedList.D_Interview.tester;

import G_LinkedList.A_SinglyLinkedList.A_SinglyLinkedList;
import G_LinkedList.A_SinglyLinkedList.C_ListWithRandom;
import G_LinkedList.D_Interview.*;
import java.util.Set;

public class InterviewQuestionTester {

  public static void main(String[] args) {
    System.out.println("Remove Duplicate from Sorted List");
    removeDuplicateFromSortedList();
    System.out.println("-------------------------------");

    System.out.println("Insert in Sorted List");
    insertInSortedList();
    System.out.println("-------------------------------");

    System.out.println("Reverse List");
    reverseList();
    System.out.println("-------------------------------");

    System.out.println("Common UnCommon elements");
    commonAndUnCommonElementInList();
    System.out.println("-------------------------------");

    System.out.println("Exchange Node in List");
    exchangeNodeInList();
    System.out.println("-------------------------------");

    System.out.println("Insertion of 2 List");
    intersectionOf2List();
    System.out.println("-------------------------------");

    System.out.println("Swap Elements in List");
    swapElements();
    System.out.println("-------------------------------");

    System.out.println("Deep Copy of List");
    deepCopyList();
    System.out.println("-------------------------------");

    System.out.println("Reverse List in Given Group");
    reverseListInGroup();
    System.out.println("-------------------------------");

    System.out.println("Remove Kth element in List");
    removeKthElementFromEnd();
    System.out.println("-------------------------------");

    System.out.println("Remove Elements which are duplicate in List");
    removeElementsWhichAreDuplicate();
    System.out.println("-------------------------------");

    System.out.println("Rotate List N times");
    rotateListNTimes();
    System.out.println("-------------------------------");

    System.out.println("Merge Sort");
    sortList();
    System.out.println("-------------------------------");
  }

  private static void sortList() {

    A_SinglyLinkedList list = new A_SinglyLinkedList();
    list.create(1);
    list.insertAtEnd(5);
    list.insertAtEnd(2);
    list.insertAtEnd(3);
    list.insertAtEnd(6);
    list.insertAtEnd(8);
    list.insertAtEnd(4);

    System.out.println("Original List ");
    list.traversal();
    J_SortUsingMergeSort sort = new J_SortUsingMergeSort(list);
    sort.mergeSort();
    System.out.println("Updated list ");
    list.traversal();
  }

  private static void rotateListNTimes() {
    A_SinglyLinkedList list = new A_SinglyLinkedList();
    list.create(1);
    list.insertAtEnd(3);
    list.insertAtEnd(5);
    list.insertAtEnd(7);
    list.insertAtEnd(9);
    list.insertAtEnd(11);
    list.insertAtEnd(13);
    System.out.println("Original List ");
    list.traversal();
    int rotateTimes = 5;

    I_RotateList rotate = new I_RotateList(list, rotateTimes);
    rotate.rotateList();
    System.out.println("Updated List ");
    list.traversal();
  }

  private static void removeElementsWhichAreDuplicate() {

    A_SinglyLinkedList list = new A_SinglyLinkedList();
    list.create(1);
    list.insertAtEnd(1);
    list.insertAtEnd(1);
    list.insertAtEnd(2);
    list.insertAtEnd(2);
    list.insertAtEnd(3);
    list.insertAtEnd(4);
    list.insertAtEnd(5);
    list.insertAtEnd(5);
    list.insertAtEnd(6);

    System.out.println("Original List ");
    list.traversal();
    H_RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList =
        new H_RemoveDuplicatesFromSortedList(list);
    removeDuplicatesFromSortedList.removeDuplicateFromSortedList();
    System.out.println("Updated List ");
    list.traversal();

    A_SinglyLinkedList list1 = new A_SinglyLinkedList();
    list1.create(1);
    list1.insertAtEnd(1);
    list1.insertAtEnd(1);
    list1.insertAtEnd(2);
    list1.insertAtEnd(2);
    list1.insertAtEnd(3);
    list1.insertAtEnd(4);
    list1.insertAtEnd(5);
    list1.insertAtEnd(5);
    list1.insertAtEnd(6);

    System.out.println("Original List ");
    list1.traversal();
    H_RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList1 =
        new H_RemoveDuplicatesFromSortedList(list1);
    removeDuplicatesFromSortedList1.removeDuplicateFromSortedList();
    System.out.println("Updated List ");
    list1.traversal();
  }

  private static void removeKthElementFromEnd() {
    A_SinglyLinkedList list = new A_SinglyLinkedList();
    list.create(1);
    list.insertAtEnd(1);
    list.insertAtEnd(2);
    list.insertAtEnd(4);
    list.insertAtEnd(5);
    list.insertAtEnd(8);
    list.insertAtEnd(10);
    System.out.print("Original list ");
    list.traversal();

    int kthFromEnd = 4;
    G_RemoveKthElementFromEnd removeKthElementFromEnd =
        new G_RemoveKthElementFromEnd(list, kthFromEnd);
    removeKthElementFromEnd.removeKthElementFromEnd();
    System.out.print("Updated List ");
    list.traversal();
    System.out.println();
  }

  private static void reverseListInGroup() {

    A_SinglyLinkedList list = new A_SinglyLinkedList();
    list.create(1);
    list.insertAtEnd(2);
    list.insertAtEnd(3);
    list.insertAtEnd(4);
    list.insertAtEnd(5);

    System.out.print("Original List ");
    list.traversal();
    F_ReverseLinkedListInGroup reverseLinkedListInGivenGroup =
        new F_ReverseLinkedListInGroup(list, 2, 4);
    reverseLinkedListInGivenGroup.reverseLinkedListInGroup();
    System.out.print("Updated List ");
    list.traversal();
    System.out.println();
  }

  private static void deepCopyList() {
    C_ListWithRandom list = new C_ListWithRandom();
    list.create(7);
    list.insertAtLast(13);
    list.insertAtLast(11);
    list.insertAtLast(10);
    list.insertAtLast(1);
    System.out.println("Before Populating Random");
    list.traversal();
    list.populateRandom(0, 5);
    list.populateRandom(1, 0);
    list.populateRandom(2, 4);
    list.populateRandom(3, 2);
    list.populateRandom(4, 0);
    System.out.println("Final List ");
    list.traversal();

    E_DeepCopy deepCopy = new E_DeepCopy(list);
    var newList = deepCopy.deepCopy();
    System.out.println("Deep Copy List");
    newList.traversal();
  }

  public static void swapElements() {

    A_SinglyLinkedList list = new A_SinglyLinkedList();
    list.create(5);
    list.insertAtFirst(4);
    list.insertAtFirst(3);
    list.insertAtFirst(9);
    list.insertAtFirst(10);
    list.insertAtEnd(1);
    list.insertAtEnd(2);
    list.insertAtEnd(0);

    System.out.print("Original List = ");
    list.traversal();
    D_SwapElementsInLinkedList swapElements = new D_SwapElementsInLinkedList(list, 0);
    swapElements.swapElementsInLinkedList();
    System.out.print("Updated list = ");
    list.traversal();

    A_SinglyLinkedList list1 = new A_SinglyLinkedList();
    list1.create(3);
    list1.insertAtEnd(5);
    list1.insertAtEnd(8);
    list1.insertAtEnd(5);
    list1.insertAtEnd(10);
    list1.insertAtEnd(2);
    list1.insertAtEnd(1);
    list1.insertAtEnd(0);

    list1.traversal();
    D_SwapElementsInLinkedList swapElements1 = new D_SwapElementsInLinkedList(list1, 0);
    swapElements1.swapNodes();
    list1.traversal();
  }

  private static void intersectionOf2List() {

    A_SinglyLinkedList list1 = new A_SinglyLinkedList();
    list1.create(1);
    list1.insertAtEnd(2);
    list1.insertAtEnd(3);
    list1.insertAtEnd(4);
    list1.insertAtEnd(5);
    list1.insertAtEnd(6);

    A_SinglyLinkedList list2 = new A_SinglyLinkedList();
    list2.create(1);
    list2.insertAtEnd(2);
    list2.insertAtEnd(3);
    list2.insertAtEnd(4);
    list2.head.next.next.next.next = list1.head.next.next.next.next;

    C_IntersectionOf2List intersection = new C_IntersectionOf2List(list1, list2);
    System.out.println("InterSection Start from = " + intersection.intersectionOf2List().value);
  }

  private static void exchangeNodeInList() {
    A_SinglyLinkedList list = new A_SinglyLinkedList();
    list.create(1);
    list.insertAtEnd(2);
    list.insertAtEnd(3);
    list.insertAtEnd(4);
    list.insertAtEnd(5);

    int k = 2;
    System.out.print("Original List = ");
    list.traversal();
    B_ExchangeNodeInSinglyLinkedList exchange = new B_ExchangeNodeInSinglyLinkedList(list, k);
    exchange.exchangeNodeInSinglyLinkedList();
    System.out.print("Updated List = ");
    list.traversal();
  }

  private static void commonAndUnCommonElementInList() {
    Set<Integer> set1 = Set.of(2, 4, 6, 8, 10, 12, 14);
    Set<Integer> set2 = Set.of(3, 6, 9, 12, 15, 18);

    A_CommonAndUncommonElements commonUnCommonElements = new A_CommonAndUncommonElements();
    var res = commonUnCommonElements.commonAndUnCommonElements(set1, set2);

    System.out.print("Common Element = ");
    res.get("Common").forEach(ele -> System.out.println(ele + " -> "));
    System.out.println();
  }

  private static void removeDuplicateFromSortedList() {
    A_SinglyLinkedList singlyLinkedList = new A_SinglyLinkedList();
    singlyLinkedList.create(1);
    singlyLinkedList.insertAtEnd(2);
    singlyLinkedList.insertAtEnd(2);
    singlyLinkedList.insertAtEnd(2);
    singlyLinkedList.insertAtEnd(3);
    singlyLinkedList.insertAtEnd(4);
    singlyLinkedList.insertAtEnd(4);
    singlyLinkedList.insertAtEnd(5);
    singlyLinkedList.insertAtEnd(5);

    singlyLinkedList.traversal();
    H_RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList =
        new H_RemoveDuplicatesFromSortedList(singlyLinkedList);
    removeDuplicatesFromSortedList.removeDuplicateFromSortedList();
    singlyLinkedList.traversal(singlyLinkedList.head);
  }

  private static void insertInSortedList() {
    A_SinglyLinkedList singlyLinkedList = new A_SinglyLinkedList();
    singlyLinkedList.create(1);
    singlyLinkedList.insertAtEnd(2);
    singlyLinkedList.insertAtEnd(3);
    singlyLinkedList.insertAtEnd(4);
    singlyLinkedList.insertAtEnd(8);

    singlyLinkedList.traversal();
    H_RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList =
        new H_RemoveDuplicatesFromSortedList(singlyLinkedList);
    removeDuplicatesFromSortedList.removeDuplicateFromSortedList();
    L_InsertInSortedList insertInSortedList = new L_InsertInSortedList(singlyLinkedList);
    insertInSortedList.insertInSortedList(6);
    singlyLinkedList.traversal();
  }

  private static void reverseList() {
    A_SinglyLinkedList list = new A_SinglyLinkedList();
    list.create(1);
    list.insertAtEnd(2);
    list.insertAtEnd(3);
    list.insertAtEnd(4);
    list.insertAtEnd(5);
    list.insertAtEnd(6);
    list.traversal();

    K_ReverseLinkedList reverseLinkedList = new K_ReverseLinkedList();
    reverseLinkedList.reverseLinkedList(list.head);
    list.traversal();
  }
}
