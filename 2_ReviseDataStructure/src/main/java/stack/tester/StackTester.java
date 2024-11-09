package stack.tester;

import stack.*;

public class StackTester {

    public static void main(String[] args) {

        System.out.println("Stack Using Array");
        stackArray();
        System.out.println("----------------------------");

        System.out.println("Stack Using List");
        stackList();
        System.out.println("----------------------------");

        System.out.println("Valid Parenthesis");
        validParenthesis();
        System.out.println("----------------------------");

        System.out.println("Reverse String");
        reverseString();
        System.out.println("----------------------------");

        System.out.println("Min Stack");
        minStack();
        System.out.println("----------------------------");

        System.out.println("Stack Using 2 Queue");
        stackUsing2Queue();
        System.out.println("----------------------------");

        System.out.println("Simplify Path");
        simplifyPath();
        System.out.println("----------------------------");


    }

    public static void simplifyPath(){

        SimplifyPath simplifyPath = new SimplifyPath("/home/");
        System.out.println("Simplified Path = "+simplifyPath.simplifyPath());

        SimplifyPath simplifyPath1 = new SimplifyPath("/../");
        System.out.println("Simplified Path 1 = "+simplifyPath1.simplifyPath());

        SimplifyPath simplifyPath2 = new SimplifyPath("/home//foo/");
        System.out.println("Simplified Path 2 = "+simplifyPath2.simplifyPath());

        SimplifyPath simplifyPath3 = new SimplifyPath("//home/test");
        System.out.println("Simplified Path 3 = "+simplifyPath3.simplifyPath());

        SimplifyPath simplifyPath4 = new SimplifyPath("//");
        System.out.println("Simplified Path 4 = "+simplifyPath4.simplifyPath());
    }

    public static void stackUsing2Queue(){
        StackUsingQueue stackUsingArray = new StackUsingQueue();
        stackUsingArray.push(1);
        stackUsingArray.push(4);
        System.out.println("Peek Element = "+stackUsingArray.peek());
        System.out.println("Pop Element = "+stackUsingArray.pop());
        stackUsingArray.push(8);
        System.out.println("Peek Element = "+stackUsingArray.peek());
        stackUsingArray.push(10);
        System.out.println("Pop Element = "+stackUsingArray.pop());
    }

    public static void minStack(){

            StackMin stackMin = new StackMin();
            stackMin.push(-2);
            stackMin.push(0);
            stackMin.push(-3);
            System.out.println("Min = "+stackMin.getMin());
            stackMin.pop();
            System.out.println("Top = "+stackMin.top());
            System.out.println("Min = "+stackMin.getMin());


    }

    public static void reverseString(){

        String s = "Hello";
        ReverseStringUsingStack reverseStringUsingStack = new ReverseStringUsingStack(s);
        System.out.println("Reversed String = "+reverseStringUsingStack.reverseString());

    }

    public static void validParenthesis(){

        String input = "()(){()}[][()]";
        ValidParenthesis validParenthesis = new ValidParenthesis(input);
        System.out.println("Is Valid parenthesis = "+validParenthesis.isValidParenthesis());

        String input1 = "()(){()}[][()";
        ValidParenthesis validParenthesis1 = new ValidParenthesis(input1);
        System.out.println("Is Valid parenthesis = "+validParenthesis1.isValidParenthesis());

        String input2 = "()(){()[][()";
        ValidParenthesis validParenthesis2 = new ValidParenthesis(input2);
        System.out.println("Is Valid parenthesis = "+validParenthesis2.isValidParenthesis());

    }

    public static void stackList(){
        StackUsingList stackUsingArray = new StackUsingList();
        stackUsingArray.push(1);
        stackUsingArray.push(4);
        System.out.println("Peek Element = "+stackUsingArray.peek());
        System.out.println("Pop Element = "+stackUsingArray.pop());
        stackUsingArray.push(8);
        System.out.println("Peek Element = "+stackUsingArray.peek());
        stackUsingArray.push(10);
        System.out.println("Pop Element = "+stackUsingArray.pop());
    }
    public static void stackArray(){
        StackUsingArray stackUsingArray = new StackUsingArray(5);
        stackUsingArray.push(1);
        stackUsingArray.push(4);
        System.out.println("Peek Element = "+stackUsingArray.peek());
        System.out.println("Pop Element = "+stackUsingArray.pop());
        stackUsingArray.push(8);
        System.out.println("Peek Element = "+stackUsingArray.peek());
        stackUsingArray.push(10);
        System.out.println("Pop Element = "+stackUsingArray.pop());
    }
}
