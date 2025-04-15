package I_stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseStringUsingStack {


    String s;
    Stack<Character> stack;

    public ReverseStringUsingStack(String s){
        this.s=s;
        stack = new Stack<>();
    }


    public String reverseString(){

        char[] ch = s.toCharArray();
        for (char c: ch){
            stack.push(c);
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }

        return res.toString();

    }
}
