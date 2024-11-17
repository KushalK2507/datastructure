package list.tester;

import list.*;
import list.node.ListNodeWithRandom;
import sorting.MergeSort;

import java.util.List;
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

        // ToDo: Start from here
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

        SinglyLinkedList list = new SinglyLinkedList();
        list.create(1);
        list.insertAtLast(5);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(6);
        list.insertAtLast(8);
        list.insertAtLast(4);

        System.out.println("Original List ");
        list.traversal();
        SortListUsingMergeSort sort = new SortListUsingMergeSort(list);
        sort.sortList(list.head);
        System.out.println("Updated list ");
        list.traversal();


    }

    private static void rotateListNTimes(){
        SinglyLinkedList list = new SinglyLinkedList();
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
        RotateListNTimes rotate = new RotateListNTimes(list,rotateTimes);
        rotate.rotateList();
        System.out.println("Updated List ");
        list.traversal();





    }

    private static void removeElementsWhichAreDuplicate(){

        SinglyLinkedList list = new SinglyLinkedList();
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
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList(list);
        removeDuplicatesFromSortedList.removeDuplicateFromSortedList();
        System.out.println("Updated List ");
        list.traversal();

        SinglyLinkedList list1 = new SinglyLinkedList();
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
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList1 = new RemoveDuplicatesFromSortedList(list1);
       removeDuplicatesFromSortedList1.removeElementsWhichAreDuplicate();
        System.out.println("Updated List ");
        list1.traversal();
    }

    private static void removeKthElementFromEnd(){
        SinglyLinkedList list = new SinglyLinkedList();
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
        RemoveKthElementFromEnd removeKthElementFromEnd = new RemoveKthElementFromEnd(list,kthFromEnd);
        removeKthElementFromEnd.removeKthElementFromEnd();
        System.out.print("Updated List ");
        list.traversal();
        System.out.println();

    }

    private static void reverseListInGroup(){

        SinglyLinkedList list = new SinglyLinkedList();
        list.create(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);

        System.out.print("Original List ");
        list.traversal();
        ReverseLinkedListInGivenGroup reverseLinkedListInGivenGroup = new ReverseLinkedListInGivenGroup(list,2,4);
        reverseLinkedListInGivenGroup.reverseListInGroup();
        System.out.print("Updated List ");
        list.traversal();
        System.out.println();
    }

    private static void deepCopyList(){
        ListWithRandom list = new ListWithRandom();
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

        DeepCopyOfLinkedList deepCopy = new DeepCopyOfLinkedList(list);
        var newList = deepCopy.deepCopy();
        System.out.println("Deep Copy List");
        newList.traversal();

    }

    public static void swapElements(){

        SinglyLinkedList list = new SinglyLinkedList();
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
        SwapElements swapElements = new SwapElements(list,0);
        swapElements.swap();
        System.out.print("Updated list = ");
        list.traversal();



        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.create(3);
        list1.insertAtLast(5);
        list1.insertAtLast(8);
        list1.insertAtLast(5);
        list1.insertAtLast(10);
        list1.insertAtLast(2);
        list1.insertAtLast(1);
        list1.insertAtLast(0);

        list1.traversal();
        SwapElements swapElements1 = new SwapElements(list1,0);
        swapElements1.swapNodes();
        list1.traversal();

    }
    private static void intersectionOf2List(){

        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.create(1);
        list1.insertAtLast(2);
        list1.insertAtLast(3);
        list1.insertAtLast(4);
        list1.insertAtLast(5);
        list1.insertAtLast(6);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.create(1);
        list2.insertAtLast(2);
        list2.insertAtLast(3);
        list2.insertAtLast(4);
        list2.head.next.next.next.next = list1.head.next.next.next.next;

        IntersectionOf2List intersection = new IntersectionOf2List(list1,list2);
        System.out.println("InterSection Start from = "+intersection.intersectionOf2List().value);

    }

    private static void exchangeNodeInList(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.create(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);

        int k=2;
        System.out.print("Original List = ");
        list.traversal();
        ExchangeNodeInLinkedList exchange = new ExchangeNodeInLinkedList(list,k);
        exchange.exchangeNode();
        System.out.print("Updated List = ");
        list.traversal();
    }

    private static void commonAndUnCommonElementInList(){
        Set<Integer> set1=Set.of(2,4,6,8,10,12,14);
        Set<Integer> set2 = Set.of(3,6,9,12,15,18);

        CommonUnCommonElements commonUnCommonElements = new CommonUnCommonElements(set1,set2);
        commonUnCommonElements.commonUnCommonElements();

    }

    private static void removeDuplicateFromSortedList(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.create(1);
        singlyLinkedList.insertAtLast(2);
        singlyLinkedList.insertAtLast(2);
        singlyLinkedList.insertAtLast(2);
        singlyLinkedList.insertAtLast(3);
        singlyLinkedList.insertAtLast(4);
        singlyLinkedList.insertAtLast(4);
        singlyLinkedList.insertAtLast(5);
        singlyLinkedList.insertAtLast(5);

        singlyLinkedList.traversal();
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList(singlyLinkedList);
        var list = removeDuplicatesFromSortedList.removeDuplicateFromSortedList();
        singlyLinkedList.traversal(list.head);

    }

    private static void insertInSortedList(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.create(1);
        singlyLinkedList.insertAtLast(2);
        singlyLinkedList.insertAtLast(3);
        singlyLinkedList.insertAtLast(4);
        singlyLinkedList.insertAtLast(8);

        singlyLinkedList.traversal();
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList(singlyLinkedList);
        var list = removeDuplicatesFromSortedList.removeDuplicateFromSortedList();
        InsertInSortedList insertInSortedList = new InsertInSortedList(list);
        var res = insertInSortedList.insertInSortedList(6);
        singlyLinkedList.traversal(res.head);
    }

    private static void detectAndRemoveLoop(){
        DetectAndRemoveLoop list = new DetectAndRemoveLoop();
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

    private static void reverseList(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.create(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtLast(6);
        list.traversal();

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList(list);
        reverseLinkedList.reverseList();
        list.traversal(reverseLinkedList.list.head);
    }
}
