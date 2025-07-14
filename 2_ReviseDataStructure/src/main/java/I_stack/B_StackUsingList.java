package I_stack;

import java.util.LinkedList;

public class B_StackUsingList {

  LinkedList<Integer> stack;

  public B_StackUsingList() {
    stack = new LinkedList<>();
  }

  public void push(int ele) {
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
