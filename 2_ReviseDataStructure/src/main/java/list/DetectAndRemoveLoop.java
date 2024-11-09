package list;

import list.node.SingleLinkedListNode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DetectAndRemoveLoop {

    SinglyLinkedList list;


    public DetectAndRemoveLoop(){
        list = new SinglyLinkedList();
    }

    public SinglyLinkedList createListWithLoop(){
        SingleLinkedListNode head = list.create(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);

        SingleLinkedListNode headCopy = list.head;
        int postToCreateLoop=0;
        SingleLinkedListNode temp = null;
        while (headCopy.next != null){
            headCopy = headCopy.next;
            postToCreateLoop++;
            if (postToCreateLoop == 3){
                temp = headCopy;
            }
        }

        SingleLinkedListNode newNode = new SingleLinkedListNode(6);
        headCopy.next = newNode;
        newNode.next = temp;

        return list;
    }

    public SingleLinkedListNode detectLoop(){
        SingleLinkedListNode slow = list.head;
        SingleLinkedListNode fast = list.head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return slow;
            }
        }
        return null;
    }

    public int startingOfLoop(){
        SingleLinkedListNode node = detectLoop();
        SingleLinkedListNode temp = list.head;
        while (temp != node){
                node = node.next;
                temp = temp.next;
        }
        return temp.value;
    }

    public void removeLoop(){
        SingleLinkedListNode slow = detectLoop();
        SingleLinkedListNode temp = list.head;
        while (slow.next != temp.next){
            slow = slow.next;
            temp = temp.next;
        }
        slow.next = null;

    }


    public void traversalOfList(){

        System.out.print("List : ");
        Set<SingleLinkedListNode> listNodes = new LinkedHashSet<>();
        SingleLinkedListNode headCopy = list.head;
        while (headCopy != null && !listNodes.contains(headCopy)){
            listNodes.add(headCopy);
            headCopy = headCopy.next;
        }

        listNodes.forEach(node -> System.out.print(node.value+" -> "));
        System.out.println();
    }
}
