package K_list;

import K_list.node.SingleLinkedListNode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2List {

    SinglyLinkedList list1;
    SinglyLinkedList list2;

    public IntersectionOf2List(SinglyLinkedList list1,SinglyLinkedList list2){
        this.list1 = list1;
        this.list2 = list2;
    }

    public SingleLinkedListNode intersectionOfLinkedList(SinglyLinkedList linkedList, SinglyLinkedList linkedList1){
        SingleLinkedListNode linkedListHeadCopy = linkedList.head;
        while (linkedListHeadCopy != null){
            SingleLinkedListNode linkedList1HeadCopy = linkedList1.head;
            while(linkedList1HeadCopy != null){
                if(linkedListHeadCopy == linkedList1HeadCopy ){
                    return linkedList1HeadCopy;
                }
                linkedList1HeadCopy = linkedList1HeadCopy.next;
            }
            linkedListHeadCopy = linkedListHeadCopy.next;
        }
        return null;
    }

    public SingleLinkedListNode intersectionOfLinkedListUsingCollection(SinglyLinkedList linkedList, SinglyLinkedList linkedList1){
        Set<SingleLinkedListNode> singleLinkedListNodes = new HashSet<>();
        SingleLinkedListNode linkedListNode = linkedList.head;
        while (linkedListNode != null){
            singleLinkedListNodes.add(linkedListNode);
            linkedListNode = linkedListNode.next;
        }
        SingleLinkedListNode linkedListNode1 = linkedList1.head;
        while(linkedListNode1 != null){
            if(!singleLinkedListNodes.add(linkedListNode1)){
                return linkedListNode1;
            }
            linkedListNode1 = linkedListNode1.next;
        }
        return null;
    }

    public SingleLinkedListNode interSectionOfLinkedListWithLessSpaceComplexity(SinglyLinkedList list1, SinglyLinkedList list2){
        var list1Len = list1.size();
        var list2Len = list2.size();
        var list1Head = list1.head;
        var list2Head = list2.head;
        if(list1Len > list2Len){
            for (int i=0;i<list1Len-list2Len;i++){
                list1Head = list1Head.next;
            }
        }else {
            for (int i=0;i<list2Len-list1Len;i++){
                list2Head = list2Head.next;
            }
        }

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
