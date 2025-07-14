package K_list;

import K_list.node.SingleLinkedListNode;
import java.util.LinkedHashSet;
import java.util.Set;

public class C_CircularLinkedList {

  public SingleLinkedListNode head;

  public SingleLinkedListNode create(int val) {
    SingleLinkedListNode newNode = new SingleLinkedListNode(val);
    head = newNode;
    newNode.next = head;
    return head;
  }

    public void insertAtFirst(int val){
        SingleLinkedListNode newNode = new SingleLinkedListNode(val);
        SingleLinkedListNode headCopy  = head;
        while (headCopy.next != head){
            headCopy = headCopy.next;
        }
        newNode.next = head;
        head = newNode;
        headCopy.next = newNode;
    }

    public void insertInMid(int val){

        if (size() == 1){
            insertAtLast(val);
        }
        SingleLinkedListNode slow = head;
        SingleLinkedListNode fast = null;
        SingleLinkedListNode prev = null;
        while (fast != head){
            if (fast == null){
                fast = head;
            }
            prev = slow;
            slow = slow.next;
            fast= fast.next.next;
        }
        SingleLinkedListNode newNode = new SingleLinkedListNode(val);
        prev.next = newNode;
        newNode.next = slow;
    }

    public void insertAtLast(int val){

        SingleLinkedListNode newNode = new SingleLinkedListNode(val);
        SingleLinkedListNode headCopy = null;
        SingleLinkedListNode prev = null;
        while (headCopy != head){
            if (headCopy == null){
                headCopy = head;
            }
            prev = headCopy;
            headCopy = headCopy.next;
        }

        prev.next = newNode;
        newNode.next = head;

    }

    public void deleteAtLast(){

        SingleLinkedListNode headCopy = head;
        SingleLinkedListNode prev = null;
        while (headCopy.next != head){
            prev = headCopy;
            headCopy = headCopy.next;
        }
        prev.next = head;



    }

    public void deleteAtFirst(){

        SingleLinkedListNode headCopy = head;

        while (headCopy.next != head){
            headCopy = headCopy.next;
        }
        head = head.next;
        headCopy.next = head;
    }

    public void traversal(){
        Set<SingleLinkedListNode> listNodes = new LinkedHashSet<>();
        SingleLinkedListNode headCopy = head;
        while (headCopy != null && !listNodes.contains(headCopy)){
            listNodes.add(headCopy);
            headCopy = headCopy.next;
        }
        listNodes.forEach(node -> System.out.print(node.value+" -> "));
        System.out.println();
    }

    public int size(){
        SingleLinkedListNode headCopy = head;
        int size =1;
        while (headCopy!=null && headCopy.next != head){
            headCopy = headCopy.next;
            size++;
        }
        return size;
    }

    public void reversal(){

        if (head == null){
            throw new RuntimeException("List Is Empty");
        }

        SingleLinkedListNode curr = head;
        SingleLinkedListNode prev = null;
        SingleLinkedListNode temp ;

       do {
        temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
       }
       while (curr != head);

       head.next = prev;
       head = prev;

    }
}
