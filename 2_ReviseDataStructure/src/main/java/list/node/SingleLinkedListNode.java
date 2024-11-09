package list.node;

public class SingleLinkedListNode {

    public int value;
    public SingleLinkedListNode next;

    public SingleLinkedListNode(SingleLinkedListNode next, int value){
        this.value = value;
        this.next = next;
    }

    public SingleLinkedListNode(int value){
        this.value = value;
        this.next = null;
    }
}
