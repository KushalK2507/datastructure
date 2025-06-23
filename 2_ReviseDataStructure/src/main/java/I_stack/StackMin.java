package I_stack;


import java.util.Stack;

public class StackMin {

    public Stack<Integer> minStack;
    int min;

    public StackMin(){
        minStack = new Stack<>();
        min=Integer.MAX_VALUE;
    }

    public void push(int val){

        if (val <= min){
           minStack.push(min);
           min = val;
        }
        minStack.push(val);
    }

    public void pop(){

        if (minStack.pop() == min){
            min = minStack.pop();
        }
    }

    public int top(){
        return minStack.peek();
    }

    public int getMin(){
        return min;
    }
}
