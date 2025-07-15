package K_list.A_Basic;

import K_list.node.SingleLinkedListNode;

public class C_ReverseLinkedList {

  public A_SinglyLinkedList list;

  public C_ReverseLinkedList(A_SinglyLinkedList list) {
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
