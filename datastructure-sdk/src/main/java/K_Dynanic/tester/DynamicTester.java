package K_Dynanic.tester;

import K_Dynanic.*;
import K_Dynanic.A_Backtracking.*;
import K_Dynanic.B_1DP.J_CoinChange;
import K_Dynanic.B_1DP.N_ClimbStairs;
import K_Dynanic.B_1DP.O_HouseRobbers;
import K_Dynanic.C_IntervalRanges;
import K_Dynanic.C_2DP.L_Traingle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DynamicTester {

  public static void main(String[] args) {

    // Next Largest Number
    nextLargestNumber();
    System.out.println();
    System.out.println("--------------------");

    // LRU cache
    lruChache();
    System.out.println();
    System.out.println("--------------------");

    // Interval Ranges
    intervalRanges();
    System.out.println();
    System.out.println("--------------------");

  }



  private static void intervalRanges() {
    System.out.println("Interval Ranges");
    int[] input = {0, 1, 2, 4, 5, 7};
    C_IntervalRanges intervalRanges = new C_IntervalRanges();
    System.out.println("Input Array is "+Arrays.toString(input));
    System.out.print(Arrays.toString(intervalRanges.intervalRanges(input)));
  }

  private static void lruChache() {
    System.out.println("LRU Cache");
    B_LRUCache cache = new B_LRUCache(2);
    cache.put(1, 1);
    cache.put(2, 2);
    System.out.print("Get 1 = " + cache.get(1) + "\t");
    cache.put(3, 3);
    System.out.print("Get 2 = " + cache.get(2) + "\t");
    cache.put(4, 4);
    System.out.print("Get 1 = " + cache.get(1) + "\t");
    System.out.print("Get 3 = " + cache.get(3) + "\t");
    System.out.print("Get 4 = " + cache.get(4) + "\t");
  }

  private static void nextLargestNumber() {
    int nextLargestNoInput = 534976;
    A_LargestNextNumber largestNextNumber = new A_LargestNextNumber();
    System.out.println("Input Number is "+nextLargestNoInput);
    System.out.print(
        "Next Largest Number = " + largestNextNumber.nextLargestNumber(nextLargestNoInput));
  }
}
