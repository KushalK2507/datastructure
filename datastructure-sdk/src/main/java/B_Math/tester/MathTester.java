package B_Math.tester;

import java.util.Arrays;

import B_Math.A_PlusOne;
import B_Math.B_PrimeNo;
import B_Math.C_PowOfNumber;
import B_Math.D_SquareRootOfNumber;

public class MathTester {


    public static void main(String[] args) {

        // Plus One
        plusOne();
        System.out.println("-----------------------------");

        primeNumber();
        System.out.println("-----------------------------");

        pow();
        System.out.println("-----------------------------");

        squareRootOfNumber();
        System.out.println("-----------------------------");

    }

    private static void squareRootOfNumber(){
        D_SquareRootOfNumber squareRootOfNumber = new D_SquareRootOfNumber();
        int n =9;
        System.out.println("Square Root Of Number"+n+" is "+squareRootOfNumber.squareRootOfNumber(n));
    }

    private static void pow(){
        C_PowOfNumber pow = new C_PowOfNumber();
        int n=2;
        int power=4;
        System.out.println("Pow of number "+n+" of power "+power+" result = "+pow.pow(n,power));
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
        System.out.println("PlusOne of "+Arrays.toString(arr1)+" is " + Arrays.toString(plusOne.plusOne(arr1)));

        int[] arr2 = {9,9};
        System.out.println("PlusOne of "+Arrays.toString(arr2)+" is "+ Arrays.toString(plusOne.plusOne(arr2)));

    }
}
