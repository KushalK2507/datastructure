package org.singlyLinkedList;

public class ParitionList {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.create(1);
        list.insertAtLast(4);
        list.insertAtLast(3);
        list.insertAtLast(2);
        list.insertAtLast(5);
        list.insertAtLast(2);
        list.insertAtLast(3);

        list.displayLinkedList();
        list.head = partitionList(list.head,3);
        list.displayLinkedList();

    }

    public static SinglyLinkedListNode partitionList(SinglyLinkedListNode head, int k){

        SinglyLinkedListNode smallerHead = null;
        SinglyLinkedListNode smallerEnd = null;

        SinglyLinkedListNode equalHead = null;
        SinglyLinkedListNode equalEnd = null;

        SinglyLinkedListNode greaterHead = null;
        SinglyLinkedListNode greaterEnd = null;

       var temp = head;
        while ( temp != null){
            if (temp.val < k){
                if (smallerHead == null){
                    smallerHead = smallerEnd = temp;
                }
                else {
                    smallerEnd.next = temp;
                    smallerEnd = smallerEnd.next;
                }
            }
            if (temp.val == k){
                if (equalHead == null){
                    equalHead = equalEnd = temp;
                }
                else {
                    equalEnd.next = temp;
                    equalEnd = equalEnd.next;
                }
            }
            if (temp.val > k){
                if (greaterHead == null){
                    greaterHead = greaterEnd = temp;
                }
                else {
                    greaterEnd.next = temp;
                    greaterEnd = greaterEnd.next;
                }
            }
            temp = temp.next;
        }

        if ( greaterEnd.next != null){
            greaterEnd.next = null;
        }


        if (equalEnd != null){
            equalEnd.next = greaterHead;
            if (smallerEnd != null){
                smallerEnd.next = equalHead;
            }
        }
        else {
            smallerEnd.next = greaterHead;
        }

        return smallerHead;





    }
}
