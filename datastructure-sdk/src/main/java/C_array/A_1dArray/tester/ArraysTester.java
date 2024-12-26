package C_array.A_1dArray.tester;

import C_array.A_1dArray.*;

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
        R_RotateArray rotateArray = new R_RotateArray();
        rotateArray.rotateArray(arr,noIfRotation);
        System.out.println("Rotated Array = "+Arrays.toString(arr));
    }

    private static void tappingRainWater(){
        Q_TappingRainWater tappingRainWater = new Q_TappingRainWater();
        System.out.println("MaxVol = "+tappingRainWater.tappingRainWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));

    }

    private static void productAllExceptItself(){
        int[] arr = {10,3,5,6,2};
        P_ProductAllElementsExceptItself productEachExceptItself = new P_ProductAllElementsExceptItself();
        System.out.println("Result Product = "+Arrays.toString(productEachExceptItself.productAllElementExceptItself(arr)));
    }

    private static void isJumpPossible(){
        int[] arr = {2,3,1,1,4};
        O_JumpGame jumpGame = new O_JumpGame();
        System.out.println("Is Jump Possible = "+jumpGame.isPossibleToReachEnd(arr));
    }

    private static void minStepsJumpPossible(){
        int[] arr = {2,3,1,1,4};
        O_JumpGame jumpGame = new O_JumpGame();
        System.out.println("Min Steps = "+jumpGame.minJumpToReachEnd(arr));
    }

    private static void containerWithMostWater(){
        int[] arr = {1,8,6,2,5,4,8,3,7};
        N_ContainerWithMostWater containerWithMostWater = new N_ContainerWithMostWater();
        System.out.println("Max Water area = "+containerWithMostWater.containerWithMostWater(arr));
    }

    private static void knapsackProblem(){
       M_KnapsackProblem knapsackProblem = new M_KnapsackProblem();

    }



    private static void pascalTriangle(){
        L_PascalTraingle pascalTriangle = new L_PascalTraingle();
        System.out.println("Pascal Triangle");
        var result = pascalTriangle.builtPascalTraingle(7);
        for (int i=0;i<7;i++){
            for (int j=i;j<=7;j++){
                System.out.print(" ");
            }
            System.out.println(result.get(i).stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }

    }

    private static void maxBuyAndSellProfit2(){
        int[] arr ={7,6,4,3,1};// {7,1,5,3,6,4};
        K_BuyAndSell buyAndSellMaxProfit = new K_BuyAndSell();
        System.out.println("Max Profit = "+   buyAndSellMaxProfit.buySellMaxProfit2(arr));
    }

    private static void maxBuyAndSellProfit(){
        int[] arr = {7,1,5,3,6,4};
        K_BuyAndSell buyAndSellMaxProfit1 = new K_BuyAndSell();
        System.out.println("Max Profit = "+buyAndSellMaxProfit1.buySellMaxProfit1(arr));

        int[] arr1 = {7,6,5,4,1};
        System.out.println("Max Profit = "+buyAndSellMaxProfit1.buySellMaxProfit1(arr1));
    }

    private static void removeDuplicatesFromSortedArray(){
        int[] arr = {1,1,3,3,4,5,6,6};
        J_RemoveDuplicatesInArray removeDuplicatesFromSortedArray = new J_RemoveDuplicatesInArray();
        System.out.println("Orignal Array = "+Arrays.toString(arr));
        System.out.println("Removed Duplicates in Array"+Arrays.toString(removeDuplicatesFromSortedArray.removeDuplicateInArray(arr)));
    }

    private static void tripletToTargetSum(){
        int[] arr = {12, 3, 4, 1, 6, 9};
        int sum = 24;
        I_PairTripletToTargetSum tripletToTargetSum = new I_PairTripletToTargetSum();
        System.out.println("Triplet To Target Sum = "+Arrays.toString(tripletToTargetSum.pairTripletToTargetSum(arr,sum)));

    }
    private static void pairToTargetSum(){
        int[] arr = {1,2,3,4,5,8,3};
        H_PairToTargetSum pairToTargetSumInArray = new H_PairToTargetSum();
        System.out.println("Pair = "+Arrays.toString(pairToTargetSumInArray.pairToTargetSum(arr,13)));
    }
    private static void movesZerosAtTheEnd(){
        int[] arr ={0,1,3,0,0,0,9,2,5,0};
        G_ZerosAtEnd moveZeroAtEnd = new G_ZerosAtEnd();
        System.out.println("Orignal Array = "+Arrays.toString(arr));
        moveZeroAtEnd.moveZerosAtEnd(arr);
        System.out.println("Move Zeros At end = "+Arrays.toString(arr));
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
        System.out.println("Array are Identical = "+arraysAreIdentical.isArrayIdentical(arr1,arr2));

        int[] arr3 = {1,2,3,65,44,3,2};
        int[] arr4 = {1,2,3,65,2,3,44};
        System.out.println("Array are Identical1 = "+arraysAreIdentical.isArrayIdentical(arr3,arr4));
    }

    private static void secondLargestAndLargestInArray(){
        int[] arr = {10, 5, 10};
        D_LargestAndSecondLargestInArray secondLargestAndLargestInArray = new D_LargestAndSecondLargestInArray();
        var result = secondLargestAndLargestInArray.largestAndSecondLargestNumber(arr);
        System.out.println("Largest = "+result[0]+" Second largest = "+result[1]);
    }

    private static void missingNumberInArray(){
        // If an array consist of N continuous digit then find missing number in an array.
        // Sum of First N Number = n(n+1)/2
        // Missing Number = Sum of first N Number - Sum of all elements in array
        C_MissingElementInArray missingNumberInArray = new C_MissingElementInArray();
        int[] arr = {1,2,3,4,5,0,7,8,6};
        int lengthofArray = 9;
        int missingNumber= missingNumberInArray.missingNumberInArray(arr, lengthofArray);
        System.out.println(missingNumber);
    }

    private static void pairEachElementInArray(){
        B_PairEachElementInArray pairEachElementInArray = new B_PairEachElementInArray();
        List<List<Integer>> result = new ArrayList<>();
        int[] arr = {1,2,3};
        pairEachElementInArray.pairEachElement(result,arr, new ArrayList<>());
        System.out.println("Combination Size = "+result.size());
        result.forEach(System.out::println);
    }

    public static void reverseArrayWithoutUsingNewArray(){
        int[] arr = {1,2,3,4,5};
        A_ReverseArrayWithoutUsingNewArray reverseArrayWithoutUsingNewArray = new A_ReverseArrayWithoutUsingNewArray();
        reverseArrayWithoutUsingNewArray.reverseArray(arr);
        System.out.println("Reverse Array: "+ Arrays.toString(arr));
    }

}
