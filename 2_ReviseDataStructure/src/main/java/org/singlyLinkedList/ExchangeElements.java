package org.singlyLinkedList;

public class ExchangeElements {

    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.create(1);
        linkedList.insertAtLast(2);
        linkedList.insertAtLast(3);
        linkedList.insertAtLast(4);
        linkedList.insertAtLast(5);

        System.out.print("Orignal Linked List = ");
        linkedList.displayLinkedList();
        int k =2;

        SinglyLinkedListNode[] lastNodeArray = lastNode(linkedList.head,k);

        SinglyLinkedListNode[] startNodeArray = startNode(linkedList.head,k);
        SinglyLinkedListNode startNodePrev = startNodeArray[0];
        SinglyLinkedListNode startNode = startNodeArray[1];

        SinglyLinkedListNode lastNodePrev= lastNodeArray[0];
        SinglyLinkedListNode lastNode= lastNodeArray[1];

        SinglyLinkedListNode StartNodePrevTemp = lastNode.next;
        startNodePrev.next = lastNode;
        lastNode.next = startNode.next;
        lastNodePrev.next = startNode;
        startNode.next = StartNodePrevTemp;

        linkedList.displayLinkedList();

    }

    private static SinglyLinkedListNode[] lastNode(SinglyLinkedListNode head, int k){

        SinglyLinkedListNode headCopy = head;
        for(int i=0;i<k;i++){
            headCopy = headCopy.next;
        }

        SinglyLinkedListNode lastNode = head;
        SinglyLinkedListNode lastNodePrev= null;
        while (headCopy!= null){
            lastNodePrev = lastNode;
            lastNode = lastNode.next;
            headCopy=headCopy.next;
        }

        return new SinglyLinkedListNode[]{lastNodePrev,lastNode};

    }

    private static SinglyLinkedListNode[] startNode(SinglyLinkedListNode head, int k){

        SinglyLinkedListNode start = head;
        SinglyLinkedListNode startPrev = null;

        for (int i=0;i<k-1;i++){
            startPrev = start;
            start = start.next;
        }


        return new SinglyLinkedListNode[]{startPrev,start};

    }



}
