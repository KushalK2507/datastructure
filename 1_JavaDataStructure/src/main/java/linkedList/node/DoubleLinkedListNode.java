package linkedList.node;

public class DoubleLinkedListNode {

    public DoubleLinkedListNode prevNode;
    public DoubleLinkedListNode nextNode;
    public int value;

    public DoubleLinkedListNode(DoubleLinkedListNode prevNode, int value, DoubleLinkedListNode nextNode){
        this.prevNode = prevNode;
        this.value = value;
        this.nextNode = nextNode;
    }

    public DoubleLinkedListNode(){

    }
}
