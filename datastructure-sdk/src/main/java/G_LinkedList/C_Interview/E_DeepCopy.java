package G_LinkedList.C_Interview;

import G_LinkedList.A_SinglyLinkedList.node.SingleLinkedListNode;

public class E_DeepCopy {

    ListWithRandomNode list;

    public E_DeepCopy(ListWithRandomNode list){this.list = list;}

    public void deepCopy(){

    }
}

class RandomNode{

    int val;
    RandomNode next;
    RandomNode randomNode;

    public RandomNode(int val){
        this.val = val;
        this.next = null;
        this.randomNode = null;
    }

}

class ListWithRandomNode{

    RandomNode head;

    public RandomNode create(int val){
        head = new RandomNode(val);
        return head;
    }

    public void insertAtLast(int val){

    }

    public void populateRandom(){

    }


    public void traversal(){

    }
}
