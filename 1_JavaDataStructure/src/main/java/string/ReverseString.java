package string;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args){
        System.out.println("Reverse String using Substring: "+reverStringRecursion("Hello"));
        System.out.println("Reverse String using char Array: "+reverseStringUsingArray("abcd"));
        directlyPrintingReverseString("Hello");

    }
    public static String reverStringRecursion(String input){

        if(input.length() == 0){
            return input;
        }
        return input.substring(input.length()-1) + reverStringRecursion(input.substring(0,input.length()-1));
    }

    public static String reverseStringUsingArray(String input){
        char[] inputArray = input.toCharArray();
        int start =0;
        int end = inputArray.length-1;
        while(start< end){
            char temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
            start++;
            end --;
        }
        return new String(inputArray);
    }

    public static void directlyPrintingReverseString(String input){
        System.out.print("Directly Printing the Reverse String: ");
        for (int i=input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
        System.out.println();

    }
}
