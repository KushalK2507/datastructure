package searching.tester;

import searching.*;

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

    private static void minimumInRotatedSortedArray(){
        int[] arr = {3,4,5,1,2};
        MinimumInSortedArray minimumInSortedArray = new MinimumInSortedArray(arr);
        System.out.println("Minimum in Rotated Sorted Array = "+minimumInSortedArray.minInRotatedSortedArray());
        int[] arr1 ={-4,-5,-7,0,1,3,4,5,8,9};
        MinimumInSortedArray minimumInSortedArray1 = new MinimumInSortedArray(arr1);
        System.out.println("Minimum in Rotated Sorted Array = "+minimumInSortedArray1.minInRotatedSortedArray());


    }

    private static void firstAndLastPositionInSortedArray(){
        int[] arr = {1,2,3,4,4,4,5,5,6,7,7,8};
        int targetElement = 5;
        StartAndLastIndexInSortedArray startAndLastIndexInSortedArray = new StartAndLastIndexInSortedArray(arr,targetElement);
        System.out.println("First and last Index in Sorted Array = "+startAndLastIndexInSortedArray.firstAndLastIndex());

    }

    private static void searchElementInRotatedArray(){
        int[] arr = {4,5,6,7,1,2,3};
        int targetElement = 1;
        SearchInSortedRotatedArray searchInSortedRotatedArray = new SearchInSortedRotatedArray(arr,targetElement);
        System.out.println("Search In Sorted Rotated Array = "+searchInSortedRotatedArray.searchInRotatedArray());

        int[] arr1 =  {9,8,7,6,5,1,2};
        int targetElement1 = 8;
        SearchInSortedRotatedArray searchInSortedRotatedArray1 = new SearchInSortedRotatedArray(arr1,targetElement1);
        System.out.println("Search In Sorted Rotated Array = "+searchInSortedRotatedArray1.searchInRotatedArray());
    }

    private static void searchInsertionPosition(){
        int[] arr = {1,3,4,5,6,89};
        int targetElement = 2;
        SearchInsertionPosition searchInsertionPosition = new SearchInsertionPosition(arr,targetElement);
        System.out.println("Insertion Position = "+searchInsertionPosition.insertionPosition());

    }

    private static void binarySearch(){
        int[] arr = {1,3,5,7,9,11,15,19};
        int targetElement = 19;
        BinarySearch binarySearch = new BinarySearch(arr,targetElement);
        System.out.println("Binary Search element index = "+binarySearch.binarySearch());
    }

    private static void selectionSearching(){
        int[] arr = {1,2,3,54,5,7};
        int targetElement =  54;
        SelectionSearch selectionSearch = new SelectionSearch(arr,targetElement);
        System.out.println("Selection Search element index = "+selectionSearch.selectionSearch());

    }
}
