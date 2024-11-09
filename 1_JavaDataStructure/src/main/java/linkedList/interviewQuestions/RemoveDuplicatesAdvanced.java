package linkedList.interviewQuestions;

public class RemoveDuplicatesAdvanced {

//    Input: head = [1,2,3,3,4,4,5]
//    Output: [1,2,5]

//    Input: head = [1,1,1,2,3]
//    Output: [2,3]
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        dummy.next = head;

        while(prev.next != null && prev.next.next != null){

            if(prev.next.val == prev.next.next.val){
                int value = prev.next.val;
                while(prev.next != null && prev.next.val == value){
                    prev.next = prev.next.next;
                }
            }
            else{
                prev = prev.next;
            }
        }

        return  dummy.next;

    }
}
