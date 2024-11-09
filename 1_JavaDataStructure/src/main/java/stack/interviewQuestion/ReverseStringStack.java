package stack.interviewQuestion;

import stack.StackUsingLinkedList;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStringStack {

    public static void main(String[] args){

        System.out.println(reverseString("Hello"));

    }

    public static String reverseString(String input){
        Stack<Character> characters = new Stack<>();
        char[] inputChar = input.toCharArray();
        for (char c: inputChar){
            characters.push(c);
        }
        for(int i=0;i<inputChar.length;i++){
            inputChar[i] = characters.pop();
        }
        return new String(inputChar);
    }
}
