package C_array.G_Sorting.tester;

import C_array.G_Sorting.*;
import java.util.Arrays;

public class SortingTester {

  public static void main(String[] args) {

    // Selection Sorting
    selectionSorting();
    System.out.println("-----------------------------------");

    // Bubble Sorting
    bubbleSorting();
    System.out.println("-----------------------------------");

    // Insertion Sorting
    insertionSorting();
    System.out.println("-----------------------------------");

    // Merge Sorting
    mergeSort();
    System.out.println("-----------------------------------");

    // Quick Sorting
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
    I_MergeSortedArray mergeSortedArray = new I_MergeSortedArray();
    System.out.println("Orignal Array1 = " + Arrays.toString(arr1));
    System.out.println("Orignal Array2 = " + Arrays.toString(arr2));
    var res = mergeSortedArray.mergeSortedArray(arr1, arr2);
    System.out.println("Merged Sorted Array = " + Arrays.toString(res));
  }

  public static void squareOfSortedArray() {
    int[] arr = {-4, -2, -1, 0, 4, 5, 9};
    H_SquareOfSortedArray squareOfSortedArray = new H_SquareOfSortedArray();
    System.out.println("Orignal Array = " + Arrays.toString(arr));
    squareOfSortedArray.squareOfSortedArray(arr);
    System.out.println("Square Of Sorted Array = " + Arrays.toString(arr));
  }

  public static void dutchNationalFlag() {

    int[] arr = {0, 2, 1, 0, 2, 1, 1, 2, 0};
    G_DutchNationalFlag dutchNationalFlag = new G_DutchNationalFlag();
    System.out.println("Orignal Array = " + Arrays.toString(arr));
    dutchNationalFlag.dutchNationalFlag(arr);
    System.out.println("Dutch National Flag = " + Arrays.toString(arr));
  }

  public static void minMaxFormOfSortedArray() {
    int[] arr = {1, 5, 8, 9, 4, 2, 7};
    F_RearrangeArrayInMinMaxForm rearrangeArrayInMinMaxForm = new F_RearrangeArrayInMinMaxForm();
    System.out.println("Orignal Array = " + Arrays.toString(arr));
    rearrangeArrayInMinMaxForm.rearrangeArrayInMinMaxForm(arr);
    System.out.println("Rearranged Array = " + Arrays.toString(arr));
  }

  private static void quickSort() {
    int[] arr = {9, 0, 5, 7, 3, 7, 2, 1};
    D_QuickSort quickSort = new D_QuickSort();
    System.out.println("Original Array = " + Arrays.toString(arr));
    quickSort.quickSort(arr, 0, arr.length - 1);
    System.out.println("Quick Sort Array = " + Arrays.toString(arr));
  }

  private static void mergeSort() {
    int[] arr = {9, 0, 5, 7, 3, 7, 2, 1};
    E_MergeSort mergeSort = new E_MergeSort();
    System.out.println("Original Array = " + Arrays.toString(arr));
    mergeSort.mergeSort(arr, 0, arr.length - 1);
    System.out.println("Merge Sort Array = " + Arrays.toString(arr));
  }

  private static void insertionSorting() {
    int[] arr = {9, 0, 5, 7, 3, 7, 2, 1};
    C_InsertionSort insertionSorting = new C_InsertionSort();
    System.out.println("Original Array = " + Arrays.toString(arr));
    insertionSorting.insertionSort(arr);
    System.out.println("Insertion Sorting Array = " + Arrays.toString(arr));
  }

  private static void bubbleSorting() {
    int[] arr = {9, 0, 5, 7, 3, 7, 2, 1};
    B_BubbleSort bubbleSorting = new B_BubbleSort();
    System.out.println("Original Array = " + Arrays.toString(arr));
    bubbleSorting.bubbleSorting(arr);
    System.out.println("Bubble Sorting Array = " + Arrays.toString(arr));
  }

  private static void selectionSorting() {
    int[] arr = {9, 0, 5, 7, 3, 7, 2, 1};
    A_SelectionSorting selectionSorting = new A_SelectionSorting();
    System.out.println("Original Array = " + Arrays.toString(arr));
    selectionSorting.selectionSorting(arr);
    System.out.println("Selection Sorting Array = " + Arrays.toString(arr));
  }
}
