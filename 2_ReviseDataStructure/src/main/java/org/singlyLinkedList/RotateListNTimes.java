package org.singlyLinkedList;

public class RotateListNTimes {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.create(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);

        list.displayLinkedList();
        rotateListNTimes(list,2);
        list.displayLinkedList();



    }
    public static void rotateListNTimes(SinglyLinkedList list, int k){

        int size = list.size();
        k = k%size;
        k = size-k;

        SinglyLinkedListNode temp = new SinglyLinkedListNode(-1);
        temp.next = list.head;
        SinglyLinkedListNode headCopy = list.head;
        while (headCopy.next != null){
            headCopy = headCopy.next;
        }
        headCopy.next = list.head;


       while (k-- > 0){
           temp = temp.next;
       }


       list.head = temp.next;
       temp.next = null;



    }
}
