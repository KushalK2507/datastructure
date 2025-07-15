package J_queue;

import java.util.Stack;

public class D_QueueUsing2Stack {

  Stack<Integer> queue;
  Stack<Integer> tempQueue;

  public D_QueueUsing2Stack() {
    queue = new Stack<>();
    tempQueue = new Stack<>();
  }

  public void offer(int val) {
    tempQueue.push(val);
    while (!queue.isEmpty()) {
      tempQueue.push(queue.pop());
    }
    var temp = queue;
    queue = tempQueue;
    tempQueue = temp;
  }

  public int poll() {
    return queue.pop();
  }

  public int peek() {
    return queue.peek();
  }
}
