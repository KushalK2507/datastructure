package list;

import list.node.SingleLinkedListNode;

public class ReverseLinkedList {

    public SinglyLinkedList list;

    public ReverseLinkedList(SinglyLinkedList list){
        this.list = list;
    }

    public void reverseList(){

        SingleLinkedListNode curr = list.head;
        SingleLinkedListNode prev= null;
        SingleLinkedListNode temp = null;

        while (curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        list.head = prev;
    }
}
