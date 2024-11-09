package linkedList.interviewQuestions;

import linkedList.node.SingleLinkedListNode;
import linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void main (String[] args){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.create(1);
        linkedList.insertAtLast(2);
        linkedList.insertAtLast(1);
        linkedList.insertAtLast(3);
        linkedList.insertAtLast(5);
        linkedList.insertAtLast(5);

        linkedList.traversal();

        //removeDuplicatesUsingHashSet(linkedList);
        removeDuplicates(linkedList);
        linkedList.traversal();
    }

    public static void removeDuplicates(SinglyLinkedList linkedList){

        SingleLinkedListNode headCopy = linkedList.head;
        SingleLinkedListNode headCopy2;
        while (headCopy != null){
            headCopy2= headCopy;
            while (headCopy2.next !=null){
                if (headCopy.value == headCopy2.next.value){
                    //Need to remove duplicate
                    headCopy2.next = headCopy2.next.next;
                }
                else {
                    headCopy2 = headCopy2.next;
                }
            }
            headCopy = headCopy.next;
        }

    }
    public static void removeDuplicatesUsingHashSet(SinglyLinkedList linkedList){
        HashSet<Integer> values = new HashSet<>();
        SingleLinkedListNode headCopy = null;
        if (linkedList != null){
            headCopy = linkedList.head;
            values.add(headCopy.value);
        }

        while (headCopy.next != null){
            if(values.add(headCopy.next.value)){
                headCopy = headCopy.next;
            }
            else{
                headCopy.next = headCopy.next.next;
            }
        }
    }
}
