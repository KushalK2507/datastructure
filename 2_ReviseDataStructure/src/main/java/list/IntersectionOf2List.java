package list;

import list.node.SingleLinkedListNode;

public class IntersectionOf2List {

    SinglyLinkedList list1;
    SinglyLinkedList list2;

    public IntersectionOf2List(SinglyLinkedList list1,SinglyLinkedList list2){
        this.list1 = list1;
        this.list2 = list2;
    }

    public SingleLinkedListNode intersectionOf2List(){

        var list1Head = list1.head;
        var list2Head = list2.head;

        while (list1Head != null && list2Head != null){
            if (list1Head == list2Head){
                return list1Head;
            }
            list1Head = list1Head.next;
            list2Head = list2Head.next;
        }

        return null;

    }
}
