package F_sorting.tester;

import F_sorting.*;

import java.util.Arrays;

public class SortingTester {

    public static void main(String[] args) {

        //Selection Sorting
        selectionSorting();
        System.out.println("-----------------------------------");

        //Bubble Sorting
        bubbleSorting();
        System.out.println("-----------------------------------");

        //Insertion Sorting
        insertionSorting();
        System.out.println("-----------------------------------");

        //Merge Sorting
        mergeSort();
        System.out.println("-----------------------------------");

        //Quick Sorting
        quickSort();
        System.out.println("-----------------------------------");

        minMaxFormOfSortedArray();
        System.out.println("-----------------------------------");

        dutchNationalFlag();
        System.out.println("-----------------------------------");

        squareOfSortedArray();
        System.out.println("-----------------------------------");

        mergeSortedArray();
        System.out.println("-----------------------------------");

    }

    public static void mergeSortedArray(){
        int[] arr1 = {1,2,4,5,6,7,8,15};
        int[] arr2 = {0,2,3,8,9,11,12};
        MergeSortedArray mergeSortedArray = new MergeSortedArray(arr1,arr2);
        System.out.println("Orignal Array1 = "+Arrays.toString(arr1));
        System.out.println("Orignal Array2 = "+Arrays.toString(arr2));
        mergeSortedArray.mergeSortedArray();
        System.out.println("Merged Sorted Array = "+Arrays.toString(mergeSortedArray.res));

    }

    public static void squareOfSortedArray(){
        int[] arr = {-4,-2,-1,0,4,5,9};
        SquareOfSortedArray squareOfSortedArray = new SquareOfSortedArray(arr);
        System.out.println("Orignal Array = "+Arrays.toString(arr));
        squareOfSortedArray.sortedArray();
        System.out.println("Square Of Sorted Array = "+Arrays.toString(squareOfSortedArray.res));

    }

    public static void dutchNationalFlag(){

        int[] arr = {0,2,1,0,2,1,1,2,0};
        DutchNationalFlag dutchNationalFlag = new DutchNationalFlag(arr);
        System.out.println("Orignal Array = "+Arrays.toString(arr));
        dutchNationalFlag.dutchNationalFlag();
        System.out.println("Dutch National Flag = "+Arrays.toString(arr));

    }

    public static void minMaxFormOfSortedArray(){
        int [] arr = {1,5,8,9,4,2,7};
        RearrangeArrayInMinMaxForm rearrangeArrayInMinMaxForm = new RearrangeArrayInMinMaxForm(arr);
        System.out.println("Orignal Array = "+Arrays.toString(arr));
        rearrangeArrayInMinMaxForm.rearrangeArray();
        System.out.println("Rearranged Array = "+Arrays.toString(arr));
    }

    private static void quickSort(){
        int[] arr = {9,0,5,7,3,7,2,1};
        QuickSort quickSort = new QuickSort(arr);
        System.out.println("Original Array = "+ Arrays.toString(arr));
        quickSort.quickSort(0,arr.length-1);
        System.out.println("Quick Sort Array = "+ Arrays.toString(arr));

    }

    private static void mergeSort(){
        int[] arr = {9,0,5,7,3,7,2,1};
        MergeSort mergeSort = new MergeSort(arr);
        System.out.println("Original Array = "+ Arrays.toString(arr));
        mergeSort.mergeSort(0,arr.length-1);
        System.out.println("Merge Sort Array = "+ Arrays.toString(arr));

    }

    private static void insertionSorting(){
        int[] arr = {9,0,5,7,3,7,2,1};
        InsertionSorting insertionSorting = new InsertionSorting(arr);
        System.out.println("Original Array = "+ Arrays.toString(arr));
        insertionSorting.insertionSort();
        System.out.println("Insertion Sorting Array = "+ Arrays.toString(arr));

    }

    private static void bubbleSorting(){
        int[] arr = {9,0,5,7,3,7,2,1};
        BubbleSorting bubbleSorting = new BubbleSorting(arr);
        System.out.println("Original Array = "+ Arrays.toString(arr));
        bubbleSorting.bubbleSort();
        System.out.println("Bubble Sorting Array = "+ Arrays.toString(arr));

    }

    private static void selectionSorting(){
        int[] arr = {9,0,5,7,3,7,2,1};
        SelectionSorting selectionSorting = new SelectionSorting(arr);
        System.out.println("Original Array = "+ Arrays.toString(arr));
        selectionSorting.selectSort();
        System.out.println("Selection Sorting Array = "+ Arrays.toString(arr));

    }
}
