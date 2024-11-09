package org.singlyLinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.create(1);
        list.insertAtLast(1);
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);

//        list.insertAtLast(2);
//        list.insertAtLast(3);
//        list.insertAtLast(3);
//        list.insertAtLast(4);
//        list.insertAtLast(4);
//        list.insertAtLast(5);

        list.displayLinkedList();

        removeDuplicates(list);
        list.displayLinkedList();


    }


    public static void removeDuplicateWithSpaceComplexity(SinglyLinkedListNode head){

        Set<Integer> elements = new HashSet<>();

        elements.add(head.val);
        SinglyLinkedListNode headCopy = head;
        while (headCopy != null && headCopy.next != null){

            if (!elements.add(head.next.val)){
                headCopy.next = headCopy.next.next;
            }
            headCopy = headCopy.next;

        }
    }

    public static void removeDuplicates(SinglyLinkedList list){

        SinglyLinkedListNode dummy = new SinglyLinkedListNode(-1);
        SinglyLinkedListNode prev= dummy;
        dummy.next = list.head;

        while (prev.next != null && prev.next.next != null){
            if (prev.next.val == prev.next.next.val){
                int val = prev.next.val;
                while (prev.next.val == val){
                    prev.next = prev.next.next;
                }
            }
            else {
                prev = prev.next;
            }
        }

        list.head = dummy.next;



    }
}
