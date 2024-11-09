package list;

import list.node.SingleLinkedListNode;

public class ReverseLinkedListInGivenGroup {

    public SinglyLinkedList list;
    int left;
    int right;

    public ReverseLinkedListInGivenGroup(SinglyLinkedList list,int left, int right){
        this.list = list;
        this.left = left;
        this.right = right;
    }

    public void reverseListInGroup(){

        SingleLinkedListNode dummy = new SingleLinkedListNode(-1);
        SingleLinkedListNode prev = dummy;
        dummy.next = list.head;
        for (int i=0;i<left-1;i++){
            prev = prev.next;
        }

        int count = right-left;
        var curr = prev.next;
        while (count > 0 && curr != null){
            var temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
            count--;
        }

    }
}
