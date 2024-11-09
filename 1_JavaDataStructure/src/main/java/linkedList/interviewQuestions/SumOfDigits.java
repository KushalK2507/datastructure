package linkedList.interviewQuestions;

import linkedList.singlyLinkedList.SinglyLinkedList;

//list1 = 7 -> 1 -> 6
//list2 =  5 -> 9 -> 2
//result = 2 -> 1 -> 9 (617+295)
public class SumOfDigits {

    public static void main(String[] args){

        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.create(7);
        linkedList.insertAtLast(1);
        linkedList.insertAtLast(6);
        linkedList.traversal();
        SinglyLinkedList linkedList2 = new SinglyLinkedList();
        linkedList2.create(2);
        linkedList2.insertAtBegining(9);
        linkedList2.insertAtBegining(5);
        linkedList2.traversal();

        SinglyLinkedList result = sumOfDigits(linkedList,linkedList2);
        result.traversal();
    }

    public static SinglyLinkedList sumOfDigits(SinglyLinkedList linkedList, SinglyLinkedList linkedList2){
        int carry =0;
        SinglyLinkedList result = new SinglyLinkedList();
        while (linkedList.head != null){
            int sum = linkedList.head.value + linkedList2.head.value + carry;
            if(sum > 9) {
                carry = sum /10;
                sum = sum %10;
            }
            if (result.head == null) {
                result.create(sum);
            }
            else{
                result.insertAtLast(sum);
            }
            linkedList.head = linkedList.head.next;
            linkedList2.head = linkedList2.head.next;
        }
        return result;
    }
}
