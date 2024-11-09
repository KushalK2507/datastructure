package org.singlyLinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SinglyLinkedList {

    SinglyLinkedListNode head;

    public void create(int val){

       head = new SinglyLinkedListNode(val);
    }

    public void insertAtStart(int val){

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(val);

        SinglyLinkedListNode temp = head;
        head = newNode;
        newNode.next = temp;
    }

    public void insertInMid(int val){
        SinglyLinkedListNode newNode =  new SinglyLinkedListNode(val);

        SinglyLinkedListNode slowPointer = head;
        SinglyLinkedListNode fastPointer = head;
        while (fastPointer.next != null && fastPointer.next.next != null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }

        SinglyLinkedListNode temp = slowPointer.next;
        slowPointer.next=newNode;
        newNode.next = temp;

    }
    public void insertAtLast(int val){

        SinglyLinkedListNode newNode  = new SinglyLinkedListNode(val);
        SinglyLinkedListNode headCopy = head;
        while (headCopy.next != null){
            headCopy = headCopy.next;
        }
        headCopy.next = newNode;
    }
    public void deleteAtFirst(){
        head = head.next;
    }

    public void deleteAtLast(){

        SinglyLinkedListNode headCopy = head;
        while (headCopy.next != null && headCopy.next.next != null){
            headCopy = headCopy.next;
        }
        headCopy.next= null;
    }

    public void removeDuplicates(){

        Set<Integer> elements = new HashSet<>();
        SinglyLinkedListNode headCopy = head;
        elements.add(headCopy.val);
        while (headCopy!= null){

            if(headCopy.next != null && !elements.add(headCopy.next.val)){
                headCopy.next = headCopy.next.next;
            }else {
                headCopy = headCopy.next;
            }
        }
    }

    public SinglyLinkedListNode sortSinglyLinkedList(SinglyLinkedListNode head){

        if(head == null || head.next == null){
            return head;
        }

        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;
        SinglyLinkedListNode prev= null;

        while (fast != null && fast.next != null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next = null;
        SinglyLinkedListNode l2=sortSinglyLinkedList(head);
        SinglyLinkedListNode l1=sortSinglyLinkedList(slow);


        return mergeSort(l1,l2);



    }

    private SinglyLinkedListNode mergeSort(SinglyLinkedListNode l1, SinglyLinkedListNode l2){

        SinglyLinkedListNode res = new SinglyLinkedListNode(-1);
        SinglyLinkedListNode resCopy = res;

        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                resCopy.next = l1;
                l1=l1.next;
            }
            else {
                resCopy.next=l2;
                l2=l2.next;
            }
            resCopy=resCopy.next;
        }
        if(l1 != null){

            while (l1 != null){
                resCopy.next = l1;
                l1 = l1.next;
                resCopy = resCopy.next;
            }
        }

        if(l2 != null){

            while (l2 != null){
                resCopy.next = l2;
                l2 = l2.next;
                resCopy = resCopy.next;
            }
        }

        return res.next;
    }

    public void insertInSortedList(int val){


        SinglyLinkedListNode headCopy = head;
        if(val < headCopy.val ){
            insertAtStart(val);
            return;
        }
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(val);
        while (headCopy != null){
            if(headCopy.next != null && headCopy.next.val > val){
                SinglyLinkedListNode temp = headCopy.next;
                headCopy.next= newNode;
                newNode.next=temp;
                return;
            }
            if (headCopy.next == null){
                insertAtLast(val);
                return;
            }
            headCopy=headCopy.next;
        }

    }

    public void displayLinkedList(){

        SinglyLinkedListNode nodeCopy = head;
        while (nodeCopy != null){
            if (nodeCopy.next != null){
                System.out.print(nodeCopy.val+" -> ");
            }else {
                System.out.print(nodeCopy.val);
            }

            nodeCopy=nodeCopy.next;
        }
        System.out.println();
    }

    public void displayLinkedList(SinglyLinkedListNode head){

        SinglyLinkedListNode nodeCopy = head;
        while (nodeCopy != null){
            if(nodeCopy.next != null){
                System.out.print(nodeCopy.val+" -> ");
            }else {
                System.out.print(nodeCopy.val);
            }

            nodeCopy=nodeCopy.next;
        }
        System.out.println();
    }

    public void reverse(){

        SinglyLinkedListNode headCopy = head;
        SinglyLinkedListNode prev=null;
        SinglyLinkedListNode curr=headCopy;
        SinglyLinkedListNode temp = null;
        while (curr != null){
            temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }

        head=prev;

    }

    public SinglyLinkedListNode linkedListWithLoop(){

        SinglyLinkedListNode first = new SinglyLinkedListNode();
        first.val= 5;
        SinglyLinkedListNode second = new SinglyLinkedListNode();
        first.next = second;
        second.val = 4;
        SinglyLinkedListNode third = new SinglyLinkedListNode();
        second.next = third;
        third.val = 7;
        SinglyLinkedListNode forth = new SinglyLinkedListNode();
        third.next = forth;
        forth.val = 9;
        SinglyLinkedListNode fifth = new SinglyLinkedListNode();
        forth.next = fifth;
        fifth.val = 10;
        SinglyLinkedListNode sixth = new SinglyLinkedListNode();
        fifth.next =  sixth;
        sixth.val = 12;
        sixth.next = third;

        return  first;
    }
    public void displayLinkedListWithLoop(SinglyLinkedListNode head){

        Set<SinglyLinkedListNode> elements = new HashSet<>();
        while (head != null && elements.add(head)){
            System.out.print(head.val+"-> ");
            head=head.next;
        }

        System.out.println();

    }

    public SinglyLinkedListNode detectLoop(SinglyLinkedListNode head){

        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;

        while (fast != null && fast.next != null){

            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }

    public SinglyLinkedListNode startingNodeLoop(SinglyLinkedListNode head){

        SinglyLinkedListNode slowNode = detectLoop(head);

        SinglyLinkedListNode headCopy = head;
        while (headCopy != slowNode){

            slowNode = slowNode.next;
            headCopy = headCopy.next;
        }
        return slowNode;
    }

    public boolean removeLoop(SinglyLinkedListNode head){

        SinglyLinkedListNode slowNode = detectLoop(head);

        SinglyLinkedListNode headCopy = head;
        while (headCopy.next != slowNode.next){

            slowNode = slowNode.next;
            headCopy = headCopy.next;
        }
        slowNode.next = null;
        return true;
    }

    public SinglyLinkedListNode getLastNode(){

        SinglyLinkedListNode headCopy = head;
        while (headCopy.next != null){
            headCopy = headCopy.next;
        }

        return headCopy;
    }

    public int size(){

        SinglyLinkedListNode headCopy = head;
        int size=0;
        while (headCopy != null){
            size++;
            headCopy = headCopy.next;
        }

        return size;
    }
}
