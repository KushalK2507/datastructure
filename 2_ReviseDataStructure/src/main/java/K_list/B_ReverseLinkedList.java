package K_list;

import K_list.node.SingleLinkedListNode;

public class B_ReverseLinkedList {

  public A_SinglyLinkedList list;

  public B_ReverseLinkedList(A_SinglyLinkedList list) {
    this.list = list;
  }

  public void reverseList() {

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
