package queue.interviewQuestions;

import linkedList.node.SingleLinkedListNode;
import linkedList.singlyLinkedList.SinglyLinkedList;
import stack.StackUsingLinkedList;

public class QueueUsing2Stacks {

    private StackUsingLinkedList mainStack;
    private StackUsingLinkedList tempStack;

    public QueueUsing2Stacks(){
        mainStack = new StackUsingLinkedList();
        tempStack = new StackUsingLinkedList();

    }

    public static void main(String[] args){
        QueueUsing2Stacks queueUsing2Stacks = new QueueUsing2Stacks();
        queueUsing2Stacks.offer(1);
        queueUsing2Stacks.offer(2);
        queueUsing2Stacks.offer(3);
        queueUsing2Stacks.offer(4);
        queueUsing2Stacks.displayQueue();
        System.out.println("Peek: "+queueUsing2Stacks.peek());
        System.out.println("Poll: "+queueUsing2Stacks.poll());
        System.out.println("Poll: "+queueUsing2Stacks.poll());
        queueUsing2Stacks.offer(1);
        queueUsing2Stacks.displayQueue();

    }

    public void offer(int value){
        if(mainStack.isEmpty()){
            mainStack.push(value);
        }
        else {
            while(!mainStack.isEmpty()){
                tempStack.push(mainStack.pop());
            }
            mainStack.push(value);
            while(!tempStack.isEmpty()){
                mainStack.push(tempStack.pop());
            }
        }
    }

    public int poll(){
        if(!mainStack.isEmpty()){
            return mainStack.pop();
        }
        else{
            return -1;
        }
    }

    public int peek(){
        if(!mainStack.isEmpty()){
            return mainStack.peek();
        }
        else{
            return -1;
        }
    }

    public void displayQueue(){
        SingleLinkedListNode headCopy = mainStack.getLinkedListHeadNode();
        System.out.println("Queue Display");
        while(headCopy != null){
            System.out.print(headCopy.value);
            headCopy = headCopy.next;
        }
        System.out.println();
    }
}
