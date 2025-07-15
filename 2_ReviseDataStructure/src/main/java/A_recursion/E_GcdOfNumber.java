package A_recursion;

public class E_GcdOfNumber {

  int a;
  int b;

  public E_GcdOfNumber(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int gcdOfNumber(int a, int b) {

    if (a < 0 || b < 0) {
      return -1;
    }

    if (b == 0) {
      return a;
    }

    return gcdOfNumber(b, a % b);
  }
}
