package P_dynamic;

import java.util.LinkedHashMap;
import java.util.Map;

public class C_LruUsingMap<K,V> extends LinkedHashMap<K,V> {
    int capacity;

    public C_LruUsingMap(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K,V> entry){
        return size() > capacity;
    }
}
