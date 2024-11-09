package stack;

public class StackUsingArray {

    int[] arr;
    int top;

    public StackUsingArray(int size){
        arr = new int[size];
        top=-1;
    }

    public void push(int ele){
        if (top == arr.length-1){
            throw new RuntimeException("Stack is full");
        }
        top++;
        arr[top] = ele;
    }

    public int pop(){
        if (top == -1){
            throw new RuntimeException("Stack is Empty");
        }
        int res = arr[top];
        top--;
        return res;
    }

    public int peek(){
        if (top == -1){
            throw new RuntimeException("Stack is Empty");
        }
        return arr[top];
    }


}
