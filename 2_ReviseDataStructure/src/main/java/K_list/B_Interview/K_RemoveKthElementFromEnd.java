package K_list.B_Interview;

import K_list.A_Basic.A_SinglyLinkedList;

public class K_RemoveKthElementFromEnd {

  public A_SinglyLinkedList list;
  int k;

  public K_RemoveKthElementFromEnd(A_SinglyLinkedList list, int k) {
    this.list = list;
    this.k = k;
  }

  public void removeKthElementFromEnd() {

        var fast = list.head;
        for (int i=1;i<=k && fast!= null;i++){
            fast = fast.next;
        }
        if (fast == null){
            return;
        }
        var slow = list.head;
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        if (slow.next != null){
            slow.next = slow.next.next;
        }
        else {
            slow.next = null;
        }


    }
}
