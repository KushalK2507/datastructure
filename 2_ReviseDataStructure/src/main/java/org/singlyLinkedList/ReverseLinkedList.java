package org.singlyLinkedList;

public class ReverseLinkedList {


    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.create(2);
        list.insertAtLast(4);
        list.insertInMid(3);
        list.insertAtStart(1);
        list.insertAtLast(5);

        list.displayLinkedList();

        SinglyLinkedListNode newHead = reverseList(list.head);

        list.displayLinkedList(newHead);

        SinglyLinkedListNode newHeadGroup = reverseLinkedListInGroup(newHead,2,4);

        list.displayLinkedList(newHeadGroup);


    }

    public static void removeNthfromEnd(SinglyLinkedListNode head){

    }

    public static SinglyLinkedListNode reverseList(SinglyLinkedListNode head){

        SinglyLinkedListNode headCopy = head;
        SinglyLinkedListNode prev = null;

        while (headCopy != null){
            SinglyLinkedListNode temp = headCopy.next;
            headCopy.next = prev;
            prev = headCopy;
            headCopy = temp;
        }
        return prev;
    }

    public static SinglyLinkedListNode reverseLinkedListInGroup(SinglyLinkedListNode head, int left, int right){

        SinglyLinkedListNode dummy = new SinglyLinkedListNode(-1);
        SinglyLinkedListNode prev = dummy;
        dummy.next = head;

        for(int i=0;i<left-1;i++){
            prev = prev.next;
        }

        int count = right-left;
        SinglyLinkedListNode curr = prev.next;
        while (count > 0 && curr!= null){
            SinglyLinkedListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
            count--;
        }

        return dummy.next;

    }
}
