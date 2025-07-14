package K_list;

import K_list.node.SingleLinkedListNode;

public class F_InsertInSortedList {

  public A_SinglyLinkedList list;

  public F_InsertInSortedList(A_SinglyLinkedList list) {
    this.list = list;
  }

  public A_SinglyLinkedList insertInSortedList(int value) {
    var listHead = list.head;
    var isInserted = false;
    SingleLinkedListNode newNode = new SingleLinkedListNode(value);
    while (listHead.next != null) {
      if (listHead.next.value > value) {
        var temp = listHead.next;
        listHead.next = newNode;
        newNode.next = temp;
        isInserted = true;
        break;
            }
            listHead = listHead.next;
        }

        if (!isInserted){
            listHead.next = newNode;
        }

        return list;
    }
}
