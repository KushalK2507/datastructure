package F_Queue;

public class A_QueueUsingArray {

    int[] queueArray;
    int size;
    int queueSize;

    public A_QueueUsingArray(int size){
        queueArray = new int[size];
        this.size = size;
        queueSize=0;
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
        return queueSize;
    }


}
