package K_list.tester;

import K_list.*;
import java.util.Set;

public class InterviewQuestionTester {

    public static void main(String[] args) {
        System.out.println("Remove Duplicate from Sorted List");
        removeDuplicateFromSortedList();
        System.out.println("-------------------------------");

        System.out.println("Insert in Sorted List");
        insertInSortedList();
        System.out.println("-------------------------------");

        System.out.println("Detect & Remove Loop");
        detectAndRemoveLoop();
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

    private static void sortList(){

    A_SinglyLinkedList list = new A_SinglyLinkedList();
        list.create(1);
        list.insertAtLast(5);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(6);
        list.insertAtLast(8);
        list.insertAtLast(4);

        System.out.println("Original List ");
        list.traversal();
    N_SortListUsingMergeSort sort = new N_SortListUsingMergeSort(list);
        sort.sortList(list.head);
        System.out.println("Updated list ");
        list.traversal();


    }

    private static void rotateListNTimes(){
    A_SinglyLinkedList list = new A_SinglyLinkedList();
        list.create(1);
        list.insertAtLast(3);
        list.insertAtLast(5);
        list.insertAtLast(7);
        list.insertAtLast(9);
        list.insertAtLast(11);
        list.insertAtLast(13);
        System.out.println("Original List ");
        list.traversal();
    int rotateTimes = 5;
    M_RotateListNTimes rotate = new M_RotateListNTimes(list, rotateTimes);
        rotate.rotateList();
        System.out.println("Updated List ");
        list.traversal();

    }

    private static void removeElementsWhichAreDuplicate(){

    A_SinglyLinkedList list = new A_SinglyLinkedList();
        list.create(1);
        list.insertAtLast(1);
        list.insertAtLast(1);
    list.insertAtLast(2);
    list.insertAtLast(2);
    list.insertAtLast(3);
    list.insertAtLast(4);
    list.insertAtLast(5);
    list.insertAtLast(5);
    list.insertAtLast(6);

    System.out.println("Original List ");
    list.traversal();
    L_RemoveDuplicatesFromSortedList KRemoveDuplicatesFromSortedList =
        new L_RemoveDuplicatesFromSortedList(list);
    KRemoveDuplicatesFromSortedList.removeDuplicateFromSortedList();
    System.out.println("Updated List ");
    list.traversal();

    A_SinglyLinkedList list1 = new A_SinglyLinkedList();
    list1.create(1);
    list1.insertAtLast(1);
    list1.insertAtLast(1);
    list1.insertAtLast(2);
    list1.insertAtLast(2);
    list1.insertAtLast(3);
    list1.insertAtLast(4);
    list1.insertAtLast(5);
    list1.insertAtLast(5);
    list1.insertAtLast(6);

    System.out.println("Original List ");
    list1.traversal();
    L_RemoveDuplicatesFromSortedList KRemoveDuplicatesFromSortedList1 =
        new L_RemoveDuplicatesFromSortedList(list1);
    KRemoveDuplicatesFromSortedList1.removeElementsWhichAreDuplicate();
    System.out.println("Updated List ");
    list1.traversal();
  }

    private static void removeKthElementFromEnd(){
    A_SinglyLinkedList list = new A_SinglyLinkedList();
    list.create(1);
    list.insertAtLast(1);
    list.insertAtLast(2);
    list.insertAtLast(4);
    list.insertAtLast(5);
    list.insertAtLast(8);
    list.insertAtLast(10);
    System.out.print("Original list ");
    list.traversal();
    int kthFromEnd = 4;
    K_RemoveKthElementFromEnd JRemoveKthElementFromEnd =
        new K_RemoveKthElementFromEnd(list, kthFromEnd);
    JRemoveKthElementFromEnd.removeKthElementFromEnd();
    System.out.print("Updated List ");
    list.traversal();
    System.out.println();
  }

    private static void reverseListInGroup(){

    A_SinglyLinkedList list = new A_SinglyLinkedList();
    list.create(1);
    list.insertAtLast(2);
    list.insertAtLast(3);
    list.insertAtLast(4);
    list.insertAtLast(5);

    System.out.print("Original List ");
    list.traversal();
    J_ReverseLinkedListInGivenGroup IReverseLinkedListInGivenGroup =
        new J_ReverseLinkedListInGivenGroup(list, 2, 4);
    IReverseLinkedListInGivenGroup.reverseListInGroup();
    System.out.print("Updated List ");
    list.traversal();
    System.out.println();
  }

    private static void deepCopyList(){
    I_ListWithRandom list = new I_ListWithRandom();
        list.create(7);
        list.insertAtLast(13);
        list.insertAtLast(11);
        list.insertAtLast(10);
        list.insertAtLast(1);
        System.out.println("Before Populating Random");
        list.traversal();
        list.populateRandom(0,5);
        list.populateRandom(1,0);
        list.populateRandom(2,4);
        list.populateRandom(3,2);
        list.populateRandom(4,0);
        System.out.println("Final List ");
        list.traversal();

    I_DeepCopyOfLinkedList deepCopy = new I_DeepCopyOfLinkedList(list);
    var newList = deepCopy.deepCopy();
        System.out.println("Deep Copy List");
        newList.traversal();

    }

    public static void swapElements(){

    A_SinglyLinkedList list = new A_SinglyLinkedList();
        list.create(5);
    list.insertAtFirst(4);
    list.insertAtFirst(3);
    list.insertAtFirst(9);
    list.insertAtFirst(10);
    list.insertAtLast(1);
    list.insertAtLast(2);
    list.insertAtLast(0);

    System.out.print("Original List = ");
    list.traversal();
    H_SwapElements GSwapElements = new H_SwapElements(list, 0);
    GSwapElements.swap();
    System.out.print("Updated list = ");
    list.traversal();

    A_SinglyLinkedList list1 = new A_SinglyLinkedList();
    list1.create(3);
    list1.insertAtLast(5);
    list1.insertAtLast(8);
    list1.insertAtLast(5);
    list1.insertAtLast(10);
    list1.insertAtLast(2);
    list1.insertAtLast(1);
    list1.insertAtLast(0);

    list1.traversal();
    H_SwapElements GSwapElements1 = new H_SwapElements(list1, 0);
    GSwapElements1.swapNodes();
    list1.traversal();
  }

    private static void intersectionOf2List(){

    A_SinglyLinkedList list1 = new A_SinglyLinkedList();
        list1.create(1);
        list1.insertAtLast(2);
        list1.insertAtLast(3);
        list1.insertAtLast(4);
        list1.insertAtLast(5);
        list1.insertAtLast(6);

    A_SinglyLinkedList list2 = new A_SinglyLinkedList();
        list2.create(1);
        list2.insertAtLast(2);
        list2.insertAtLast(3);
        list2.insertAtLast(4);
        list2.head.next.next.next.next = list1.head.next.next.next.next;

    G_IntersectionOf2List intersection = new G_IntersectionOf2List(list1, list2);
        System.out.println("InterSection Start from = with O(n2) complexity "+intersection.intersectionOfLinkedList(list1,list2).value);
        System.out.println("InterSection Start from = with Collection "+intersection.intersectionOfLinkedListUsingCollection(list1,list2).value);
        System.out.println("InterSection Start from = with O(1) space complexity "+intersection.interSectionOfLinkedListWithLessSpaceComplexity(list1,list2).value);

    }

    private static void exchangeNodeInList(){
    A_SinglyLinkedList list = new A_SinglyLinkedList();
        list.create(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);

        int k=2;
        System.out.print("Original List = ");
        list.traversal();
    E_ExchangeNodeInLinkedList exchange = new E_ExchangeNodeInLinkedList(list, k);
        exchange.exchangeNode();
        System.out.print("Updated List = ");
        list.traversal();
    }

  private static void commonAndUnCommonElementInList() {
    Set<Integer> set1 = Set.of(2, 4, 6, 8, 10, 12, 14);
    Set<Integer> set2 = Set.of(3, 6, 9, 12, 15, 18);

    D_CommonUnCommonElements DCommonUnCommonElements = new D_CommonUnCommonElements(set1, set2);
    DCommonUnCommonElements.commonUnCommonElements();
  }

  private static void removeDuplicateFromSortedList() {
    A_SinglyLinkedList ASinglyLinkedList = new A_SinglyLinkedList();
    ASinglyLinkedList.create(1);
    ASinglyLinkedList.insertAtLast(2);
    ASinglyLinkedList.insertAtLast(2);
    ASinglyLinkedList.insertAtLast(2);
    ASinglyLinkedList.insertAtLast(3);
    ASinglyLinkedList.insertAtLast(4);
    ASinglyLinkedList.insertAtLast(4);
    ASinglyLinkedList.insertAtLast(5);
    ASinglyLinkedList.insertAtLast(5);

    ASinglyLinkedList.traversal();
    L_RemoveDuplicatesFromSortedList KRemoveDuplicatesFromSortedList =
        new L_RemoveDuplicatesFromSortedList(ASinglyLinkedList);
    var list = KRemoveDuplicatesFromSortedList.removeDuplicateFromSortedList();
    ASinglyLinkedList.traversal(list.head);
  }

  private static void insertInSortedList() {
    A_SinglyLinkedList ASinglyLinkedList = new A_SinglyLinkedList();
    ASinglyLinkedList.create(1);
    ASinglyLinkedList.insertAtLast(2);
    ASinglyLinkedList.insertAtLast(3);
    ASinglyLinkedList.insertAtLast(4);
    ASinglyLinkedList.insertAtLast(8);

    ASinglyLinkedList.traversal();
    L_RemoveDuplicatesFromSortedList KRemoveDuplicatesFromSortedList =
        new L_RemoveDuplicatesFromSortedList(ASinglyLinkedList);
    var list = KRemoveDuplicatesFromSortedList.removeDuplicateFromSortedList();
    F_InsertInSortedList FInsertInSortedList = new F_InsertInSortedList(list);
    var res = FInsertInSortedList.insertInSortedList(6);
    ASinglyLinkedList.traversal(res.head);
  }

    private static void detectAndRemoveLoop(){
    B_DetectAndRemoveLoop list = new B_DetectAndRemoveLoop();
        list.createListWithLoop();
        list.traversalOfList();
        var result = list.detectLoop() != null;
        System.out.println("Is Loop Exist = "+result);
       System.out.println("Starting Point of Loop "+list.startingOfLoop());
        list.removeLoop();
        var result1 = list.detectLoop() != null;
        System.out.println("Is Loop Exist = "+result1);
        list.traversalOfList();
    }

  private static void reverseList() {
    A_SinglyLinkedList list = new A_SinglyLinkedList();
    list.create(1);
    list.insertAtLast(2);
    list.insertAtLast(3);
    list.insertAtLast(4);
    list.insertAtLast(5);
    list.insertAtLast(6);
    list.traversal();

    B_ReverseLinkedList BReverseLinkedList = new B_ReverseLinkedList(list);
    BReverseLinkedList.reverseList();
    list.traversal(BReverseLinkedList.list.head);
  }
}
