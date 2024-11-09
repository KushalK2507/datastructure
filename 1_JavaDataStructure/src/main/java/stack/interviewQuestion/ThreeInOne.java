package stack.interviewQuestion;

import java.util.Arrays;

public class ThreeInOne {

    private int numberOfStack;
    private int stackCapacity; //Capacity of each Stack
    private int[] values;
    private int[] sizes; // In this we save the size of the each stach i.e. the number of elements it is holding.

    //In below all te implementation StackNum will start from 0 so number of stack is 3
    // then means stackNum will be 0,1,2
    public ThreeInOne(int numberOfStack, int stackCapacity){
        this.numberOfStack = numberOfStack;
        this.stackCapacity = stackCapacity;
        values = new int[numberOfStack*stackCapacity];
        sizes = new int[numberOfStack];
    }

    public boolean isFull(int stackNum){

        if(sizes[stackNum] == stackCapacity){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(int stackNum){

        if(sizes.length < stackNum){
            System.out.println("Stack Num is invalid");
            return false;
        }
        else if(sizes[stackNum] == 0){
            return true;
        }
        else {
            return false;
        }
    }

    //This will return the last index which is populated
    public int indexOfTop(int stackNum){
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset +size -1;
    }

    public void push(int stackNum, int value){
        if(isFull(stackNum)){
            System.out.println("Stack is Full");
        }
        else {
            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;
        }

    }

    public int pop(int stackNum){

        if(isEmpty(stackNum)){
            System.out.println("Popping element from StackNum : "+stackNum+" Stack is Empty");
            return -1;
        }
        else{
            int indexOfTop = indexOfTop(stackNum);
            sizes[stackNum]--;
            return values[indexOfTop];
        }
    }

    public int peek(int stackNum){
        if(isEmpty(stackNum)){
            System.out.println("Stachk is Empty");
            return -1;
        }
        else{
            return values[indexOfTop(stackNum)];
        }
    }

    public void display(int stackNum){
        int startStackIndex = stackNum*stackCapacity;
        int endStackIndex = indexOfTop(stackNum);
        System.out.println(Arrays.toString(Arrays.copyOfRange(values,startStackIndex,endStackIndex+1)));

    }


    public static void main(String[] args){

        ThreeInOne threeInOne = new ThreeInOne(4,4);
        System.out.println("Stack is Empty: "+threeInOne.isEmpty(5) );
        threeInOne.push(1,3);
        threeInOne.push(1,4);
        threeInOne.pop(2);
        threeInOne.display(1);
        System.out.println(threeInOne.peek(1));
        System.out.println(threeInOne.pop(1));
        threeInOne.display(1);


    }
}
