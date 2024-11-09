package linkedList.interviewQuestions;

public class RotateList {

    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k==0){
            return head;
        }

        ListNode temp = new ListNode();
        temp = head;
        int count=1;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        temp.next = head;
        k = k%count;
        k = count-k;
        while(k-- > 0){
            temp = temp.next;
        }

        head = temp.next;
        temp.next=null;
        return head;
    }
}
