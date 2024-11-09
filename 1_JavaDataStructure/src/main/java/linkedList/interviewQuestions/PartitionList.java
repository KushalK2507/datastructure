package linkedList.interviewQuestions;

import java.util.List;

public class PartitionList {


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);


        System.out.println(partition(head,3).val);

    }


    public static ListNode partition(ListNode head, int x) {


        ListNode smallerElement = new ListNode();
        ListNode greaterElement = new ListNode();

        ListNode smallerCopy = smallerElement;
        ListNode greaterCopy = greaterElement;

        while(head != null){

            if(head.val < x){
                smallerCopy.next = head;
                smallerCopy = smallerCopy.next;
            }
            else{
                greaterCopy.next = head;
                greaterCopy = greaterCopy.next;
            }
            head = head.next;
        }

        smallerCopy.next = greaterElement.next;
        greaterCopy.next = null;

        return smallerElement.next;
    }
}
