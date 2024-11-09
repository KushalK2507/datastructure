package org.singlyLinkedList;

public class SortLinkedList {

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.create(4);
        list.insertAtLast(1);
        list.insertAtStart(9);
        list.insertInMid(5);
        list.insertInMid(4);
        list.insertAtLast(2);
        list.displayLinkedList();

        list.head = sortLinkedList(list.head);
        list.displayLinkedList();

    }

    public static SinglyLinkedListNode sortLinkedList(SinglyLinkedListNode head){


        if(head == null || head.next == null){
            return head;
        }
        var slow = head;
        var fast = head;
        SinglyLinkedListNode prev= null;

        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        var l2 = sortLinkedList(head);
        var l1 = sortLinkedList(slow);

        return mergeSort(l1,l2);

    }

    public static SinglyLinkedListNode mergeSort(SinglyLinkedListNode l1, SinglyLinkedListNode l2){

        SinglyLinkedListNode res = new SinglyLinkedListNode(-1);
        var resCopy = res;
        while (l1 != null && l2!= null){
            if(l1.val < l2.val){
                resCopy.next = l1;
                l1= l1.next;
            }
            else {
                resCopy.next = l2;
                l2 = l2.next;
            }
            resCopy=resCopy.next;
        }

        if(l1 != null){

            while (l1 != null){
                resCopy.next = l1;
                resCopy = resCopy.next;
                l1 = l1.next;
            }
        }

        if(l2 != null){

            while (l2 != null){
                resCopy.next = l2;
                resCopy = resCopy.next;
                l2 = l2.next;
            }
        }

        return res.next;


    }
}
