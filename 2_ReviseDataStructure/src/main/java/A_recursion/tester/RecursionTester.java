package A_recursion.tester;

import A_recursion.*;

public class RecursionTester {

  public static void main(String[] args) {

    System.out.println("Fibonacci Series");
    fibonacci();
    System.out.println("-------------------------");

    System.out.println("Fibonacci Series Recursion");
    fibonacciSeriesRecursion();
    System.out.println("-------------------------");

    System.out.println("Fibonacci Series Recursion");
    fibonacciSeriesSum();
    System.out.println("-------------------------");

    System.out.println("Factorial Recursion");
    factorialRecursion();
    System.out.println("-------------------------");

    System.out.println("Factorial");
    factorial();
    System.out.println("-------------------------");

    System.out.println("Sum of Digits");
    sumOfDigits();
    System.out.println("-------------------------");

    System.out.println("Sum of Digits Using Recursion");
    sumOfDigitsRecursion();
    System.out.println("-------------------------");

    System.out.println("Reverse String");
    reverseString();
    System.out.println("-------------------------");

    System.out.println("Reverse Of String Using Recursion");
    reverseStringRecursion();
    System.out.println("-------------------------");

    System.out.println("GCD of a number");
    gcd();
    System.out.println("-------------------------");

    System.out.println("Decimal to Binary");
    d2b();
    System.out.println("-------------------------");

    System.out.println("First Upper Case In String");
    firstUpperCaseInString();
    System.out.println("-------------------------");

    System.out.println("Pallendrome of String and Number");
    pallendrome();
    System.out.println("-------------------------");

    System.out.println("Happy Number");
    happyNumber();
    System.out.println("-------------------------");

    System.out.println("Product Of Array");
    productOfArray();
    System.out.println("-------------------------");

    System.out.println("Recursive Range");
    recursiveRange();
    System.out.println("-------------------------");
  }

  private static void recursiveRange() {
    J_RecursiveRange jRecursiveRange = new J_RecursiveRange();
    System.out.println(
        "Recursive Range Using Recursion = " + jRecursiveRange.recursiveRangeRecursion(5));
    System.out.println(
        "Recursive Range Using Formula = " + jRecursiveRange.recursiveRangeFormula(5));
    System.out.println("Recursive Range = " + jRecursiveRange.recursiveRange(5));
  }

  private static void productOfArray() {
    K_ProductOfArray KProductOfArray = new K_ProductOfArray();
    System.out.println(
        "Product Of Array = " + KProductOfArray.productOfArray(new int[] {1, 2, 3, 4, 5}, 5));
  }

  private static void happyNumber() {

    I_HappyNumber IHappyNumber = new I_HappyNumber();
    System.out.println("Is Happy Number = " + IHappyNumber.isHappyNumber(7));
    System.out.println("Is Happy Number = " + IHappyNumber.isHappyNumber(13));
    System.out.println("Is Happy Number = " + IHappyNumber.isHappyNumber(129));
    System.out.println("Is Happy Number = " + IHappyNumber.isHappyNumber(338));
    System.out.println("Is Happy Number = " + IHappyNumber.isHappyNumber(3));
  }

  private static void pallendrome() {

    H_PallendromeStringAndNumber pallendromeString = new H_PallendromeStringAndNumber("abcba");
    System.out.println(
        "Recursion String Pallendrome = "
            + pallendromeString.isPallendromeStringRecursion("abcba"));
    System.out.println("String Pallendrome = " + pallendromeString.isPallendromeString());

    H_PallendromeStringAndNumber pallendromeString1 = new H_PallendromeStringAndNumber("Hello");
    System.out.println(
        "Recursion String Pallendrome = "
            + pallendromeString1.isPallendromeStringRecursion("Hello"));
    System.out.println("String Pallendrome = " + pallendromeString1.isPallendromeString());

    H_PallendromeStringAndNumber pallendromeNumber = new H_PallendromeStringAndNumber(123321);
    boolean result = pallendromeNumber.isNumberPallendromeRecursion(123321, 0) == 123321;
    System.out.println("Recursion Number Pallendrome = " + result);
    System.out.println("Number Pallendrome = " + pallendromeNumber.isNumberPallendrome());

    H_PallendromeStringAndNumber pallendromeNumber1 = new H_PallendromeStringAndNumber(123);
    boolean result1 = pallendromeNumber1.isNumberPallendromeRecursion(123, 0) == 123;
    System.out.println("Recursion Number Pallendrome = " + result1);
    System.out.println("Number Pallendrome = " + pallendromeNumber1.isNumberPallendrome());
  }

  private static void firstUpperCaseInString() {
    G_FirstUpperCaseInString firstUpperCase = new G_FirstUpperCaseInString("hllEo");
    System.out.println("First Upper Case = " + firstUpperCase.firStUpperCase("hllEo"));
  }

  private static void d2b() {
    F_DecimalToBinary d2b = new F_DecimalToBinary(5);
    System.out.println("Decimal 2 Binary Recursion = " + d2b.d2bRecursion(5, new StringBuilder()));
    System.out.println("Decimal 2 Binary = " + d2b.decimal2Binary());
  }

  private static void gcd() {

    E_GcdOfNumber gcd = new E_GcdOfNumber(4, 8);
    System.out.println("GCD = " + gcd.gcdOfNumber(2, 4));
  }

  private static void reverseString() {
    D_ReverseOfString DReverseOfString = new D_ReverseOfString("Hello");
    System.out.println("Reversed String = " + DReverseOfString.reverseString());
  }

  private static void reverseStringRecursion() {
    D_ReverseOfString DReverseOfString = new D_ReverseOfString("Hello");
    System.out.println(
        "Reversed String = " + DReverseOfString.reverseStringUsingRecursion("Hello"));
  }

  private static void sumOfDigits() {
    C_SumOfDigits CSumOfDigits = new C_SumOfDigits(14);
    System.out.println("Sum = " + CSumOfDigits.sumOfDigits());
  }

  private static void sumOfDigitsRecursion() {

    C_SumOfDigits CSumOfDigits = new C_SumOfDigits(14);
    System.out.println("Sum = " + CSumOfDigits.sumOfDigitsRecursion(14));
  }

  public static void factorial() {
    B_Factorial BFactorial = new B_Factorial(5);
    System.out.println("Factorial = " + BFactorial.fact());
  }

  public static void factorialRecursion() {
    B_Factorial BFactorial = new B_Factorial(5);
    System.out.println("Factorial = " + BFactorial.recursionFact(5));
  }

  private static void fibonacciSeriesSum() {
    A_Fibanacii AFibanacii = new A_Fibanacii(5);
    System.out.print(AFibanacii.sumOfFibonacciSeries());
    System.out.println();
  }

  private static void fibonacciSeriesRecursion() {
    A_Fibanacii AFibanacii = new A_Fibanacii(5);
    for (int i = 0; i < 5; i++) {
      System.out.print(AFibanacii.fibonacciSeriesRecursion(i) + " ");
    }

    System.out.println();
  }

  private static void fibonacci() {
    A_Fibanacii AFibanacii = new A_Fibanacii(5);
    AFibanacii.fibonacciSeries();
    System.out.println();
  }
}
