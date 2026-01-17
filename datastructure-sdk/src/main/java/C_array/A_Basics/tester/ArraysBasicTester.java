package C_array.A_Basics.tester;

import C_array.A_Basics.*;
import C_array.B_ArrayAdvance.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysBasicTester {

    public static void main(String[] args) {

        //Reverse Array without using new Array
        reverseArrayWithoutUsingNewArray();
        System.out.println("---------------------------------");

        //Pair Each Element In Array
        pairEachElementInArray();
        System.out.println("--------------------------------");

        //missing Number in Array
        missingNumberInArray();
        System.out.println("--------------------------------");

        //largest and second largest in Array
        secondLargestAndLargestInArray();
        System.out.println("--------------------------------");

        //check 2 array are indentical
        check2ArrayAreIdentical();
        System.out.println("--------------------------------");

        //check array are unique
        arrayIsUnique();
        System.out.println("--------------------------------");


    }


    private static void arrayIsUnique(){
        int[] arr = {1,2,5,6,7,8,9};
        F_UniqueArray arrayIsUnique = new F_UniqueArray();
        System.out.println("Array is Unique = "+arrayIsUnique.isArrayUnique(arr));
        int[] arr1 = {1,2,5,6,7,8,8};
        System.out.println("Array is Unique1 = "+arrayIsUnique.isArrayUnique(arr1));
    }
    private static void check2ArrayAreIdentical(){
        int[] arr1 = {1,2,3,65,3,2};
        int[] arr2 = {1,2,3,56,2,3};
        E_TwoArrayIdentical arraysAreIdentical = new E_TwoArrayIdentical();
        System.out.println("Input Array are "+Arrays.toString(arr1)+" and "+Arrays.toString(arr2)+"  are Identical = "+arraysAreIdentical.isArrayIdentical(arr1,arr2));

        int[] arr3 = {1,2,3,65,44,3,2};
        int[] arr4 = {1,2,3,65,2,3,44};
        System.out.println("Input Array are "+Arrays.toString(arr3)+" and "+Arrays.toString(arr4)+" are Identical1 = "+arraysAreIdentical.isArrayIdentical(arr3,arr4));
    }

    private static void secondLargestAndLargestInArray(){
        int[] arr = {10, 5, 10};
        D_LargestAndSecondLargestInArray secondLargestAndLargestInArray = new D_LargestAndSecondLargestInArray();
        var result = secondLargestAndLargestInArray.largestAndSecondLargestNumber(arr);
        System.out.println("Input Array is "+Arrays.toString(arr)+"Largest = "+result[0]+" Second largest = "+result[1]);
    }

    private static void missingNumberInArray(){
        // If an array consist of N continuous digit then find missing number in an array.
        // Sum of First N Number = n(n+1)/2
        // Missing Number = Sum of first N Number - Sum of all elements in array
        C_MissingElementInArray missingNumberInArray = new C_MissingElementInArray();
        int[] arr = {1,2,3,4,5,0,7,8,6};
        int lengthofArray = 9;
        int missingNumber= missingNumberInArray.missingNumberInArray(arr, lengthofArray);
        System.out.println("Missing Number in Array "+Arrays.toString(arr)+" is "+missingNumber);
    }

    private static void pairEachElementInArray(){
        B_PairEachElementInArray pairEachElementInArray = new B_PairEachElementInArray();
        List<List<Integer>> result = new ArrayList<>();
        int[] arr = {1,2,3};
        pairEachElementInArray.pairEachElement(result,arr, new ArrayList<>());
        System.out.println("Combination of = "+Arrays.toString(arr));
        result.forEach(System.out::print);
    }

    public static void reverseArrayWithoutUsingNewArray(){
        int[] arr = {1,2,3,4,5};
        A_ReverseArrayWithoutUsingNewArray reverseArrayWithoutUsingNewArray = new A_ReverseArrayWithoutUsingNewArray();
        reverseArrayWithoutUsingNewArray.reverseArray(arr);
        System.out.println("Reverse Array of "+Arrays.toString(arr)+" is "+Arrays.toString(arr));
    }

}
