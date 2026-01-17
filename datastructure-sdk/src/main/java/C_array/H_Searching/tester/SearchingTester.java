package C_array.H_Searching.tester;

import C_array.H_Searching.*;
import java.util.Arrays;

public class SearchingTester {

  public static void main(String[] args) {

    selectionSearching();
    System.out.println("----------------------------------------");

    binarySearch();
    System.out.println("----------------------------------------");

    searchInsertionPosition();
    System.out.println("----------------------------------------");

    searchElementInRotatedArray();
    System.out.println("----------------------------------------");

    firstAndLastPositionInSortedArray();
    System.out.println("----------------------------------------");

    minimumInRotatedSortedArray();
    System.out.println("----------------------------------------");
  }

  private static void minimumInRotatedSortedArray() {
    int[] arr = {3, 4, 5, 1, 2};
    F_MinimumInSortedRotatedArray minimumInSortedArray = new F_MinimumInSortedRotatedArray();
    System.out.println("Original Array "+ Arrays.toString(arr));
    System.out.println(
        "Minimum in Rotated Sorted Array = " + minimumInSortedArray.minInSortedArray(arr));
    int[] arr1 = {-4, -5, -7, 0, 1, 3, 4, 5, 8, 9};

    System.out.println("Original Array "+ Arrays.toString(arr1));
    System.out.println(
        "Minimum in Rotated Sorted Array = " + minimumInSortedArray.minInSortedArray(arr1));
  }

  private static void firstAndLastPositionInSortedArray() {
    int[] arr = {1, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8};
    int targetElement = 5;
    E_FirstAndLastIndexOfElementInSortedArray startAndLastIndexInSortedArray =
        new E_FirstAndLastIndexOfElementInSortedArray();
    System.out.println("Original Array "+ Arrays.toString(arr)+" Target Element "+targetElement);
    System.out.println(
        "First and last Index in Sorted Array = "
            + Arrays.toString(
                startAndLastIndexInSortedArray.firstAndLastIndexInSortedArray(arr, targetElement)));
  }

  private static void searchElementInRotatedArray() {
    int[] arr = {4, 5, 6, 7, 1, 2, 3};
    int targetElement = 1;
    D_SearchInRotatedSortedArray searchInSortedRotatedArray = new D_SearchInRotatedSortedArray();

    System.out.println("Original Array "+ Arrays.toString(arr)+" Target Element "+targetElement);
    System.out.println(
        "Search In Sorted Rotated Array = "
            + searchInSortedRotatedArray.searchInRotatedArray(arr, targetElement));

    int[] arr1 = {9, 8, 7, 6, 5, 1, 2};
    int targetElement1 = 8;

    System.out.println("Original Array "+ Arrays.toString(arr1)+" Target Element "+targetElement1);
    System.out.println(
        "Search In Sorted Rotated Array = "
            + searchInSortedRotatedArray.searchInRotatedArray(arr1, targetElement1));
  }

  private static void searchInsertionPosition() {
    int[] arr = {1, 3, 4, 5, 6, 89};
    int targetElement = 2;
    C_SearchInsertionPositionInSortedArray searchInsertionPosition =
        new C_SearchInsertionPositionInSortedArray();
    System.out.println("Original Array "+ Arrays.toString(arr)+" Target Element "+targetElement);
    System.out.println(
        "Insertion Position = " + searchInsertionPosition.insertionPosition(arr, targetElement));
  }

  private static void binarySearch() {
    int[] arr = {1, 3, 5, 7, 9, 11, 15, 19};
    int targetElement = 19;
    B_BinarySearch binarySearch = new B_BinarySearch();
    System.out.println("Original Array "+ Arrays.toString(arr)+" Target Element "+targetElement);
    System.out.println(
        "Binary Search element index = " + binarySearch.binarySearch(arr, targetElement));
  }

  private static void selectionSearching() {
    int[] arr = {1, 2, 3, 54, 5, 7};
    int targetElement = 54;
    A_SelectionSearch selectionSearch = new A_SelectionSearch();
    System.out.println("Original Array "+ Arrays.toString(arr)+" Target Element "+targetElement);
    System.out.println(
        "Selection Search element index = "
            + selectionSearch.selectionSearching(arr, targetElement));
  }
}
