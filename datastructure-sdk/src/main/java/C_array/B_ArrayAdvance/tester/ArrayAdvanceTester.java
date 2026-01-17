package C_array.B_ArrayAdvance.tester;

import C_array.B_ArrayAdvance.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayAdvanceTester {

    public static void main(String[] args){
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
        K_RotateArray rotateArray = new K_RotateArray();
        rotateArray.rotateArray(arr,noIfRotation);
        System.out.println("Rotated Array = "+ Arrays.toString(arr));
    }

    private static void tappingRainWater(){
        J_TappingRainWater tappingRainWater = new J_TappingRainWater();
        System.out.println("MaxVol = "+tappingRainWater.tappingRainWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));

    }

    private static void productAllExceptItself(){
        int[] arr = {10,3,5,6,2};
        I_ProductAllElementsExceptItself productEachExceptItself = new I_ProductAllElementsExceptItself();
        System.out.println("Result Product = "+Arrays.toString(productEachExceptItself.productAllElementExceptItself(arr)));
    }

    private static void isJumpPossible(){
        int[] arr = {2,3,1,1,4};
        H_JumpGame jumpGame = new H_JumpGame();
        System.out.println("Is Jump Possible = "+jumpGame.isPossibleToReachEnd(arr));
    }

    private static void minStepsJumpPossible(){
        int[] arr = {2,3,1,1,4};
        H_JumpGame jumpGame = new H_JumpGame();
        System.out.println("Min Steps = "+jumpGame.minJumpToReachEnd(arr));
    }

    private static void knapsackProblem(){
        G_KnapsackProblem knapsackProblem = new G_KnapsackProblem();

    }



    private static void pascalTriangle(){
        F_PascalTraingle pascalTriangle = new F_PascalTraingle();
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
        E_BuyAndSell buyAndSellMaxProfit = new E_BuyAndSell();
        System.out.println("Max Profit = "+   buyAndSellMaxProfit.buySellMaxProfit2(arr));
    }

    private static void maxBuyAndSellProfit(){
        int[] arr = {7,1,5,3,6,4};
        E_BuyAndSell buyAndSellMaxProfit1 = new E_BuyAndSell();
        System.out.println("Max Profit = "+buyAndSellMaxProfit1.buySellMaxProfit1(arr));

        int[] arr1 = {7,6,5,4,1};
        System.out.println("Max Profit = "+buyAndSellMaxProfit1.buySellMaxProfit1(arr1));
    }

    private static void removeDuplicatesFromSortedArray(){
        int[] arr = {1,1,3,3,4,5,6,6};
        D_RemoveDuplicatesInArray removeDuplicatesFromSortedArray = new D_RemoveDuplicatesInArray();
        System.out.println("Orignal Array = "+Arrays.toString(arr));
        System.out.println("Removed Duplicates in Array"+Arrays.toString(removeDuplicatesFromSortedArray.removeDuplicateInArray(arr)));
    }

    private static void tripletToTargetSum(){
        int[] arr = {12, 3, 4, 1, 6, 9};
        int sum = 24;
        C_PairTripletToTargetSum tripletToTargetSum = new C_PairTripletToTargetSum();
        System.out.println("Triplet To Target Sum = "+Arrays.toString(tripletToTargetSum.pairTripletToTargetSum(arr,sum)));

    }
    private static void pairToTargetSum(){
        int[] arr = {1,2,3,4,5,8,3};
        B_PairToTargetSum pairToTargetSumInArray = new B_PairToTargetSum();
        System.out.println("Pair = "+Arrays.toString(pairToTargetSumInArray.pairToTargetSum(arr,13)));
    }
    private static void movesZerosAtTheEnd(){
        int[] arr ={0,1,3,0,0,0,9,2,5,0};
        A_ZerosAtEnd moveZeroAtEnd = new A_ZerosAtEnd();
        System.out.println("Orignal Array = "+Arrays.toString(arr));
        moveZeroAtEnd.moveZerosAtEnd(arr);
        System.out.println("Move Zeros At end = "+Arrays.toString(arr));
    }
}
