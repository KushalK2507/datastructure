package linkedList.interviewQuestions;

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class ReverseLinkedList {

    public static void main(String[] args) {

        ListNode dummy = new ListNode();

        System.out.println("Val and Next are"+dummy.val+" "+dummy.next);

    }


    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null || left == right){
            return head;
        }

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        dummy.next = head;

        for(int i=0;i<left-1;i++){
            prev = prev.next;
        }

        ListNode curr = prev.next;
        int count = right - left ;
        ListNode temp = null;
        while(count > 0 && curr != null){
            temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
            count--;
        }

        return dummy.next;
    }
}
