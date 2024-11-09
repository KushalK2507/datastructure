package stack.interviewQuestion;

import linkedList.node.SingleLinkedListNode;

import java.util.Arrays;

public class StackMin {

    SingleLinkedListNode top;
    SingleLinkedListNode min;

    public static void main(String[] args){


        StackMin stackMin = new StackMin();
        stackMin.push(10);
        stackMin.push(4);
        stackMin.push(2);
        stackMin.push(8);
        stackMin.push(1);
        System.out.println(stackMin.min());
        stackMin.pop();
        stackMin.displayMin();
        System.out.println(stackMin.min());
        stackMin.pop();
        stackMin.displayMin();
        System.out.println(stackMin.min());
        stackMin.pop();
        stackMin.displayMin();


    }

    public int min(){
        if(min != null){
            return min.value;
        }
        else{
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public void push(int value){
        if(min == null){
            min = new SingleLinkedListNode(min,value);
        }
        else if(min.value < value){
            min = new SingleLinkedListNode(min, min.value);
        }
        else {
            min = new SingleLinkedListNode(min,value);
        }

        if(top == null){
            top = new SingleLinkedListNode(null,value);
        }
        else {
            top = new SingleLinkedListNode(top,value);
        }
    }

    public int pop(){
        min = min.next;
        int result = top.value;
        top = top.next;
        return result;
    }

    public void displayMin(){
        SingleLinkedListNode minCopy = min;
        System.out.println("Min Stack To Display");
        while(minCopy != null){
            System.out.print(minCopy.value);
            minCopy = minCopy.next;

        }
        System.out.println();
    }



}
