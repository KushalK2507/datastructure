package list;

import list.node.SingleLinkedListNode;

public class InsertInSortedList {

    public SinglyLinkedList list;

    public InsertInSortedList(SinglyLinkedList list){
        this.list = list;
    }

    public SinglyLinkedList insertInSortedList(int value){
        var listHead = list.head;
        var isInserted = false;
        SingleLinkedListNode newNode = new SingleLinkedListNode(value);
        while (listHead.next != null){
            if (listHead.next.value > value){
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
