package stack;

public class StackMain {

    public static void main(String[] args){

        StackUsingArray stackUsingArray = new StackUsingArray(4);
        System.out.println("Empty Stack "+ stackUsingArray.isEmpty());
        System.out.println("Full Stack "+ stackUsingArray.isFull());
        stackUsingArray.push(1);
        stackUsingArray.push(2);
        System.out.println("Peek: "+ stackUsingArray.peek());
        System.out.println("Pop: "+ stackUsingArray.pop());
        System.out.println("Peek: "+ stackUsingArray.peek());
        stackUsingArray.deleteStack();
        System.out.println("Empty Stack: "+ stackUsingArray.isEmpty());

        System.out.println("Stack Using Linked List");
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        System.out.println("Empty Stack "+ stackUsingLinkedList.isEmpty());
        stackUsingLinkedList.push(1);
        stackUsingLinkedList.push(2);
        System.out.println("Peek: "+ stackUsingLinkedList.peek());
        System.out.println("Pop: "+ stackUsingLinkedList.pop());
        System.out.println("Peek: "+ stackUsingLinkedList.peek());
        stackUsingLinkedList.deleteStack();
        System.out.println("Empty Stack: "+ stackUsingLinkedList.isEmpty());

    }
}
