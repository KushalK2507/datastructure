package E_Stack;

import java.util.Stack;

public class E_MinStack {

  Stack<Integer> stack;
  int min;

  public E_MinStack() {
    stack = new Stack<>();
    min = Integer.MAX_VALUE;
  }

  public void push(int val) {}

  public int pop() {

    return -1;
  }

  public int top() {
    return -1;
  }

  public int peek() {
    return -1;
  }

  public int getMin() {
    return min;
  }

  public boolean isEmpty() {

    return false;
  }
}
