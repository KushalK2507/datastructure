package K_Dynanic.tester;

import K_Dynanic.*;
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

    // LetterCombination
    letterCombination();
    System.out.println();
    System.out.println("--------------------");

    // Combinations
    combinations();
    System.out.println();
    System.out.println("--------------------");

    // Permutation from Array Number
    permutationFromArray();
    System.out.println();
    System.out.println("--------------------");

    // Permutation from given string
    permutationFromGivenString();
    System.out.println();
    System.out.println("--------------------");

    // CombinationSums
    combinationSum();
    System.out.println();
    System.out.println("--------------------");

    // GenerateParenthesis
    generateParenthesis();
    System.out.println();
    System.out.println("--------------------");

    // CoinChange
    coinChange();
    System.out.println();
    System.out.println("--------------------");

    // Traingle To tp Bottom Min Sum
    topToBottomMinSum();
    System.out.println();
    System.out.println("--------------------");

    climbStairs();
    System.out.println();
    System.out.println("--------------------");

    houseRobbers();
    System.out.println();
    System.out.println("--------------------");

    squareRootOfNumber();
    System.out.println();
    System.out.println("--------------------");
  }

  private static void squareRootOfNumber() {
    P_SquareRootOfNumber squareRootOfNumber = new P_SquareRootOfNumber();
    System.out.print("Square Root Of Number: " + squareRootOfNumber.squareRootOfNumber(8));
  }

  private static void houseRobbers() {
    int[] money = {1, 2, 3, 1};
    O_HouseRobbers houseRobbers = new O_HouseRobbers();
    System.out.print("Max Amount Robbed = " + houseRobbers.totalSumInRobber(money));
  }

  private static void climbStairs() {
    N_ClimbStairs climbStairs = new N_ClimbStairs();
    System.out.print("ClimbStairs = " + climbStairs.climStepsCombination(2));
  }

  private static void topToBottomMinSum() {
    List<List<Integer>> triangle =
        List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));

    L_Traingle traingle = new L_Traingle();
    System.out.println("Min path Sum: ");
    System.out.print(traingle.maxPathSumInTraingle(triangle));
  }

  private static void coinChange() {
    J_CoinChange coinChange = new J_CoinChange();
    int[] coins = {1, 2, 5};
    System.out.print(coinChange.coinChange(coins, 11));
  }

  private static void generateParenthesis() {
    H_GenerateParenthesis generateParenthesis = new H_GenerateParenthesis();
    List<String> res = new LinkedList<>();
    generateParenthesis.generateParenthesis(3, 0, 0, new StringBuffer(), res);
    System.out.print(res);
  }

  private static void combinationSum() {
    G_CombinationSums combinationSum = new G_CombinationSums();
    int[] input = {2, 3, 6, 7};
    int target = 7;
    List<List<Integer>> result = new LinkedList<>();
    combinationSum.combinationSums(input, target, result, new LinkedList<>());
    System.out.print(result);
  }

  private static void permutationFromArray() {

    F_PermutationOfStringAndNumber permutations = new F_PermutationOfStringAndNumber();
    List<List<Integer>> result = new LinkedList<>();
    int[] arr = {1, 2, 3};
    permutations.permutationOfNumber(arr, new LinkedList<>(), result);
    System.out.print(result);
  }

  private static void permutationFromGivenString() {
    F_PermutationOfStringAndNumber permutations = new F_PermutationOfStringAndNumber();
    List<String> result = new LinkedList<>();
    permutations.permutationOfString("abc", "", result);
    System.out.print(result);
  }

  private static void combinations() {
    E_Combinations combinations = new E_Combinations();
    int n = 4;
    int k = 2;
    List<List<Integer>> res = new ArrayList<>();
    combinations.combinations(n, k, 1, res, new LinkedList<>());
    System.out.print(res);
  }

  private static void letterCombination() {
    D_LetterCombination letterCombinations = new D_LetterCombination();
    System.out.print(letterCombinations.letterCombination(123));
  }

  private static void intervalRanges() {
    System.out.println("Interval Ranges");
    int[] input = {0, 1, 2, 4, 5, 7};
    C_IntervalRanges intervalRanges = new C_IntervalRanges();
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
    System.out.print(
        "Next Largest Number = " + largestNextNumber.nextLargestNumber(nextLargestNoInput));
  }
}
