package linkedList.interviewQuestions;

//partition a linked list around a value x,
// such that all nodes less than x come before all nodes greater than or equal to x.
//Example
//Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [x=5]
//Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8

import linkedList.node.SingleLinkedListNode;
import linkedList.singlyLinkedList.SinglyLinkedList;

public class SwapElements {

    public static void main (String[] args){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.create(3);
        linkedList.insertAtLast(5);
        linkedList.insertAtLast(8);
        linkedList.insertAtLast(5);
        linkedList.insertAtLast(10);
        linkedList.insertAtLast(2);
        linkedList.insertAtLast(1);
        linkedList.traversal();
        System.out.println("Swapped Element");
        swapElements(linkedList, 5);
        linkedList.traversal();

    }

    private static void swapElements(SinglyLinkedList list, int partitionElement){

        SingleLinkedListNode smallerHead = null, smallerLast = null;
        SingleLinkedListNode equalHead = null, equalLast = null;
        SingleLinkedListNode greaterHead = null, greaterLast = null;

        SingleLinkedListNode headCopy = list.head;
        while (headCopy != null){

            if (headCopy.value == partitionElement){
                if (equalHead == null){
                    equalHead=equalLast=headCopy;
                }
                else {
                    equalLast.next=headCopy;
                    equalLast = equalLast.next;
                }
            }
            if (headCopy.value < partitionElement){
                if (smallerHead == null){
                    smallerHead=smallerLast=headCopy;
                }
                else {
                    smallerLast.next=headCopy;
                    smallerLast = smallerLast.next;
                }
            }

            if (headCopy.value > partitionElement) {
                if (greaterHead == null) {
                    greaterHead = greaterLast = headCopy;
                } else {
                    greaterLast.next = headCopy;
                    greaterLast = greaterLast.next;
                }
            }
            headCopy = headCopy.next;
        }


        if (greaterLast.next != null){
            greaterLast.next = null;
        }

        if(equalLast != null){
            equalLast.next = greaterHead;
            if (smallerLast != null){
                smallerLast.next = equalHead;
            }
        }
        else {
            smallerLast.next = greaterHead;
        }

        list.head = smallerHead;

    }
}
