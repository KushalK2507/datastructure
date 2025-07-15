package L_heap.tester;

import L_heap.A_FindKPairWithMinSum;
import L_heap.B_KthLargestElementInArray;
import L_heap.C_MeridianFinder;

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
    C_MeridianFinder CMeridianFinder = new C_MeridianFinder();
    CMeridianFinder.addNum(1);
    CMeridianFinder.addNum(2);
    System.out.println("Meridian = " + CMeridianFinder.findMedian());
    CMeridianFinder.addNum(3);
    System.out.println("Meridian = " + CMeridianFinder.findMedian());
  }

  private static void kthLargestElementInArray() {
    int[] arr = {3, 2, 1, 5, 6, 4};
    int k = 2;
    B_KthLargestElementInArray BKthLargestElementInArray = new B_KthLargestElementInArray(arr, k);
    System.out.println(BKthLargestElementInArray.kthLargestElement());
  }

  private static void kPairWithMinSum() {
    int[] num1 = {1, 7, 11};
    int[] num2 = {2, 4, 6};
    int k = 3;
    A_FindKPairWithMinSum AFindKPairWithMinSum = new A_FindKPairWithMinSum(num1, num2, k);
    var result = AFindKPairWithMinSum.kSmallestPairs();
    System.out.println("K pair with Min Sum = ");
    result.forEach(System.out::println);
  }
}
