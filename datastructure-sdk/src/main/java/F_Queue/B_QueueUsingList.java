package F_Queue;

import java.util.LinkedList;
import java.util.List;

public class B_QueueUsingList {

    List<Integer> queueList;
    int size;

    public B_QueueUsingList(){
        queueList = new LinkedList<>();
        this.size = 0;
    }

    public void offer(int val){

    }

    public int poll(){

        return -1;
    }

    public int peek(){
        return -2;
    }

    public boolean isEmpty(){
        return false;
    }

    public int size(){
        return size;
    }

}
