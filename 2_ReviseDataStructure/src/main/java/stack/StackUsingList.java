package stack;

import java.util.LinkedList;
import java.util.List;

public class StackUsingList {

    LinkedList<Integer> stack;

    public StackUsingList(){
        stack = new LinkedList<>();
    }

    public void push(int ele){
        stack.addLast(ele);
    }

    public int pop(){
        if (stack.isEmpty()){
            throw  new RuntimeException("Stack is empty");
        }
        return stack.removeLast();
    }

    public int peek(){
        if (stack.isEmpty()){
            throw  new RuntimeException("Stack is empty");
        }
        return stack.getLast();
    }

}
