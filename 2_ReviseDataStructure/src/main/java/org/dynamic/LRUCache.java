package org.dynamic;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LRUCache {
        Queue<Integer> cacheKey;
        List<Integer>  cacheValue;
        int size;

        public LRUCache(int size){
            cacheKey = new LinkedList<>();
            cacheValue = new LinkedList<>();
            this.size=size;
        }

        public int get(int key){
            if (cacheValue.contains(key)){
                cacheKey.remove(key);
                cacheKey.offer(key);
                return key;
            }
            return -1;
        }

        public void put(int value){

            if (cacheKey.size() == size){
                cacheValue.remove(cacheKey.poll());
            }
            cacheValue.add(value);
            cacheKey.offer(value);
        }
}

class Test{

    public static void main(String[] args) {

        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1); // cache is {1=1}
        lRUCache.put(2); // cache is {1=1, 2=2}
        System.out.println("Get 1 = "+lRUCache.get(1));    // return 1
        lRUCache.put(3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println("Get 2 = "+lRUCache.get(2));    // returns -1 (not found)
        lRUCache.put(4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println("Get 1 = "+lRUCache.get(1));    // return -1 (not found)
        System.out.println("Get 3 =  "+lRUCache.get(3));    // return 3
        System.out.println("Get 4 = "+lRUCache.get(4));    // return 4

    }
}
