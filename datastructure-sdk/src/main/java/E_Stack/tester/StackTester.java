package E_Stack.tester;

import E_Stack.*;

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

    G_SimplifyPath simplifyPath = new G_SimplifyPath();
    System.out.println("Simplified Path = " + simplifyPath.simplifiedPath("/home/"));

    System.out.println("Simplified Path 1 = " + simplifyPath.simplifiedPath("/../"));

    System.out.println("Simplified Path 2 = " + simplifyPath.simplifiedPath("/home//foo/"));

    System.out.println("Simplified Path 3 = " + simplifyPath.simplifiedPath("//home/test"));

    System.out.println("Simplified Path 4 = " + simplifyPath.simplifiedPath("//"));
  }

  public static void stackUsing2Queue() {
    F_StackUsing2Queue stackUsingArray = new F_StackUsing2Queue();
    stackUsingArray.push(1);
    stackUsingArray.push(4);
    System.out.println("Peek Element = " + stackUsingArray.peek());
    System.out.println("Pop Element = " + stackUsingArray.pop());
    stackUsingArray.push(8);
    System.out.println("Peek Element = " + stackUsingArray.peek());
    stackUsingArray.push(10);
    System.out.println("Pop Element = " + stackUsingArray.pop());
  }

  public static void minStack() {

    E_MinStack stackMin = new E_MinStack();
    stackMin.push(-2);
    stackMin.push(0);
    stackMin.push(-3);
    System.out.println("Min = " + stackMin.getMin());
    stackMin.pop();
    System.out.println("Top = " + stackMin.top());
    System.out.println("Min = " + stackMin.getMin());
  }

  public static void reverseString() {
    String s = "Hello";
    D_ReverseString reverseStringUsingStack = new D_ReverseString();
    System.out.println("Reversed String = " + reverseStringUsingStack.reverseString(s));
  }

  public static void validParenthesis() {

    String input = "()(){()}[][()]";
    C_ValidParenthesis validParenthesis = new C_ValidParenthesis();
    System.out.println("Is Valid parenthesis = " + validParenthesis.isValidParenthesis(input));

    String input1 = "()(){()}[][()";
    System.out.println("Is Valid parenthesis = " + validParenthesis.isValidParenthesis(input1));

    String input2 = "()(){()[][()";
    System.out.println("Is Valid parenthesis = " + validParenthesis.isValidParenthesis(input2));
  }

  public static void stackList() {
    B_StackUsingList stackUsingArray = new B_StackUsingList();
    stackUsingArray.push(1);
    stackUsingArray.push(4);
    System.out.println("Peek Element = " + stackUsingArray.peek());
    System.out.println("Pop Element = " + stackUsingArray.pop());
    stackUsingArray.push(8);
    System.out.println("Peek Element = " + stackUsingArray.peek());
    stackUsingArray.push(10);
    System.out.println("Pop Element = " + stackUsingArray.pop());
  }

  public static void stackArray() {
    A_StackUsingArray stackUsingArray = new A_StackUsingArray(5);
    stackUsingArray.push(1);
    stackUsingArray.push(4);
    System.out.println("Peek Element = " + stackUsingArray.peek());
    System.out.println("Pop Element = " + stackUsingArray.pop());
    stackUsingArray.push(8);
    System.out.println("Peek Element = " + stackUsingArray.peek());
    stackUsingArray.push(10);
    System.out.println("Pop Element = " + stackUsingArray.pop());
  }
}
