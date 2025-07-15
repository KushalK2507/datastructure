package I_stack;

import java.util.Stack;

public class G_ReverseStringUsingStack {

  String s;
  Stack<Character> stack;

  public G_ReverseStringUsingStack(String s) {
    this.s = s;
    stack = new Stack<>();
  }

  public String reverseString() {

    char[] ch = s.toCharArray();
    for (char c : ch) {
      stack.push(c);
    }

    StringBuilder res = new StringBuilder();
    while (!stack.isEmpty()) {
      res.append(stack.pop());
    }

    return res.toString();
  }
}
