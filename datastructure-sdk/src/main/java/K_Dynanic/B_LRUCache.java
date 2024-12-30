package K_Dynanic;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class B_LRUCache {

  Queue<Integer> cacheKey;
  Map<Integer, Integer> keyToValue;
  int size;

  public B_LRUCache(int size) {
    cacheKey = new LinkedList<>();
    keyToValue = new HashMap<>();
    this.size = size;
  }

  public void put(int key, int value) {}

  public int get(int key) {

    return -2;
  }
}
