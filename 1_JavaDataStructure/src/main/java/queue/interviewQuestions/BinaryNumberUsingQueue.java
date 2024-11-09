package queue.interviewQuestions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryNumberUsingQueue {

    public static void main(String[] args){
        System.out.println(Arrays.toString(generateBinaryNumbers(5)));
    }

    public static String[] generateBinaryNumbers(int n){
        String[] result = new String[n];
        Queue<String> binaryNumbers = new LinkedList<>();
        binaryNumbers.offer("1");
        for (int i=0;i<n;i++) {
            result[i] = binaryNumbers.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            binaryNumbers.offer(n1);
            binaryNumbers.offer(n2);
        }
        return result;
    }
}
