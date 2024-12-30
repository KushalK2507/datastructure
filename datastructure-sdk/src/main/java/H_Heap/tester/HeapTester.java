package H_Heap.tester;

import H_Heap.A_KPairWithSmallestSum;
import H_Heap.B_KthLargestElementInArray;
import H_Heap.C_MedianOfStream;

public class HeapTester {

  public static void main(String[] args) {

    System.out.println("Find K Pair With Min Sum");
    kPairWithMinSum();
    System.out.println("---------------------------------------");

    System.out.println("Find Kth Largest Element in Array");
    kthLargestElementInArray();
    System.out.println("---------------------------------------");

    System.out.println("Find Median");
    findMedian();
    System.out.println("---------------------------------------");
  }

  private static void findMedian() {
    C_MedianOfStream meridianFinder = new C_MedianOfStream();
    meridianFinder.addNum(1);
    meridianFinder.addNum(2);
    System.out.println("Meridian = " + meridianFinder.findMedian());
    meridianFinder.addNum(3);
    System.out.println("Meridian = " + meridianFinder.findMedian());
  }

  private static void kthLargestElementInArray() {
    int[] arr = {3, 2, 1, 5, 6, 4};
    int k = 2;
    B_KthLargestElementInArray kthLargestElementInArray = new B_KthLargestElementInArray();
    System.out.println(kthLargestElementInArray.kthLargestElementInArray(arr, k));
  }

  private static void kPairWithMinSum() {
    int[] num1 = {1, 7, 11};
    int[] num2 = {2, 4, 6};
    int k = 3;
    A_KPairWithSmallestSum findKPairWithMinSum = new A_KPairWithSmallestSum();
    var result = findKPairWithMinSum.findKPairWithMinSum(num1, num2, k);
    System.out.println("K pair with Min Sum = ");
    result.forEach(System.out::println);
  }
}
