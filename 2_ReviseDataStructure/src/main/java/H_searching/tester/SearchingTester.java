package H_searching.tester;

import H_searching.*;

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
    F_MinimumInSortedArray FMinimumInSortedArray = new F_MinimumInSortedArray(arr);
    System.out.println(
        "Minimum in Rotated Sorted Array = " + FMinimumInSortedArray.minInRotatedSortedArray());
    int[] arr1 = {-4, -5, -7, 0, 1, 3, 4, 5, 8, 9};
    F_MinimumInSortedArray FMinimumInSortedArray1 = new F_MinimumInSortedArray(arr1);
    System.out.println(
        "Minimum in Rotated Sorted Array = " + FMinimumInSortedArray1.minInRotatedSortedArray());
  }

  private static void firstAndLastPositionInSortedArray() {
    int[] arr = {1, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8};
    int targetElement = 5;
    E_StartAndLastIndexInSortedArray EStartAndLastIndexInSortedArray =
        new E_StartAndLastIndexInSortedArray(arr, targetElement);
    System.out.println(
        "First and last Index in Sorted Array = "
            + EStartAndLastIndexInSortedArray.firstAndLastIndex());
  }

  private static void searchElementInRotatedArray() {
    int[] arr = {4, 5, 6, 7, 1, 2, 3};
    int targetElement = 1;
    D_SearchInSortedRotatedArray DSearchInSortedRotatedArray =
        new D_SearchInSortedRotatedArray(arr, targetElement);
    System.out.println(
        "Search In Sorted Rotated Array = " + DSearchInSortedRotatedArray.searchInRotatedArray());

    int[] arr1 = {9, 8, 7, 6, 5, 1, 2};
    int targetElement1 = 8;
    D_SearchInSortedRotatedArray DSearchInSortedRotatedArray1 =
        new D_SearchInSortedRotatedArray(arr1, targetElement1);
    System.out.println(
        "Search In Sorted Rotated Array = " + DSearchInSortedRotatedArray1.searchInRotatedArray());
  }

  private static void searchInsertionPosition() {
    int[] arr = {1, 3, 4, 5, 6, 89};
    int targetElement = 2;
    C_SearchInsertionPosition CSearchInsertionPosition =
        new C_SearchInsertionPosition(arr, targetElement);
    System.out.println("Insertion Position = " + CSearchInsertionPosition.insertionPosition());
  }

  private static void binarySearch() {
    int[] arr = {1, 3, 5, 7, 9, 11, 15, 19};
    int targetElement = 19;
    A_BinarySearch BBinarySearch = new A_BinarySearch(arr, targetElement);
    System.out.println("Binary Search element index = " + BBinarySearch.binarySearch());
  }

  private static void selectionSearching() {
    int[] arr = {1, 2, 3, 54, 5, 7};
    int targetElement = 54;
    B_SelectionSearch ASelectionSearch = new B_SelectionSearch(arr, targetElement);
    System.out.println("Selection Search element index = " + ASelectionSearch.selectionSearch());
  }
}
