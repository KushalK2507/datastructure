package linkedList.interviewQuestions;

import linkedList.node.SingleLinkedListNode;
import linkedList.singlyLinkedList.SinglyLinkedList;

public class ExchangeNodeLinkedList {

    public static void main (String[] args){

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        int [] a = {51,23,16,31,45,25,10,5};
        for (int i =0;i<a.length;i++){
            if(i==0){
                singlyLinkedList.create(a[i]);
            }
            else {
                singlyLinkedList.insertAtLast(a[i]);
            }
        }
        singlyLinkedList.traversal();
        System.out.println();

        int k=3;
        int len=0;
        SingleLinkedListNode copyHead = singlyLinkedList.head;
        while (copyHead !=null){
            copyHead = copyHead.next;
           len++;
        }

        int nodeFromEndIndex=len-k+1;

        if(nodeFromEndIndex < 0){
            return;
        }

        SingleLinkedListNode nodeFromStart = singlyLinkedList.head;
        SingleLinkedListNode nodeFromStart_prev=null;
        copyHead = singlyLinkedList.head;
        for (int i=1;i<k;i++){
            nodeFromStart_prev= copyHead;
            nodeFromStart = copyHead.next;
            copyHead =  copyHead.next;
        }
        SingleLinkedListNode nodeFromEnd = singlyLinkedList.head;
        SingleLinkedListNode nodeFromEnd_prev=null;
        copyHead = singlyLinkedList.head;
        for (int i=1;i<nodeFromEndIndex;i++){
            nodeFromEnd_prev= copyHead;
            nodeFromEnd = copyHead.next;
            copyHead=copyHead.next;
        }

        SingleLinkedListNode temp = nodeFromEnd.next;
       nodeFromStart_prev.next = nodeFromEnd;
       nodeFromEnd.next=nodeFromStart.next;
       nodeFromEnd_prev.next= nodeFromStart;
       nodeFromStart.next= temp;


       singlyLinkedList.traversal();




    }
}
