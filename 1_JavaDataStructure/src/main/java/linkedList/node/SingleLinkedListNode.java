package linkedList.node;

public class SingleLinkedListNode {

    public SingleLinkedListNode next;
    public int value;

   public SingleLinkedListNode(SingleLinkedListNode next, int value){
       this.next =  next;
       this.value =  value;
   }

    public SingleLinkedListNode(int value){
        this.next =  null;
        this.value =  value;
    }

   public SingleLinkedListNode(){

   }
}
