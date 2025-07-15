package K_list.B_Interview;

import K_list.A_Basic.A_SinglyLinkedList;
import K_list.node.SingleLinkedListNode;

public class H_SwapElements {

  A_SinglyLinkedList list;
  int partitionElement;

  public H_SwapElements(A_SinglyLinkedList list, int partitionElement) {
    this.list = list;
    this.partitionElement = partitionElement;
  }

  public void swap() {

    if (list.head == null) {
      return;
    }
    A_SinglyLinkedList leftList = null;
    A_SinglyLinkedList rightList = null;

    var headCopy = list.head;
    while (headCopy != null) {
      if (headCopy.value < partitionElement) {
        if (leftList == null) {
          leftList = new A_SinglyLinkedList();
          leftList.create(headCopy.value);
        } else {
          leftList.insertAtLast(headCopy.value);
                }
            }
            else {
                if (rightList == null){
          rightList = new A_SinglyLinkedList();
          rightList.create(headCopy.value);
                } else if (headCopy.value == partitionElement) {
                    rightList.insertAtFirst(headCopy.value);
                } else {
                    rightList.insertAtLast(headCopy.value);
                }
            }
            headCopy = headCopy.next;
        }

        if (leftList == null){
            list.head = rightList.head;
        }
        else {
            list.head = leftList.head;
            if (rightList != null){
                leftList.insertListAtLast(rightList.head);
            }

        }

    }

    public void swapNodes(){

        SingleLinkedListNode smallerHead = null, smallerLast = null;
        SingleLinkedListNode equalHead = null, equalLast = null;
        SingleLinkedListNode greaterHead = null, greaterLast = null;

        SingleLinkedListNode headCopy = list.head;
        while (headCopy != null){

            if (headCopy.value == partitionElement){
                if (equalHead == null){
                    equalHead=equalLast=headCopy;
                }
                else {
                    equalLast.next=headCopy;
                    equalLast = equalLast.next;
                }
            }
            if (headCopy.value < partitionElement){
                if (smallerHead == null){
                    smallerHead=smallerLast=headCopy;
                }
                else {
                    smallerLast.next=headCopy;
                    smallerLast = smallerLast.next;
                }
            }
            if (headCopy.value > partitionElement) {
                if (greaterHead == null) {
                    greaterHead = greaterLast = headCopy;
                } else {
                    greaterLast.next = headCopy;
                    greaterLast = greaterLast.next;
                }
            }
            headCopy = headCopy.next;
        }


        if (greaterLast.next != null){
            greaterLast.next = null;
        }

        if (smallerHead == null){
            smallerHead = smallerLast = equalHead;
            smallerLast.next = greaterHead;
        }
        else {
            smallerLast.next = equalLast;
            equalLast.next = greaterHead;
        }

        list.head = smallerHead;

    }
}
