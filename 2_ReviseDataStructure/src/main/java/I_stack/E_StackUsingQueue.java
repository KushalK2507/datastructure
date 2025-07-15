package I_stack;

import java.util.LinkedList;
import java.util.Queue;

public class E_StackUsingQueue {
  Queue<Integer> stack;

  Queue<Integer> tempStack;

  public E_StackUsingQueue() {
    stack = new LinkedList<>();
    tempStack = new LinkedList<>();
  }

  public void push(int val) {
    tempStack.offer(val);
    while (!stack.isEmpty()) {
      tempStack.offer(stack.poll());
    }
    var temp = stack;
    stack = tempStack;
    tempStack = temp;
  }

  public int peek() {
    if (stack.isEmpty()) {
      return -1;
    }
    return stack.peek();
  }

  public int pop() {
    if (stack.isEmpty()) {
      return -1;
    }
    return stack.poll();
  }
}
