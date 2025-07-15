package K_list.B_Interview;

import K_list.A_Basic.A_SinglyLinkedList;
import K_list.node.SingleLinkedListNode;

public class E_ExchangeNodeInLinkedList {

  A_SinglyLinkedList list;
  int k;

  public E_ExchangeNodeInLinkedList(A_SinglyLinkedList list, int k) {
    this.list = list;
    this.k = k;
  }

  public void exchangeNode() {

        var len = list.size();
        if (k > len){
            System.out.println("Exchange Not Possible");
            return;
        }
        System.out.println("Size = "+len);

        var kthNodeFromLastIndex = len-k;

        var kthNodeFromLastPrev = list.head;
        for (int i=0;i<kthNodeFromLastIndex-1;i++){
            kthNodeFromLastPrev = kthNodeFromLastPrev.next;
        }

        var kthNodeFromLast = kthNodeFromLastPrev.next;

        System.out.println("Kth Node from Last Prev= "+kthNodeFromLastPrev.value);
        System.out.println("Kth Node from Last = "+kthNodeFromLast.value);

        var kthNodefromStartPrev = list.head;
        for (int i=0;i<k-2;i++){
            kthNodefromStartPrev = kthNodefromStartPrev.next;
        }
        SingleLinkedListNode kthNodeFromStart;
        if (k==1){
            kthNodeFromStart = list.head;
        }
        else {
            kthNodeFromStart = kthNodefromStartPrev.next;
        }

        System.out.println("Kth Node from Start Prev = "+kthNodefromStartPrev.value);
        System.out.println("Kth Node from Start = "+kthNodeFromStart.value);

        var temp = kthNodeFromStart.next;
        kthNodeFromLastPrev.next = kthNodeFromStart;
        kthNodeFromStart.next = kthNodeFromLast.next;
        kthNodefromStartPrev.next = kthNodeFromLast;
        kthNodeFromLast.next = temp;

    }
}
