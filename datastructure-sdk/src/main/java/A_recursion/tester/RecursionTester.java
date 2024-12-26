package A_recursion.tester;

import A_recursion.*;
import E_Stack.D_ReverseString;

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

    private static void recursiveRange(){
        J_RecursiveRange recursiveRange = new J_RecursiveRange();
        System.out.println("Recursive Range Using Recursion = "+recursiveRange.recursiveRangeRecusrion(5));
        System.out.println("Recursive Range Using Formula = "+recursiveRange.recursiveRangeUsingFormula(5));
    }

    private static void productOfArray(){
        K_ProductOfDigitsInArray productOfArray = new K_ProductOfDigitsInArray();
        System.out.println("Product Of Array = "+productOfArray.productOfArray(new int [] {1,2,3,4,5},5));
    }

    private static void happyNumber(){

        I_HappyNumber happyNumber = new I_HappyNumber();
        System.out.println("Is Happy Number = "+happyNumber.isHappyNumber(7));
        System.out.println("Is Happy Number = "+happyNumber.isHappyNumber(13));
        System.out.println("Is Happy Number = "+happyNumber.isHappyNumber(129));
        System.out.println("Is Happy Number = "+happyNumber.isHappyNumber(338));
        System.out.println("Is Happy Number = "+happyNumber.isHappyNumber(3));

    }

    private static void pallendrome(){

        H_Pallendrome pallendrome = new H_Pallendrome();
        System.out.println("Recursion String Pallendrome = "+pallendrome.isPallendromeStringRecursion("abcba"));
        System.out.println("String Pallendrome = "+pallendrome.isPallendromeString("abcba"));


        System.out.println("Recursion String Pallendrome = "+pallendrome.isPallendromeStringRecursion("Hello"));
        System.out.println("String Pallendrome = "+pallendrome.isPallendromeString("Hello"));


            boolean result = pallendrome.isPallendromeNumberRecursion(123321,0)==123321;
        System.out.println("Recursion Number Pallendrome = "+result );
        System.out.println("Number Pallendrome = "+pallendrome.isPallendromeNumber(123321));


        boolean result1 = pallendrome.isPallendromeNumberRecursion(123,0) == 123;
        System.out.println("Recursion Number Pallendrome = "+result1);
        System.out.println("Number Pallendrome = "+pallendrome.isPallendromeNumber(123321));

    }

    private static void firstUpperCaseInString(){
        G_FirstUpperCaseInString firstUpperCase = new G_FirstUpperCaseInString();
        System.out.println("First Upper Case = "+firstUpperCase.firstUpperCase("hllEo"));

    }

    private static void d2b(){
        F_DecimalToBinary d2b = new F_DecimalToBinary();
        System.out.println("Decimal 2 Binary Recursion = "+d2b.d2bRecursion(5, new StringBuilder()));
        System.out.println("Decimal 2 Binary = "+d2b.d2B(5));
    }

    private static void gcd(){
        E_GcdOfNumber gcd = new E_GcdOfNumber();
        System.out.println("GCD = "+gcd.gcd(2,4));
    }

    private static void reverseString(){
        D_ReverseString reverseOfString = new D_ReverseString();
        System.out.println("Reversed String = "+reverseOfString.reverseString("Hello"));
    }
    private static void reverseStringRecursion(){
        D_ReverseString reverseOfString = new D_ReverseString();
        System.out.println("Reversed String = "+reverseOfString.reverseStringRecursion("Hello"));

    }
    private static void sumOfDigits(){
        C_SumOfDigits sumOfDigits= new C_SumOfDigits();
        System.out.println("Sum = "+sumOfDigits.sumOfDigits(14));
    }
    private static void sumOfDigitsRecursion(){
        C_SumOfDigits sumOfDigits= new C_SumOfDigits();
        System.out.println("Sum = "+sumOfDigits.sumOfDigitsRecusrion(14));
    }

    public static void factorial(){
        B_Factorial factorial = new B_Factorial();
        System.out.println("Factorial = "+factorial.fact(5));
    }

    public static void factorialRecursion(){
        B_Factorial factorial = new B_Factorial();
        System.out.println("Factorial = "+factorial.factRecursion(5));
    }

    private static void fibonacciSeriesSum(){
        A_Fibonacci fibanacii = new A_Fibonacci();
        System.out.print(fibanacii.sumOfFibanacciSeries(5));
        System.out.println();
    }

    private static void fibonacciSeriesRecursion(){
        A_Fibonacci fibanacii = new A_Fibonacci();
        for (int i=0;i<5;i++){
            System.out.print(fibanacii.sumOfFibanacciSeriesUsingRecursion(i)+" ");
        }
        System.out.println();
    }

    private static void fibonacci(){
        A_Fibonacci fibanacii = new A_Fibonacci();
        fibanacii.printFibanacciSeries(5);
        System.out.println();
    }

}
