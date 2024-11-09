package org.singlyLinkedList;

public class RemoveKthElementFromEnd {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.create(2);
        list.insertAtLast(15);
        list.insertInMid(12);
        list.insertAtStart(1);
        list.insertAtStart(0);
        list.insertAtLast(25);
        list.displayLinkedList();

        removeNthFromEnd(list,6);
        list.displayLinkedList();

    }

    public static void removeNthFromEnd(SinglyLinkedList list, int k){

        SinglyLinkedListNode headCopy = list.head;


        for (int i=0;i<k;i++){

            if (headCopy != null){
                headCopy = headCopy.next;
            }
            else {
                return;
            }
        }

        if (headCopy == null){
            list.head = list.head.next;
        }
        SinglyLinkedListNode slow = list.head;
        while (headCopy != null && headCopy.next != null){
            slow = slow.next;
            headCopy = headCopy.next;
        }





    }

}
