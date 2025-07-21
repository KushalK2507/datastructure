package K_list.B_Interview;

import K_list.node.SingleLinkedListNode;

public class O_ReverseListInGroup {
    public SingleLinkedListNode reverseKGroup(SingleLinkedListNode head, int k) {
        var size = size(head);
        if(head == null || k ==1 || k > size){
            return head;
        }
        var dummy = new SingleLinkedListNode();
        dummy.next = head;
        var prevGroupEnd = dummy;
        while(true){
            var kthNode = getKthNode(prevGroupEnd,k);
            if(kthNode == null){
                break;
            }
            var groupNext = kthNode.next;
            var prev = kthNode.next;
            var curr = prevGroupEnd.next;
            while(curr != groupNext){
                var temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            var temp = prevGroupEnd.next;
            prevGroupEnd.next = kthNode;
            prevGroupEnd = temp;
        }

        return dummy.next;
    }

    public SingleLinkedListNode getKthNode(SingleLinkedListNode node,int k){
        while(node != null && k> 0){
            node=node.next;
            k--;
        }
        return node;
    }

    public int size(SingleLinkedListNode node){
        var len =0;
        while(node != null){
            node = node.next;
            len++;
        }
        return len;
    }
}