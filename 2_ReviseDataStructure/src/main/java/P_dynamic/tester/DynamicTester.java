package P_dynamic.tester;

import B_math.D_SquareRootOfNumber;
import E_matrix.B_Intervals.C_IntervalRanges;
import P_dynamic.*;
import P_dynamic.A_Backtracking.*;
import P_dynamic.B_1DP.A_CoinChange;
import P_dynamic.B_1DP.C_ClimbStairs;
import P_dynamic.B_1DP.D_HouseRobbers;
import P_dynamic.C_2DP.A_MinPathSum;
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
    coinCombinationChange();
    System.out.println();
    System.out.println("--------------------");

    numberOfMinCoin();
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

  private static void coinChange() {}

  private static void squareRootOfNumber() {

    D_SquareRootOfNumber GSquareRootOfNumber = new D_SquareRootOfNumber(8);
    System.out.print("Square Root Of Number: " + GSquareRootOfNumber.squareRootOfNumber());
  }

  private static void houseRobbers() {
    int[] money = {1, 2, 3, 1};
    D_HouseRobbers DHouseRobbers = new D_HouseRobbers(money);
    System.out.print("Max Amount Robbed = " + DHouseRobbers.maxAmountRob());
  }

  private static void climbStairs() {
    C_ClimbStairs CClimbStairs = new C_ClimbStairs(2);
    System.out.print("ClimbStairs = " + CClimbStairs.climbStairs());
  }

  private static void topToBottomMinSum() {
    List<List<Integer>> triangle =
        List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));

    A_MinPathSum DTraingle = new A_MinPathSum();
    System.out.println("Min path Sum: ");
    System.out.print(DTraingle.triangle(triangle));
  }

  private static void coinCombinationChange() {

    A_CoinChange ACoinChange = new A_CoinChange();
    int[] coins = {1, 2, 3};
    System.out.println(ACoinChange.noOfCoinsCombinationToTargetAmount(coins, coins.length, 5));
  }

  private static void numberOfMinCoin() {

    A_CoinChange ACoinChange = new A_CoinChange();
    int[] coins = {1, 2, 3};
    System.out.println(ACoinChange.numberOfMinCoin(coins, 5));
  }

  private static void generateParenthesis() {
    E_GenerateParenthesis EGenerateParenthesis = new E_GenerateParenthesis();
    List<String> res = new LinkedList<>();
    EGenerateParenthesis.generateParenthesis(3, 0, 0, new StringBuffer(), res);
    System.out.print(res);
  }

  private static void combinationSum() {
    C_CombinationSum CCombinationSum = new C_CombinationSum();
    int[] input = {2, 3, 6, 7};
    int target = 7;
    List<List<Integer>> result = new LinkedList<>();
    CCombinationSum.targetSum(result, input, target, 0, new LinkedList<>());
    System.out.print(result);
  }

  private static void permutationFromArray() {

    B_Permutations BPermutations = new B_Permutations();
    List<List<Integer>> result = new LinkedList<>();
    int[] arr = {1, 2, 3};
    BPermutations.getPermutationsFromArray(result, new LinkedList<>(), arr);
    System.out.print(result);
  }

  private static void permutationFromGivenString() {
    B_Permutations BPermutations = new B_Permutations();
    List<String> result = new LinkedList<>();
    BPermutations.getPermutationFromString("abc", "", result);
    System.out.print(result);
  }

  private static void combinations() {

    A_Combinations ACombinations = new A_Combinations();
    int n = 4;
    int k = 2;
    ACombinations.getCombinations(ACombinations.res, n, k, 1, new LinkedList<>());
    System.out.print(ACombinations.res);
  }

  private static void letterCombination() {
    D_LetterCombinations DLetterCombinations = new D_LetterCombinations();
    System.out.print(DLetterCombinations.letterCombinations("123"));
  }

  private static void intervalRanges() {
    System.out.println("Interval Ranges");
    int[] input = {0, 1, 2, 4, 5, 7};
    C_IntervalRanges CIntervalRanges = new C_IntervalRanges(input);
    System.out.print(CIntervalRanges.intervalRanges());
  }

  private static void lruChache() {

    System.out.println("LRU Cache");
    B_LruCache cache = new B_LruCache(2);
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
    A_LargestNextNumber ALargestNextNumber = new A_LargestNextNumber();
    System.out.print("Next Largest Number = " + ALargestNextNumber.nextLargerNumber(nextLargestNoInput));
  }
}
