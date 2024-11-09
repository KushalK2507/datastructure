package stack.interviewQuestion;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args){

        System.out.println("Valid Parenthesis: "+isValidParenthesis("({[]()})"));

        System.out.println("Valid Parenthesis: "+isValidParenthesis(")}}]]"));

    }

    public static boolean isValidParenthesis(String parenthesis){
        char[] charParenthesis = parenthesis.toCharArray();
        Stack<Character> parenthesisCheck = new Stack<>();
        for (char par:charParenthesis ){
            if(par == '(' || par=='{' || par == '['){
                parenthesisCheck.push(par);
            }
            else if(par == ')'){
                if(!parenthesisCheck.isEmpty() && parenthesisCheck.peek() == '(') {
                    parenthesisCheck.pop();
                }
                else {
                    return false;
                }
            }
            else if(par == '}'){
                if(!parenthesisCheck.isEmpty() && parenthesisCheck.peek() == '{'){
                    parenthesisCheck.pop();
                }
                else {
                    return false;
                }
            }
            else if(par == ']'){
                if(!parenthesisCheck.isEmpty() && parenthesisCheck.peek() == '['){
                    parenthesisCheck.pop();
                }
                else {
                    return false;
                }

            }
        }
        return parenthesisCheck.isEmpty();

    }
}
