package K_list.B_Interview;

import K_list.A_Basic.A_SinglyLinkedList;
import K_list.node.SingleLinkedListNode;

public class L_RemoveDuplicatesFromSortedList {

  public A_SinglyLinkedList list;

  public L_RemoveDuplicatesFromSortedList(A_SinglyLinkedList list) {
    this.list = list;
  }

  public A_SinglyLinkedList removeDuplicateFromSortedList() {
    var listHeadNode = list.head;
    while (listHeadNode != null) {
      if (listHeadNode.next != null && listHeadNode.value == listHeadNode.next.value) {
        listHeadNode.next = listHeadNode.next.next;
      } else {
        listHeadNode = listHeadNode.next;
      }
    }
    return list;
  }

  public void removeElementsWhichAreDuplicate() {
    var dummy = new SingleLinkedListNode(-1);
    var prev = dummy;
    dummy.next = list.head;
    while (prev.next != null && prev.next.next != null) {
      if (prev.next.value == prev.next.next.value) {
        int val = prev.next.value;
        while (prev.next.value == val) {
          prev.next = prev.next.next;
        }
      } else {
        prev = prev.next;
      }
    }
    list.head = dummy.next;
  }
}
