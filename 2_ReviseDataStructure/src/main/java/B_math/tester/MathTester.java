package B_math.tester;

import B_math.A_PlusOne;
import B_math.B_PrimeNumber;
import java.util.Arrays;

public class MathTester {

  public static void main(String[] args) {

    // Plus One
    plusOne();
    System.out.println("-----------------------------");

    primeNumber();
    System.out.println("-----------------------------");
  }

  private static void primeNumber() {
    int number = 5;
    B_PrimeNumber BPrimeNumber = new B_PrimeNumber(number);
    System.out.println(number + " is Prime Number = " + BPrimeNumber.isPrimeNumber());

    int number1 = 4;
    B_PrimeNumber BPrimeNumber1 = new B_PrimeNumber(number1);
    System.out.println(number1 + " is Prime Number = " + BPrimeNumber1.isPrimeNumber());
  }

  private static void plusOne() {
    int[] arr1 = {1, 2, 3};
    A_PlusOne APlusOne = new A_PlusOne(arr1);
    System.out.println("PlusOne = " + Arrays.toString(APlusOne.plusOne()));

    int[] arr2 = {9, 9};
    A_PlusOne APlusOne1 = new A_PlusOne(arr2);
    System.out.println("PlusOne = " + Arrays.toString(APlusOne1.plusOne()));
  }
}
