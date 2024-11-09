package queue;

import java.util.LinkedList;
import java.util.List;

public class QueueUsingList {

    int top;
    int end;

    LinkedList<Integer> queue ;

    public QueueUsingList(){
        queue = new LinkedList<>();
    }


    public void offer(int val){
        queue.addFirst(val);
    }

    public int poll(){
        return queue.removeLast();
    }

    public int peek(){
        return queue.getLast();
    }
}
