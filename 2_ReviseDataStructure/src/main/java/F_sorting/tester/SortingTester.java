package F_sorting.tester;

import F_sorting.*;
import F_sorting.interview.A_RearrangeArrayInMinMaxForm;
import F_sorting.interview.B_DutchNationalFlag;
import F_sorting.interview.C_SquareOfSortedArray;
import F_sorting.interview.D_MergeSortedArray;
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

  public static void mergeSortedArray() {
    int[] arr1 = {1, 2, 4, 5, 6, 7, 8, 15};
    int[] arr2 = {0, 2, 3, 8, 9, 11, 12};
    D_MergeSortedArray DMergeSortedArray = new D_MergeSortedArray(arr1, arr2);
    System.out.println("Orignal Array1 = " + Arrays.toString(arr1));
    System.out.println("Orignal Array2 = " + Arrays.toString(arr2));
    DMergeSortedArray.mergeSortedArray();
    System.out.println("Merged Sorted Array = " + Arrays.toString(DMergeSortedArray.res));
  }

  public static void squareOfSortedArray() {
    int[] arr = {-4, -2, -1, 0, 4, 5, 9};
    C_SquareOfSortedArray CSquareOfSortedArray = new C_SquareOfSortedArray(arr);
    System.out.println("Orignal Array = " + Arrays.toString(arr));
    CSquareOfSortedArray.sortedArray();
    System.out.println("Square Of Sorted Array = " + Arrays.toString(CSquareOfSortedArray.res));
  }

    public static void dutchNationalFlag(){

    int[] arr = {0, 2, 1, 0, 2, 1, 1, 2, 0};
    B_DutchNationalFlag BDutchNationalFlag = new B_DutchNationalFlag(arr);
    System.out.println("Orignal Array = " + Arrays.toString(arr));
    BDutchNationalFlag.dutchNationalFlag();
    System.out.println("Dutch National Flag = " + Arrays.toString(arr));
    }

    public static void minMaxFormOfSortedArray(){
    int[] arr = {1, 5, 8, 9, 4, 2, 7};
    A_RearrangeArrayInMinMaxForm ARearrangeArrayInMinMaxForm =
        new A_RearrangeArrayInMinMaxForm(arr);
    System.out.println("Orignal Array = " + Arrays.toString(arr));
    ARearrangeArrayInMinMaxForm.rearrangeArray();
    System.out.println("Rearranged Array = " + Arrays.toString(arr));
    }

    private static void quickSort(){
    int[] arr = {9, 0, 5, 7, 3, 7, 2, 1};
    E_QuickSort EQuickSort = new E_QuickSort(arr);
    System.out.println("Original Array = " + Arrays.toString(arr));
    EQuickSort.quickSort(0, arr.length - 1);
    System.out.println("Quick Sort Array = " + Arrays.toString(arr));
    }

    private static void mergeSort(){
    int[] arr = {9, 0, 5, 7, 3, 7, 2, 1};
    D_MergeSort DMergeSort = new D_MergeSort(arr);
    System.out.println("Original Array = " + Arrays.toString(arr));
    DMergeSort.mergeSort(0, arr.length - 1);
    System.out.println("Merge Sort Array = " + Arrays.toString(arr));
    }

    private static void insertionSorting(){
    int[] arr = {9, 0, 5, 7, 3, 7, 2, 1};
    C_InsertionSorting CInsertionSorting = new C_InsertionSorting(arr);
    System.out.println("Original Array = " + Arrays.toString(arr));
    CInsertionSorting.insertionSort();
    System.out.println("Insertion Sorting Array = " + Arrays.toString(arr));
    }

    private static void bubbleSorting(){
    int[] arr = {9, 0, 5, 7, 3, 7, 2, 1};
    B_BubbleSorting BBubbleSorting = new B_BubbleSorting(arr);
    System.out.println("Original Array = " + Arrays.toString(arr));
    BBubbleSorting.bubbleSort();
    System.out.println("Bubble Sorting Array = " + Arrays.toString(arr));
    }

    private static void selectionSorting(){
    int[] arr = {9, 0, 5, 7, 3, 7, 2, 1};
    A_SelectionSorting ASelectionSorting = new A_SelectionSorting(arr);
    System.out.println("Original Array = " + Arrays.toString(arr));
    ASelectionSorting.selectSort();
    System.out.println("Selection Sorting Array = " + Arrays.toString(arr));
    }
}
