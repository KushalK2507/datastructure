package B_Math.tester;

import java.util.Arrays;

import B_Math.A_PlusOne;
import B_Math.B_PrimeNo;

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
        B_PrimeNo primeNumber= new B_PrimeNo();
        System.out.println(number+" is Prime Number = "+primeNumber.isPrimeNumber(number));

        int number1 =4;
        System.out.println(number1+" is Prime Number = "+primeNumber.isPrimeNumber(number1));
    }

    private static void plusOne(){
        int[] arr1 = {1,2,3};
        A_PlusOne plusOne = new A_PlusOne();
        System.out.println("PlusOne = "+ Arrays.toString(plusOne.plusOne(arr1)));

        int[] arr2 = {9,9};
        System.out.println("PlusOne = "+ Arrays.toString(plusOne.plusOne(arr2)));

    }
}
