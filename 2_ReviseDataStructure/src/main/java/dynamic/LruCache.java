package dynamic;

import java.util.*;

public class LruCache {

    Queue<Integer> cacheKey;
    Map<Integer,Integer> keyToValue;

    int size;

    public LruCache(int size){
        cacheKey = new LinkedList<>();
        keyToValue = new HashMap<>();
        this.size = size;
    }

    public void put(int key, int value){

       if (cacheKey.contains(key)){
           cacheKey.remove(key);
       }
       else {
           if (cacheKey.size() == size){
               int removedKey = cacheKey.poll();
               keyToValue.remove(removedKey);
           }
       }
       cacheKey.offer(key);
       keyToValue.put(key,value);
    }

    public int get(int key){

        if (cacheKey.contains(key)){
            cacheKey.poll();
            cacheKey.offer(key);
            keyToValue.get(key);
        }
        return keyToValue.getOrDefault(key,-1);

    }

}
