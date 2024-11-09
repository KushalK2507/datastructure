package org.stack;

import java.util.Arrays;
import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {

        StackUsingArray stack = new StackUsingArray(5);
        System.out.println(stack.isEmpty());
        stack.push(5);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.push(10);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.isEmpty());

        System.out.println("Valid Parenthesis: "+validParenthesis("{([])}"));

        System.out.println("Reverse String = "+reverseString("Hello World"));

    }

    public static String reverseString(String s){

        Stack<Character> string = new Stack<>();
        for (char c: s.toCharArray()){
            string.push(c);
        }

        StringBuilder result = new StringBuilder();
       while (!string.isEmpty()){
           result.append(string.pop());
       }

        return result.toString().trim();
    }

    public static boolean validParenthesis(String input){

        Stack<Character> stack = new Stack<>();
        for(char c:input.toCharArray()){

            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }

            if(stack.isEmpty() && (c == ')'|| c == '}' || c == ']')){
                return false;
            }
            if (c == ')'){
                if (stack.peek()=='(') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            if (c == '}' ){
                if (stack.peek()=='{'){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            if (c == ']'){
                if ( stack.peek()=='[') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }


        }

        if (!stack.isEmpty())
            return false;


        return true;
    }
}

class StackUsingArray{

    int top;
    int[] stackArray;

    StackUsingArray(int size){
        top=-1;
        stackArray = new int[size];
    }

    public boolean push(int val){

        if(top == stackArray.length-1){
            return false;
        }
        top++;
        stackArray[top] = val;
        return true;
    }

    public int pop(){
        if(top==-1){
            return -1;
        }
        int val = stackArray[top];
        top--;
        return val;
    }

    public int peek(){
        if(top==-1){
            return -1;
        }
        return stackArray[top];

    }

    public boolean isEmpty(){

        return top == -1;
    }

    public String toString(){
        if(top !=-1){
            return Arrays.toString(Arrays.copyOfRange(stackArray,0,top+1));
        }
        return Arrays.toString(new int[]{});
    }
}
