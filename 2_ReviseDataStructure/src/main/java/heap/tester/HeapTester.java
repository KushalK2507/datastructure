package heap.tester;

import heap.FindKPairWithMinSum;
import heap.KthLargestElementInArray;
import heap.MeridianFinder;

import java.util.Arrays;

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

    private static void findMedian(){
        MeridianFinder meridianFinder = new MeridianFinder();
        meridianFinder.addNum(1);
        meridianFinder.addNum(2);
        System.out.println("Meridian = "+meridianFinder.findMedian());
        meridianFinder.addNum(3);
        System.out.println("Meridian = "+meridianFinder.findMedian());
    }

    private static void kthLargestElementInArray(){
        int[] arr ={3,2,1,5,6,4};
        int k=2;
        KthLargestElementInArray kthLargestElementInArray = new
                KthLargestElementInArray(arr,k);
        System.out.println(kthLargestElementInArray.kthLargestElement());
    }

    private static void kPairWithMinSum(){
        int[] num1 = {1,7,11};
        int[] num2 = {2,4,6};
        int k=3;
        FindKPairWithMinSum findKPairWithMinSum = new FindKPairWithMinSum(num1,num2,k);
        var result = findKPairWithMinSum.kSmallestPairs();
        System.out.println("K pair with Min Sum = ");
        result.forEach(System.out::println);
    }


}
