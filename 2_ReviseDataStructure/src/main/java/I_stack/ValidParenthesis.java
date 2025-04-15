package I_stack;

import java.util.Stack;

public class ValidParenthesis {
    String inputParenthesis;
    Stack<Character> stackParenthesis;

    public ValidParenthesis(String inputParenthesis){
       stackParenthesis = new Stack<>();
        this.inputParenthesis = inputParenthesis;
    }

    public boolean isValidParenthesis(){

        if (inputParenthesis.isEmpty()){
            return true;
        }
        for (char c: inputParenthesis.toCharArray()){

            if (c == '(' || c=='{' ||c=='['){
                stackParenthesis.add(c);
            }
             else if (c == ')') {
                 if (stackParenthesis.isEmpty() || stackParenthesis.peek() != '('){
                     return false;
                 }
                 else {
                     stackParenthesis.pop();
                 }
                }
                else if (c == '}') {
                if (stackParenthesis.isEmpty() || stackParenthesis.peek() != '{'){
                    return false;
                }
                else {
                    stackParenthesis.pop();
                }

                }
                else if (c == ']') {
                if (stackParenthesis.isEmpty() || stackParenthesis.peek() != '['){
                    return false;
                }
                else {
                    stackParenthesis.pop();
                }
                }
        }

        return stackParenthesis.isEmpty();
    }


}
