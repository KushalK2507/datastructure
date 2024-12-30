package K_Dynanic;

import java.util.LinkedList;
import java.util.Queue;

public class B_LRUCache {

  Queue<Integer> lru;
  int size;

  public B_LRUCache(int size) {
    lru = new LinkedList<>();
    this.size = size;
  }

  public void put(int val) {}

  public int get() {

    return -2;
  }
}
