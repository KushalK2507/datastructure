package P_dynamic.A_Backtracking;

import java.util.*;

public class D_LetterCombinations {

  int[] arr;
  String[] phoneMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  List<String> res = new ArrayList<>();

  public D_LetterCombinations(int n) {
    populateArray(getLength(n), n);
  }

  private int getLength(int n) {

    int len = 0;
    while (n > 0) {
      if (n % 10 >= 2) {
        len++;
      }
      n = n / 10;
    }
    return len;
  }

  public void populateArray(int len, int n) {
    arr = new int[len];
    while (len > 0) {
      if (n % 10 >= 2) {
        arr[--len] = n % 10;
      }
      n = n / 10;
    }
  }

  public List<String> getLetterCombinations() {

    Queue<String> elements = new LinkedList<>();
    elements.add("");
    while (!elements.isEmpty()) {
      String s = elements.poll();
      if (s.length() == arr.length) {
        res.add(s);
      } else {
        String phoneVal = phoneMap[arr[s.length()] - 2];
        for (char c : phoneVal.toCharArray()) {
          elements.add(s + c);
        }
      }
    }
    return res;
  }
}
