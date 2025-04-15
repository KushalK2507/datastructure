package C_arrays.tester;

import C_arrays.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysTester {

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

        // move zeros at the end
        movesZerosAtTheEnd();
        System.out.println("--------------------------------");

        //Pair to target Sum
        pairToTargetSum();
        System.out.println("--------------------------------");

        //Triplet to target Sum
        tripletToTargetSum();
        System.out.println("--------------------------------");

        //remove Duplicate from Sorted Array
        removeDuplicatesFromSortedArray();
        System.out.println("--------------------------------");

        // Buy and Sell to max profit
        maxBuyAndSellProfit();
        System.out.println("--------------------------------");

        // Pascal Triangle
        pascalTriangle();
        System.out.println("--------------------------------");

        maxBuyAndSellProfit2();
        System.out.println("--------------------------------");

        containerWithMostWater();
        System.out.println("--------------------------------");

        isJumpPossible();
        System.out.println("--------------------------------");

        minStepsJumpPossible();
        System.out.println("--------------------------------");

        productAllExceptItself();
        System.out.println("--------------------------------");

        tappingRainWater();
        System.out.println("--------------------------------");

        rotateArray();
        System.out.println("--------------------------------");
    }

    private static void rotateArray(){
        int[] arr = {1,2,3,4,5,6,7};
        int noIfRotation =2;
        RotateArray rotateArray = new RotateArray(arr,noIfRotation);
        rotateArray.rotateArray();
        System.out.println("Rotated Array = "+Arrays.toString(arr));
    }

    private static void tappingRainWater(){
        TappingRainWater tappingRainWater = new TappingRainWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println("MaxVol = "+tappingRainWater.maxVol());

    }

    private static void productAllExceptItself(){
        int[] arr = {10,3,5,6,2};
        ProductEachExceptItself productEachExceptItself = new ProductEachExceptItself(arr);
        System.out.println("Result Product = "+Arrays.toString(productEachExceptItself.productAllExceptItselfInArray()));
    }

    private static void isJumpPossible(){
        int[] arr = {2,3,1,1,4};
        JumpGame jumpGame = new JumpGame(arr);
        System.out.println("Is Jump Possible = "+jumpGame.isJumpPossible());
    }

    private static void minStepsJumpPossible(){
        int[] arr = {2,3,1,1,4};
        JumpGame jumpGame = new JumpGame(arr);
        System.out.println("Min Steps = "+jumpGame.minSteps());
    }

    private static void containerWithMostWater(){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater(arr);
        containerWithMostWater.maxWater();
        System.out.println("Max Water area = "+containerWithMostWater.maxArea);

    }

    private static void maxBuyAndSellProfit2(){
        int[] arr ={7,6,4,3,1};// {7,1,5,3,6,4};
        BuyAndSellMaxProfit buyAndSellMaxProfit = new BuyAndSellMaxProfit(arr);
        buyAndSellMaxProfit.maxProfit2();
        System.out.println("Max Profit = "+buyAndSellMaxProfit.maxProfit);
    }

    private static void pascalTriangle(){
        PascalTriangle pascalTriangle = new PascalTriangle(7);
        System.out.println("Pascal Triangle");
        var result = pascalTriangle.pascalTriangle();
        for (int i=0;i<7;i++){
            for (int j=i;j<=7;j++){
                System.out.print(" ");
            }
            System.out.println(result.get(i).stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }

    }

    private static void maxBuyAndSellProfit(){
        int[] arr = {7,1,5,3,6,4};
        BuyAndSellMaxProfit buyAndSellMaxProfit1 = new BuyAndSellMaxProfit(arr);
        buyAndSellMaxProfit1.maxProfit1();
        System.out.println("Max Profit = "+buyAndSellMaxProfit1.maxProfit);

        int[] arr1 = {7,6,5,4,1};
        BuyAndSellMaxProfit buyAndSellMaxProfit2 = new BuyAndSellMaxProfit(arr1);
        buyAndSellMaxProfit2.maxProfit1();
        System.out.println("Max Profit = "+buyAndSellMaxProfit2.maxProfit);
    }

    private static void removeDuplicatesFromSortedArray(){
        int[] arr = {1,1,3,3,4,5,6,6};
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray(arr);
        System.out.println("Orignal Array = "+Arrays.toString(arr));
        System.out.println("Removed Duplicates in Array"+Arrays.toString(removeDuplicatesFromSortedArray.removeDuplicates()));

    }

    private static void tripletToTargetSum(){
        int[] arr = {12, 3, 4, 1, 6, 9};
        int sum = 24;
        TripletToTargetSum tripletToTargetSum = new TripletToTargetSum(arr,sum);
        System.out.println("Triplet To Target Sum = "+Arrays.toString(tripletToTargetSum.tripletToTargetSum()));

    }
    private static void pairToTargetSum(){
        int[] arr = {1,2,3,4,5,8,3};
        PairToTargetSumInArray pairToTargetSumInArray = new PairToTargetSumInArray(arr,13);
        System.out.println("Pair = "+Arrays.toString(pairToTargetSumInArray.getPair()));
    }
    private static void movesZerosAtTheEnd(){
        int[] arr ={0,1,3,0,0,0,9,2,5,0};
        MoveZeroAtEnd moveZeroAtEnd = new MoveZeroAtEnd(arr);
        System.out.println("Orignal Array = "+Arrays.toString(arr));
        moveZeroAtEnd.moveZeroAtEnd();
        System.out.println("Move Zeros At end = "+Arrays.toString(arr));
    }
    private static void arrayIsUnique(){
        int[] arr = {1,2,5,6,7,8,9};
        ArrayIsUnique arrayIsUnique = new ArrayIsUnique(arr);
        System.out.println("Array is Unique = "+arrayIsUnique.isUnique());
        int[] arr1 = {1,2,5,6,7,8,8};
        ArrayIsUnique arrayIsUnique1 = new ArrayIsUnique(arr1);
        System.out.println("Array is Unique1 = "+arrayIsUnique1.isUnique());
    }
    private static void check2ArrayAreIdentical(){
        int[] arr1 = {1,2,3,65,3,2};
        int[] arr2 = {1,2,3,56,2,3};
        ArraysAreIdentical arraysAreIdentical = new ArraysAreIdentical(arr1,arr2);
        System.out.println("Array are Identical = "+arraysAreIdentical.isIdentical());

        int[] arr3 = {1,2,3,65,44,3,2};
        int[] arr4 = {1,2,3,65,2,3,44};
        ArraysAreIdentical arraysAreIdentical1 = new ArraysAreIdentical(arr3,arr4);
        System.out.println("Array are Identical1 = "+arraysAreIdentical1.isIdentical());

    }

    private static void secondLargestAndLargestInArray(){
        int[] arr = {10, 5, 10};
        SecondLargestAndLargestInArray secondLargestAndLargestInArray = new SecondLargestAndLargestInArray(arr);
        secondLargestAndLargestInArray.compute();
        System.out.println("Largest = "+secondLargestAndLargestInArray.largest+" Second largest = "+secondLargestAndLargestInArray.secondLargest);
    }

    private static void missingNumberInArray(){
        // If an array consist of N continuous digit then find missing number in an array.
        // Sum of First N Number = n(n+1)/2
        // Missing Number = Sum of first N Number - Sum of all elements in array

        MissingNumberInArray missingNumberInArray = new MissingNumberInArray();
        int[] arr = {1,2,3,4,5,0,7,8,6};
        int lengthofArray = 9;
        int missingNumber= missingNumberInArray.missingNumberInArray(arr, lengthofArray);
        System.out.println(missingNumber);
    }

    private static void pairEachElementInArray(){

        PairEachElementInArray pairEachElementInArray = new PairEachElementInArray();
        List<List<Integer>> result = new ArrayList<>();
        int[] arr = {1,2,3};
        pairEachElementInArray.pairEachElement(result,arr, new ArrayList<>());
        System.out.println("Combination Size = "+result.size());
        result.forEach(System.out::println);
    }

    public static void reverseArrayWithoutUsingNewArray(){
        int[] arr = {1,2,3,4,5};
        ReverseArrayWithoutUsingNewArray reverseArrayWithoutUsingNewArray = new ReverseArrayWithoutUsingNewArray(arr);
        reverseArrayWithoutUsingNewArray.reverseArray();
        System.out.println("Reverse Array: "+ Arrays.toString(arr));
    }

}
