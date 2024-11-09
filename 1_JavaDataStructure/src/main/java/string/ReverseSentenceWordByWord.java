package string;

import java.util.Arrays;

public class ReverseSentenceWordByWord {

    public static void main(String[] args){
        String sentence = "I am good";
        reverseWordInStringUsingReverseFunction(sentence);
        System.out.println();
        reverseStringUsingArray(sentence);
        System.out.println();
        reverseStringUsingCharAt(sentence);
    }

    public static void reverseStringUsingCharAt(String sentence){

        String[] splittedSentence = sentence.split(" ");
        System.out.print("Reverse Word Using CharAt function: ");
        for (String s : splittedSentence){
            for(int i=s.length()-1;i>=0;i--){
                System.out.print(s.charAt(i));
            }
            System.out.print(" ");
        }

    }

    public static void reverseStringUsingArray(String sentence){
        String[] splittedSentence = sentence.split(" ");
        System.out.print("Reverse String Using Array: ");
        for(String s: splittedSentence){
            char[] sArray = s.toCharArray();
            int start =0;
            int end = sArray.length-1;
            while(start< end){
                char temp = sArray[start];
                sArray[start] = sArray[end];
                sArray[end] = temp;
                start++;
                end --;
            }
            System.out.print(new String(sArray)+" ");
        }

    }

    public static void reverseWordInStringUsingReverseFunction(String sentence){
        String[] splittedSentence = sentence.split(" ");
        System.out.print("Reverse String Using Function: ");
        for (int i=0;i< splittedSentence.length;i++){
            System.out.print(new StringBuffer(splittedSentence[i]).reverse()+" ");
        }
    }
}
