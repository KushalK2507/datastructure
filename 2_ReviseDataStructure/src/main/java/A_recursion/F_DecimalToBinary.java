package A_recursion;

public class F_DecimalToBinary {

  int n;

  public F_DecimalToBinary(int n) {
    this.n = n;
  }

  public String decimal2Binary() {

    StringBuilder result = new StringBuilder();
    while (n > 0) {
      result.append(n % 2);
      n = n / 2;
    }

    return result.toString();
  }

  public String d2bRecursion(int n, StringBuilder result) {

    if (n <= 0) {
      return result.toString();
    }

    result.append(n % 2);

    return d2bRecursion(n / 2, result);
  }
}
