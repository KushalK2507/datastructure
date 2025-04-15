package B_math.tester;

import B_math.PlusOne;
import B_math.PrimeNumber;

import java.util.Arrays;

public class MathTester {


    public static void main(String[] args) {

        // Plus One
        plusOne();
        System.out.println("-----------------------------");

        primeNumber();
        System.out.println("-----------------------------");
    }

    private static void primeNumber(){
        int number =5;
        PrimeNumber primeNumber= new PrimeNumber(number);
        System.out.println(number+" is Prime Number = "+primeNumber.isPrimeNumber());

        int number1 =4;
        PrimeNumber primeNumber1= new PrimeNumber(number1);
        System.out.println(number1+" is Prime Number = "+primeNumber1.isPrimeNumber());
    }

    private static void plusOne(){
        int[] arr1 = {1,2,3};
        PlusOne plusOne = new PlusOne(arr1);
        System.out.println("PlusOne = "+ Arrays.toString(plusOne.plusOne()));

        int[] arr2 = {9,9};
        PlusOne plusOne1 = new PlusOne(arr2);
        System.out.println("PlusOne = "+ Arrays.toString(plusOne1.plusOne()));

    }
}
