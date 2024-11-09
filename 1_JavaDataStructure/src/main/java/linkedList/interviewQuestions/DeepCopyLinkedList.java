package linkedList.interviewQuestions;

public class DeepCopyLinkedList {

    public static void main(String[] args) {

        DeepNodeLinkedList list = new DeepNodeLinkedList();
        DeepCopyNode head = list.create(7);
        DeepCopyNode one = list.insertAtLast(13);
        DeepCopyNode two = list.insertAtLast(11);
        DeepCopyNode three = list.insertAtLast(10);
        DeepCopyNode four = list.insertAtLast(1);

        head.random = four.next;
        one.random = head;
        two.random = four;
        three.random = two;
        four.random = head;

        list.traversal();

        DeepCopyNode newHead = list.deepCopy();
        list.traversal(newHead);

        System.out.println(list.head == newHead);

    }


}

class DeepNodeLinkedList{

    public DeepCopyNode head;
    public DeepCopyNode create(int val) {
        head = new DeepCopyNode(val);
        return head;
    }
    public DeepCopyNode insertAtLast(int val){
        DeepCopyNode newNode = new DeepCopyNode(val);
        DeepCopyNode headCopy = head;
        while (headCopy.next != null){
            headCopy = headCopy.next;
        }
        headCopy.next = newNode;
        return headCopy.next;
    }

    public void traversal(){
        DeepCopyNode headCopy = head;
        while (headCopy != null){
            if(headCopy.next != null){
                System.out.print(headCopy.val+"(");
                int randomVal = headCopy.random != null ? headCopy.random.val : -1;
                System.out.print(randomVal+") -> ");
            }
            else {
                int randomVal = headCopy.random != null ? headCopy.random.val : -1;
                System.out.print(headCopy.val + "(" + randomVal + ")");
            }
            headCopy = headCopy.next;
        }
        System.out.println();
    }

    public void traversal(DeepCopyNode head){
        DeepCopyNode headCopy = head;
        while (headCopy != null){
            if(headCopy.next != null){
                System.out.print(headCopy.val+"(");
                int randomVal = headCopy.random != null ? headCopy.random.val : -1;
                System.out.print(randomVal+") -> ");
            }
            else {
                int randomVal = headCopy.random != null ? headCopy.random.val : -1;
                System.out.print(headCopy.val + "(" + randomVal + ")");
            }
            headCopy = headCopy.next;
        }
        System.out.println();
    }

    public DeepCopyNode deepCopy(){

        DeepCopyNode headCopy = head;
        //Creating the new Nodes and adding to current list
        while (headCopy != null){
            DeepCopyNode newNode = new DeepCopyNode(headCopy.val);
            newNode.next = headCopy.next;
            headCopy.next = newNode;
            headCopy = newNode.next;
        }

        headCopy = head;
        //Set the random to the new nodes
        while (headCopy != null){
            if (headCopy.random != null){
                headCopy.next.random = headCopy.random.next;
            }
            headCopy = headCopy.next.next;
        }

        //Separate the new List and old list
        headCopy = head;
        DeepCopyNode newListHead = headCopy.next;
        DeepCopyNode newList = newListHead;
        while (newList.next != null){
            headCopy.next = headCopy.next.next;
            newList.next = newList.next.next;

            headCopy = headCopy.next;
            newList = newList.next;
        }
        return newListHead;
    }


}

class DeepCopyNode{

    int val;
    DeepCopyNode next;

    DeepCopyNode random;


    public DeepCopyNode(int val){
        this.val = val;
        next = null;
        random = null;
    }



}