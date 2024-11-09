package linkedList.interviewQuestions;

import linkedList.node.SingleLinkedListNode;
import linkedList.singlyLinkedList.SinglyLinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Lists {

    public static void main (String[] args){

        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.create(5);
        linkedList.insertAtLast(4);
        linkedList.insertAtLast(3);
        linkedList.insertAtLast(2);
        linkedList.insertAtLast(1);
        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        linkedList1.create(8);
        linkedList1.insertAtLast(6);
        SingleLinkedListNode node = linkedList.getNode(4);
        linkedList1.insertNodeAtLast(node);
        SingleLinkedListNode intersectionNode =  intersectionOfLinkedList(linkedList, linkedList1);
        int value = intersectionNode != null ? intersectionNode.value : -1;
        System.out.println(value);

        SingleLinkedListNode intersectionNodeUsingCollection = intersectionOfLinkedListUsingCollection(linkedList, linkedList1);
        int result = intersectionNode != null ? intersectionNode.value : -1;
        System.out.println(result);

    }

    public static SingleLinkedListNode intersectionOfLinkedList(SinglyLinkedList linkedList, SinglyLinkedList linkedList1){
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

    public static SingleLinkedListNode intersectionOfLinkedListUsingCollection(SinglyLinkedList linkedList, SinglyLinkedList linkedList1){
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
}
