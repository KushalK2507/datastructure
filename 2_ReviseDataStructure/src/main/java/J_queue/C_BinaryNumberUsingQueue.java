package J_queue;

import java.util.LinkedList;
import java.util.Queue;

public class C_BinaryNumberUsingQueue {

  int n;
  Queue<Integer> queue = new LinkedList<>();

  public C_BinaryNumberUsingQueue(int n) {
    this.n = n;
  }

  public String binNumber() {

    while (n > 0) {
      queue.offer(n % 2);
      n = n / 2;
    }

    StringBuilder result = new StringBuilder();
    if (queue.isEmpty()) {
      return result.append(0).toString();
    }

    while (!queue.isEmpty()) {
      result.insert(0, queue.poll());
    }
    return result.toString();
  }
}
