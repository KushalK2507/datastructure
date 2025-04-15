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

    private static void recursiveRange(){
        RecursiveRange recursiveRange = new RecursiveRange();
        System.out.println("Recursive Range Using Recursion = "+recursiveRange.recursiveRangeRecursion(5));
        System.out.println("Recursive Range Using Formula = "+recursiveRange.recursiveRangeFormula(5));
        System.out.println("Recursive Range = "+recursiveRange.recursiveRange(5));

    }

    private static void productOfArray(){
        ProductOfArray productOfArray = new ProductOfArray();
        System.out.println("Product Of Array = "+productOfArray.productOfArray(new int [] {1,2,3,4,5},5));
    }

    private static void happyNumber(){

        HappyNumber happyNumber = new HappyNumber();
        System.out.println("Is Happy Number = "+happyNumber.isHappyNumber(7));
        System.out.println("Is Happy Number = "+happyNumber.isHappyNumber(13));
        System.out.println("Is Happy Number = "+happyNumber.isHappyNumber(129));
        System.out.println("Is Happy Number = "+happyNumber.isHappyNumber(338));
        System.out.println("Is Happy Number = "+happyNumber.isHappyNumber(3));

    }

    private static void pallendrome(){

        PallendromeStringAndNumber pallendromeString = new PallendromeStringAndNumber("abcba");
        System.out.println("Recursion String Pallendrome = "+pallendromeString.isPallendromeStringRecursion("abcba"));
        System.out.println("String Pallendrome = "+pallendromeString.isPallendromeString());

        PallendromeStringAndNumber pallendromeString1 = new PallendromeStringAndNumber("Hello");
        System.out.println("Recursion String Pallendrome = "+pallendromeString1.isPallendromeStringRecursion("Hello"));
        System.out.println("String Pallendrome = "+pallendromeString1.isPallendromeString());


        PallendromeStringAndNumber pallendromeNumber = new PallendromeStringAndNumber(123321);
            boolean result = pallendromeNumber.isNumberPallendromeRecursion(123321,0)==123321;
        System.out.println("Recursion Number Pallendrome = "+result );
        System.out.println("Number Pallendrome = "+pallendromeNumber.isNumberPallendrome());


        PallendromeStringAndNumber pallendromeNumber1 = new PallendromeStringAndNumber(123);
        boolean result1 = pallendromeNumber1.isNumberPallendromeRecursion(123,0) == 123;
        System.out.println("Recursion Number Pallendrome = "+result1);
        System.out.println("Number Pallendrome = "+pallendromeNumber1.isNumberPallendrome());

    }

    private static void firstUpperCaseInString(){
        FirstUpperCaseInString firstUpperCase = new FirstUpperCaseInString("hllEo");
        System.out.println("First Upper Case = "+firstUpperCase.firStUpperCase("hllEo"));

    }

    private static void d2b(){
        DecimalToBinary d2b = new DecimalToBinary(5);
        System.out.println("Decimal 2 Binary Recursion = "+d2b.d2bRecursion(5, new StringBuilder()));
        System.out.println("Decimal 2 Binary = "+d2b.decimal2Binary());
    }

    private static void gcd(){

        GcdOfNumber gcd = new GcdOfNumber(4,8);
        System.out.println("GCD = "+gcd.gcdOfNumber(2,4));
    }

    private static void reverseString(){
        ReverseOfString reverseOfString = new ReverseOfString("Hello");
        System.out.println("Reversed String = "+reverseOfString.reverseString());
    }
    private static void reverseStringRecursion(){
        ReverseOfString reverseOfString = new ReverseOfString("Hello");
        System.out.println("Reversed String = "+reverseOfString.reverseStringUsingRecursion("Hello"));

    }
    private static void sumOfDigits(){
        SumOfDigits sumOfDigits= new SumOfDigits(14);
        System.out.println("Sum = "+sumOfDigits.sumOfDigits());

    }
    private static void sumOfDigitsRecursion(){

        SumOfDigits sumOfDigits= new SumOfDigits(14);
        System.out.println("Sum = "+sumOfDigits.sumOfDigitsRecursion(14));

    }

    public static void factorial(){
        Factorial factorial = new Factorial(5);
        System.out.println("Factorial = "+factorial.fact());
    }

    public static void factorialRecursion(){
        Factorial factorial = new Factorial(5);
        System.out.println("Factorial = "+factorial.recursionFact(5));
    }

    private static void fibonacciSeriesSum(){
        Fibanacii fibanacii = new Fibanacii(5);
        System.out.print(fibanacii.sumOfFibonacciSeries());
        System.out.println();
    }

    private static void fibonacciSeriesRecursion(){
        Fibanacii fibanacii = new Fibanacii(5);
        for (int i=0;i<5;i++){
            System.out.print(fibanacii.fibonacciSeriesRecursion(i)+" ");
        }

        System.out.println();
    }

    private static void fibonacci(){
        Fibanacii fibanacii = new Fibanacii(5);
        fibanacii.fibonacciSeries();
        System.out.println();
    }

}
