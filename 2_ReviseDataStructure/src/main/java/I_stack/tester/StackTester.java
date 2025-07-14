package I_stack.tester;

import I_stack.*;

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

  public static void simplifyPath() {

    F_SimplifyPath FSimplifyPath = new F_SimplifyPath("/home/");
    System.out.println("Simplified Path = " + FSimplifyPath.simplifyPath());

    F_SimplifyPath FSimplifyPath1 = new F_SimplifyPath("/../");
    System.out.println("Simplified Path 1 = " + FSimplifyPath1.simplifyPath());

    F_SimplifyPath FSimplifyPath2 = new F_SimplifyPath("/home//foo/");
    System.out.println("Simplified Path 2 = " + FSimplifyPath2.simplifyPath());

    F_SimplifyPath FSimplifyPath3 = new F_SimplifyPath("//home/test");
    System.out.println("Simplified Path 3 = " + FSimplifyPath3.simplifyPath());

    F_SimplifyPath FSimplifyPath4 = new F_SimplifyPath("//");
    System.out.println("Simplified Path 4 = " + FSimplifyPath4.simplifyPath());
  }

    public static void stackUsing2Queue(){
    E_StackUsingQueue stackUsingArray = new E_StackUsingQueue();
        stackUsingArray.push(1);
        stackUsingArray.push(4);
        System.out.println("Peek Element = "+stackUsingArray.peek());
        System.out.println("Pop Element = "+stackUsingArray.pop());
        stackUsingArray.push(8);
        System.out.println("Peek Element = "+stackUsingArray.peek());
        stackUsingArray.push(10);
        System.out.println("Pop Element = "+stackUsingArray.pop());
    }

  public static void minStack() {

    D_StackMin DStackMin = new D_StackMin();
    DStackMin.push(-2);
    DStackMin.push(0);
    DStackMin.push(-3);
    System.out.println("Min Stack = " + DStackMin.minStack);
    System.out.println("Min = " + DStackMin.getMin());
    DStackMin.pop();
    System.out.println("Top = " + DStackMin.top());
    System.out.println("Min = " + DStackMin.getMin());
  }

  public static void reverseString() {

    String s = "Hello";
    G_ReverseStringUsingStack GReverseStringUsingStack = new G_ReverseStringUsingStack(s);
    System.out.println("Reversed String = " + GReverseStringUsingStack.reverseString());
  }

  public static void validParenthesis() {

    String input = "()(){()}[][()]";
    C_ValidParenthesis CValidParenthesis = new C_ValidParenthesis(input);
    System.out.println("Is Valid parenthesis = " + CValidParenthesis.isValidParenthesis());

    String input1 = "()(){()}[][()";
    C_ValidParenthesis CValidParenthesis1 = new C_ValidParenthesis(input1);
    System.out.println("Is Valid parenthesis = " + CValidParenthesis1.isValidParenthesis());

    String input2 = "()(){()[][()";
    C_ValidParenthesis CValidParenthesis2 = new C_ValidParenthesis(input2);
    System.out.println("Is Valid parenthesis = " + CValidParenthesis2.isValidParenthesis());
  }

    public static void stackList(){
    B_StackUsingList stackUsingArray = new B_StackUsingList();
        stackUsingArray.push(1);
        stackUsingArray.push(4);
        System.out.println("Peek Element = "+stackUsingArray.peek());
        System.out.println("Pop Element = "+stackUsingArray.pop());
        stackUsingArray.push(8);
        System.out.println("Peek Element = "+stackUsingArray.peek());
        stackUsingArray.push(10);
        System.out.println("Pop Element = "+stackUsingArray.pop());
    }

  public static void stackArray() {
    A_StackUsingArray AStackUsingArray = new A_StackUsingArray(5);
    AStackUsingArray.push(1);
    AStackUsingArray.push(4);
    System.out.println("Peek Element = " + AStackUsingArray.peek());
    System.out.println("Pop Element = " + AStackUsingArray.pop());
    AStackUsingArray.push(8);
    System.out.println("Peek Element = " + AStackUsingArray.peek());
    AStackUsingArray.push(10);
    System.out.println("Pop Element = " + AStackUsingArray.pop());
  }
}
