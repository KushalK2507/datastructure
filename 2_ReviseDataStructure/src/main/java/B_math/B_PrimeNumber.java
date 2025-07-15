package B_math;

public class B_PrimeNumber {

  int number;

  public B_PrimeNumber(int primeNumber) {
    this.number = primeNumber;
  }

  public boolean isPrimeNumber() {

    if (number <= 1) return false;

    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
