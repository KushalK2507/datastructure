package org.singlyLinkedList;

public class SwapElements {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.create(3);
        list.insertAtLast(5);
        list.insertAtLast(8);
        list.insertAtLast(5);
        list.insertAtLast(10);
        list.insertAtLast(2);
        list.insertAtLast(1);

        list.displayLinkedList();
        swapElements(list,5);
        list.displayLinkedList();

    }

    private static void swapElements(SinglyLinkedList list, int partitionElement){

        SinglyLinkedListNode smallerHead = null, smallerLast = null;
        SinglyLinkedListNode equalHead = null, equalLast = null;
        SinglyLinkedListNode greaterHead = null, greaterLast = null;

        SinglyLinkedListNode headCopy = list.head;
        while (headCopy != null){

            if (headCopy.val == partitionElement){
                if (equalHead == null){
                    equalHead=equalLast=headCopy;
                }
                else {
                    equalLast.next=headCopy;
                    equalLast = equalLast.next;
                }
            }
            if (headCopy.val < partitionElement){
                if (smallerHead == null){
                    smallerHead=smallerLast=headCopy;
                }
                else {
                    smallerLast.next=headCopy;
                    smallerLast = smallerLast.next;
                }
            }

            if (headCopy.val > partitionElement) {
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
