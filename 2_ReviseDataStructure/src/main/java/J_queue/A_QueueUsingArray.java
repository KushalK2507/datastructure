package J_queue;

public class A_QueueUsingArray {

  int top;
  int end;
  int[] queue;

  public A_QueueUsingArray(int size) {
    top = -1;
    end = -1;
    queue = new int[size];
  }

    public void offer(int val){
        if (top == -1){
            top++;
        }
        end++;
        queue[end] = val;
    }

    public int poll(){
        if (top == -1 || top == queue.length){
            return -1;
        }
        return queue[top++];
    }

    public int peek(){
        return queue[top];
    }
}
