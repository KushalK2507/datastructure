package K_list;

import K_list.node.SingleLinkedListNode;

public class N_SortListUsingMergeSort {

  public A_SinglyLinkedList list;

  public N_SortListUsingMergeSort(A_SinglyLinkedList list) {
    this.list = list;
  }

  public SingleLinkedListNode sortList(SingleLinkedListNode head) {

    if (head == null || head.next == null) {
            return head;
        }
        var slow = head;
        var fast = head;
        SingleLinkedListNode prev = null;
        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        SingleLinkedListNode l1 = sortList(head);
        SingleLinkedListNode l2 = sortList(slow);
        return mergeList(l1,l2);
    }

    public SingleLinkedListNode mergeList(SingleLinkedListNode l1, SingleLinkedListNode l2){
        SingleLinkedListNode p = new SingleLinkedListNode(-1);
        var l = p;
        while (l1 != null && l2 != null){
            if (l1.value < l2.value){
                l.next = l1;
                l1 = l1.next;
            }
            else {
                l.next = l2;
                l2 = l2.next;
            }
            l = l.next;
        }

        if (l1 != null){
            l.next = l1;
        }
        if (l2!=null){
            l.next = l2;
        }

        return p.next;
    }
}
