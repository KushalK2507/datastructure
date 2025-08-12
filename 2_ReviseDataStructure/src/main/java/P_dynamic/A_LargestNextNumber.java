package P_dynamic;

public class A_LargestNextNumber {

  public int nextLargerNumber(int num) {
    char[] digits = String.valueOf(num).toCharArray();
    int i = digits.length - 2;

    // Step 1: find first decreasing digit
    while (i >= 0 && digits[i] >= digits[i + 1]) i--;

    if (i >= 0) {
      // Step 2: find digit just greater than digits[i]
      int j = digits.length - 1;
      while (digits[j] <= digits[i]) j--;

      // Step 3: swap
      char temp = digits[i];
      digits[i] = digits[j];
      digits[j] = temp;
    }

    // Step 4: reverse remaining
    reverse(digits, i + 1, digits.length - 1);

    return Integer.parseInt(new String(digits));
  }

  private void reverse(char[] arr, int start, int end) {
    while (start < end) {
      char temp = arr[start];
      arr[start++] = arr[end];
      arr[end--] = temp;
    }
  }

}
