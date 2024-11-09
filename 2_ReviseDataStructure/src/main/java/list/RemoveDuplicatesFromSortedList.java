package list;

import list.node.SingleLinkedListNode;

public class RemoveDuplicatesFromSortedList {


    public SinglyLinkedList list;

    public RemoveDuplicatesFromSortedList(SinglyLinkedList list){
        this.list = list;
    }


    public SinglyLinkedList removeDuplicateFromSortedList(){
        var listHeadNode = list.head;
        while (listHeadNode != null){
            if (listHeadNode.next!= null && listHeadNode.value == listHeadNode.next.value){
                listHeadNode.next = listHeadNode.next.next;
            }
            else {
                listHeadNode = listHeadNode.next;
            }
        }
        return list;
    }

    public void removeElementsWhichAreDuplicate(){
        var dummy = new SingleLinkedListNode(-1);
        var prev = dummy;
        dummy.next = list.head;
        while (prev.next != null && prev.next.next != null){
            if (prev.next.value == prev.next.next.value){
                int val = prev.next.value;
                while (prev.next.value == val){
                    prev.next = prev.next.next;
                }
            }else {
                prev = prev.next;
            }
        }
        list.head = dummy.next;
    }
}
