package list;

import list.node.SingleLinkedListNode;

public class SinglyLinkedList {
    public SingleLinkedListNode head;

    public SingleLinkedListNode create(int val){
        head = new SingleLinkedListNode(val);
        return head;
    }

    public void insertAtFirst(int val){
        SingleLinkedListNode node = new SingleLinkedListNode(head,val);
        head = node;
    }

    public void insertAtLast(int val){
        var headCopy = head;
        while (headCopy.next != null){
            headCopy = headCopy.next;
        }
        headCopy.next = new SingleLinkedListNode(val);
    }

    public void insertListAtLast(SingleLinkedListNode node){
        var headCopy = head;
        while (headCopy.next != null){
            headCopy = headCopy.next;
        }
        headCopy.next = node;
    }

    public void insertInMid(int val){
        var slow = head;
        var fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        SingleLinkedListNode node = new SingleLinkedListNode(val);
        var temp = slow.next;
        slow.next = node;
        node.next = temp;
    }

    public void traversal(){
        var headCopy = head;
        while (headCopy != null){
            if (headCopy.next != null){
                System.out.print(headCopy.value+" -> ");
            }
            else {
                System.out.print(headCopy.value);
            }
            headCopy = headCopy.next;
        }
        System.out.println();
    }

    public void traversal(SingleLinkedListNode head){
        var headCopy = head;
        while (headCopy != null){
            if (headCopy.next != null){
                System.out.print(headCopy.value+" -> ");
            }
            else {
                System.out.print(headCopy.value);
            }
            headCopy = headCopy.next;
        }
        System.out.println();
    }

    public void deleteAtFirst(){

        if (head != null){
            head = head.next;
        }

    }

    public void deleteAtLast(){
        var headCopy = head;
        while (headCopy.next != null && headCopy.next.next != null){
            headCopy = headCopy.next;
        }
        headCopy.next = null;

    }

    public void deleteAtSpecificPosition(int position){
        var headCopy = head;
        while (headCopy != null && position > 1){
            headCopy = headCopy.next;
            position--;
        }

        if (headCopy != null){
            if (headCopy.next != null){
                headCopy.next = headCopy.next.next;
            }
        }
    }

    public void deleteSpecificElement(int val){

        var headCopy = head;

        if (headCopy.value == val){
            deleteAtFirst();
        }

        while (headCopy != null && headCopy.next != null){
            if (headCopy.next.value == val){
                headCopy.next = headCopy.next.next;
            }
            headCopy = headCopy.next;
        }

        if (headCopy != null && headCopy.value == val){
            deleteAtLast();
        }
    }

    public int size(){

        var headCopy = head;
        int count=0;
        while (headCopy != null){
            count++;
            headCopy = headCopy.next;
        }
        return count;
    }

}
