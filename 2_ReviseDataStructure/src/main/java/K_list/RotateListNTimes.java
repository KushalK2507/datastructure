package K_list;

import K_list.node.SingleLinkedListNode;

public class RotateListNTimes {

    public SinglyLinkedList list;
    int n;

    public RotateListNTimes(SinglyLinkedList list,int n){
        this.list = list;
        this.n = n;
    }

    public void rotateList(){
        var size = list.size();
        if (n > size){
            n = n% size;
        }

        SingleLinkedListNode temp = new SingleLinkedListNode(-1);
        temp.next = list.head;

        // Convert as circular linked list so last node point to head
        var headCopy = list.head;
        while (headCopy.next != null){
            headCopy = headCopy.next;
        }
        headCopy.next = list.head;

        while (n-- > 0){
            temp = temp.next;
        }

        list.head = temp.next;
        temp.next= null;
    }
}
