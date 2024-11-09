package stack;

public class StackUsingArray {

    int[] stackArray;
    int top;

    public StackUsingArray(int size){
        stackArray = new int[size];
        top =-1;
    }

    public int[] getStack(){
        return stackArray;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        top ++;
        stackArray[top] = data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int value = stackArray[top];
        stackArray[top] = 0;
        top--;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isFull(){
        if(stackArray!= null && top == stackArray.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public void deleteStack(){
        stackArray = null;
        top =-1;
    }
}
