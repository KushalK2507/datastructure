package linkedList.singlyLinkedList;

import linkedList.node.SingleLinkedListNode;

import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedListPractise {

    private static SingleLinkedListNode head =null;
    public static void main (String[] args){

        //Removing duplicates from sorted linked list
        SinglyLinkedListPractise singlyLinkedListPractise = new SinglyLinkedListPractise();
        singlyLinkedListPractise.sortedSinglyLinkedList();
        singlyLinkedListPractise.traversal();
        singlyLinkedListPractise.removeDuplicates();
        singlyLinkedListPractise.traversal();

        // Insert in Sorted Singly Linked List
        head = singlyLinkedListPractise.insertInSortedSinglyLinkedList(7);
        singlyLinkedListPractise.traversal();


        System.out.println("Loop in Singly Linked List");
        // Creating Singly Linked List having Loop
        SingleLinkedListNode headOfLoop = singlyLinkedListPractise.linkedListWithLoop();

        // Logic To Detect the Loop in Singly Linked List Using Java Collections
        singlyLinkedListPractise.traversalOfLinkedListWithLoop(headOfLoop);

        //Detect The Loop in Singly Linked List
        //Floyd's Cycle Loop Detection
        boolean result = singlyLinkedListPractise.detectLoop(headOfLoop) != null;
        System.out.println("Detection of Loop: "+ result);

        System.out.println("Starting Point of the Loop:"+ singlyLinkedListPractise.startingPointOfLoop(headOfLoop));

        //Remove Loop from Singly Linked List
        singlyLinkedListPractise.removeLoop(headOfLoop);
        boolean result1 = singlyLinkedListPractise.detectLoop(headOfLoop) == null ? false : true;
        System.out.println("Detection of Loop: "+result1);
        singlyLinkedListPractise.traversalOfLinkedListWithLoop(headOfLoop);

    }

    public void sortedSinglyLinkedList(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        head = singlyLinkedList.create(1);
        head =singlyLinkedList.insertAtLast(2);
        head = singlyLinkedList.insertAtLast(2);
        head = singlyLinkedList.insertAtLast(3);
        head = singlyLinkedList.insertAtLast(5);
        head = singlyLinkedList.insertAtLast(5);
        head = singlyLinkedList.insertAtLast(8);
        head = singlyLinkedList.insertAtLast(8);
    }

    public void traversal(){

        SingleLinkedListNode headCopy = head;
        while (headCopy != null){
            System.out.print(headCopy.value+ " ");
            headCopy = headCopy.next;
        }
        System.out.println();
    }

    public void removeDuplicates(){

        SingleLinkedListNode headCopy = head;
        while (headCopy.next !=null){
            if (headCopy.value == headCopy.next.value){
                headCopy.next = headCopy.next.next;
            }
            else{
                headCopy = headCopy.next;
            }
        }
    }
    public SingleLinkedListNode insertInSortedSinglyLinkedList(int value){

        SingleLinkedListNode headCopy = head;
        SingleLinkedListNode temp = null;
        while (headCopy != null && headCopy.value < value){
            temp =  headCopy;
            headCopy = headCopy.next;
        }
        SingleLinkedListNode newNode = new SingleLinkedListNode();
        newNode.value = value;
        newNode.next = headCopy;
        temp.next = newNode;
        return head;
    }

    public SingleLinkedListNode linkedListWithLoop(){

        SingleLinkedListNode first = new SingleLinkedListNode();
        first.value= 5;
        SingleLinkedListNode second = new SingleLinkedListNode();
        first.next = second;
        second.value = 4;
        SingleLinkedListNode third = new SingleLinkedListNode();
        second.next = third;
        third.value = 7;
        SingleLinkedListNode forth = new SingleLinkedListNode();
        third.next = forth;
        forth.value = 9;
        SingleLinkedListNode fifth = new SingleLinkedListNode();
        forth.next = fifth;
        fifth.value = 10;
        SingleLinkedListNode sixth = new SingleLinkedListNode();
        fifth.next =  sixth;
        sixth.value = 12;
        sixth.next = third;

        return  first;
    }

    public void traversalOfLinkedListWithLoop(SingleLinkedListNode headOfLoop){

        Set<SingleLinkedListNode> list = new HashSet<>();
        SingleLinkedListNode headOfLoopCopy = headOfLoop;
        while (headOfLoopCopy != null && !list.contains(headOfLoopCopy)){
            list.add(headOfLoopCopy);
            System.out.print(headOfLoopCopy.value+" ");
            headOfLoopCopy = headOfLoopCopy.next;
        }
        System.out.println();
    }
    public SingleLinkedListNode detectLoop(SingleLinkedListNode headOfLoop){
        SingleLinkedListNode fastPointer = headOfLoop;
        SingleLinkedListNode slowPointer = headOfLoop;
        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer) {
                return slowPointer;
            }
        }
        return null;
    }
    public int startingPointOfLoop(SingleLinkedListNode headOfLoop){

        SingleLinkedListNode node = detectLoop(headOfLoop);
        SingleLinkedListNode temp = headOfLoop;
        while (temp != node){
            temp = temp.next;
            node = node.next;
        }
        return temp.value;
    }

    public void removeLoop(SingleLinkedListNode headOfLoop){

        SingleLinkedListNode slowPointer = detectLoop(headOfLoop);
        SingleLinkedListNode temp = headOfLoop;
        while (slowPointer.next != temp.next){
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = null;
    }

}
