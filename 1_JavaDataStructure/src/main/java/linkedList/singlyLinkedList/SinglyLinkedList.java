package linkedList.singlyLinkedList;

import linkedList.node.SingleLinkedListNode;

public class SinglyLinkedList {
    public SingleLinkedListNode head;
    private int size;

    public int size(){
        return size;
    }

    public static void main (String[] args){

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.create(5);
        System.out.println(singlyLinkedList.head.value);

        singlyLinkedList.insertAtBegining(6);
        System.out.println(singlyLinkedList.head.value);
        singlyLinkedList.insertAtMid(8);
        singlyLinkedList.insertAtMid(10);
        singlyLinkedList.insertAtLast(25);
        singlyLinkedList.traversal();

        boolean result = singlyLinkedList.searchElement(0);
        System.out.println(result);

        boolean deleteResult = singlyLinkedList.delete(8);
        System.out.println("Delete Result "+deleteResult);
        singlyLinkedList.traversal();

        int deleteLocationResult = singlyLinkedList.deletionFromLocation(2);
        System.out.println("Delete Result of location "+deleteLocationResult);
        singlyLinkedList.traversal();

        singlyLinkedList.reverseSinglyLinkedList();
        singlyLinkedList.traversal();

        System.out.println(singlyLinkedList.middleNode());

        //Finding nth Node from end.
        //In this we take 2 pointers:
        // First we'll make 1 pointer n(value will be nth place from end) given places forward
        // In next loop we make second pointer move and also 1st pointer move till end.
        // By this logic second pointer will be pointing to the nth place from end when first pointer each the end.
        singlyLinkedList.traversal();
        System.out.println("Nth node from end = "+singlyLinkedList.nThNodeFromEnd(2).value);

    }

    public SingleLinkedListNode create(int value){

        head = new SingleLinkedListNode();
        SingleLinkedListNode node = new SingleLinkedListNode();
        node.next = null;
        head = node;
        node.value = value;
        size = 1;

        return head;

    }
    public SingleLinkedListNode insertAtBegining(int value){
        SingleLinkedListNode node = new SingleLinkedListNode();
        node.next=head;
        head=node;
        node.value= value;

        size ++;
        return head;
    }

    public SingleLinkedListNode insertAtMid(int value){

        SingleLinkedListNode node = new SingleLinkedListNode();
        SingleLinkedListNode headCopy = head;
        for (int i=1;i<=size/2;i++){
            headCopy=head.next;
        }


        node.value=value;
        node.next = headCopy.next;
        headCopy.next = node;
        size ++;

        return head;
    }

    public SingleLinkedListNode insertAtLast(int value){

        SingleLinkedListNode node = new SingleLinkedListNode();
        node.value = value;
        SingleLinkedListNode headCopy = head;
        while (headCopy.next != null){
            headCopy = headCopy.next;
        }
        headCopy.next = node;
        node.next=null;
        size++;
        return head;

    }
    public void traversal(){

        SingleLinkedListNode headCopy = head;
        while (headCopy != null){
            System.out.print(headCopy.value+ " ");
            headCopy = headCopy.next;
        }
        System.out.println();
    }

    public boolean searchElement(int elementTobeSearched){

        SingleLinkedListNode headCopy = head;
        while (headCopy != null){
            if(headCopy.value == elementTobeSearched){

                return true;
            }
            headCopy = headCopy.next;
        }
        return false;
    }

    public  int deletionFromLocation(int location){
        SingleLinkedListNode headCopy = head;
        if(location > size){
            System.out.println("Location is greater than List Size");
            return -1;
        }
        if(location == size){
            int value = headCopy.value;
            head = null;
            size--;
            return value;

        }
        for (int i=1;i<location-1;i++){
            if(headCopy != null){
                headCopy = headCopy.next;
            }
        }
        int value = headCopy.value;
        headCopy = headCopy.next;
        head = headCopy;
        size--;
        return value;
    }
    public boolean delete(int elementToBeDeleted){
        SingleLinkedListNode headCopy = head;
        if(headCopy == null){
            return false;
        }

        // List having only single node which needs to be deleted
        if(headCopy.value == elementToBeDeleted && headCopy.next == null){
            headCopy = null;
            size--;
            return true;
        }
        while (headCopy.next != null){
            // elements need to deleted at first but list has more elements
            if(headCopy.value == elementToBeDeleted){
                head = headCopy.next;

                size--;
                return true;
            }

            // delete the element in any location in between the list
            if(headCopy.next.value == elementToBeDeleted) {
                if (headCopy.next.next == null){
                    size--;
                    headCopy.next=null;
                }
                else {
                    size--;
                    headCopy.next= headCopy.next.next;
                }

                return  true;
            }
            headCopy = headCopy.next;
        }

        return false;
    }

    public void reverseSinglyLinkedList(){
        SingleLinkedListNode current = head;
        SingleLinkedListNode previous = null;
        SingleLinkedListNode temp = null;
        while (current != null){
            temp = current.next;
            current.next =  previous;
            previous=current;
            current=temp;

        }
        head = previous;

    }

    public int middleNode(){
        SingleLinkedListNode fast = head;
        SingleLinkedListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return  slow.value;
    }

    public SingleLinkedListNode nThNodeFromEnd(int n){
        if(head == null){
            return head;
        }

        SingleLinkedListNode start = new SingleLinkedListNode(-1);
        start.next = head;
        SingleLinkedListNode fast = start;
        SingleLinkedListNode slow = start;
        for(int i=0;i<n;i++){
            fast= fast.next;
        }


        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }


        slow.next = slow.next.next;

        return start.next;
    }
    public SingleLinkedListNode getNode(int data){
        SingleLinkedListNode headCopy = head;
        while(headCopy != null){
            if(headCopy.value == data){
                return headCopy;
            }
            headCopy = headCopy.next;
        }
        return null;
    }

    public SingleLinkedListNode getNodeAtLocation(int location){
        SingleLinkedListNode headCopy = head;
        if(location > size){
            return null;
        }
        for (int i=1;i< location;i++){
            headCopy = headCopy.next;
        }
        return headCopy;
    }

    public void insertNodeAtLast(SingleLinkedListNode node){
        SingleLinkedListNode headCopy = head;
        while(headCopy.next != null){
            headCopy = headCopy.next;
        }
        headCopy.next = node;

    }

    public void swapPair(){
        int temp ;

        SingleLinkedListNode headCopy = head;

        while(headCopy.next!=null){

            temp = headCopy.value;
            headCopy.value=headCopy.next.value;
            headCopy.next.value = temp;

            headCopy = headCopy.next.next;
        }

    }


}
