package K_Dynanic.tester;

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

    SquareRootOfNumber squareRootOfNumber = new SquareRootOfNumber(8);
    System.out.print("Square Root Of Number: " + squareRootOfNumber.squareRootOfNumber());
  }

  private static void houseRobbers() {
    int[] money = {1, 2, 3, 1};
    HouseRobbers houseRobbers = new HouseRobbers(money);
    System.out.print("Max Amount Robbed = " + houseRobbers.maxAmountRob());
  }

  private static void climbStairs() {
    ClimbStairs climbStairs = new ClimbStairs(2);
    System.out.print("ClimbStairs = " + climbStairs.climbStairs());
  }

  private static void topToBottomMinSum() {
    List<List<Integer>> triangle =
        List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));

    Traingle traingle = new Traingle();
    System.out.println("Min path Sum: ");
    System.out.print(traingle.minPathSum(triangle));
  }

  private static void coinChange() {

    CoinChange coinChange = new CoinChange();
    int[] coins = {1, 2, 5};
    System.out.print(coinChange.coinChange(coins, 11));
  }

  private static void generateParenthesis() {
    GenerateParenthesis generateParenthesis = new GenerateParenthesis();
    List<String> res = new LinkedList<>();
    generateParenthesis.generateParenthesis(3, 0, 0, new StringBuffer(), res);
    System.out.print(res);
  }

  private static void combinationSum() {
    CombinationSum combinationSum = new CombinationSum();
    int[] input = {2, 3, 6, 7};
    int target = 7;
    List<List<Integer>> result = new LinkedList<>();
    combinationSum.targetSum(result, input, target, 0, new LinkedList<>());
    System.out.print(result);
  }

  private static void permutationFromArray() {

    Permutations permutations = new Permutations();
    List<List<Integer>> result = new LinkedList<>();
    int[] arr = {1, 2, 3};
    permutations.getPermutationsFromArray(result, new LinkedList<>(), arr);
    System.out.print(result);
  }

  private static void permutationFromGivenString() {
    Permutations permutations = new Permutations();
    List<String> result = new LinkedList<>();
    permutations.getPermutationFromString("abc", "", result);
    System.out.print(result);
  }

  private static void combinations() {

    Combinations combinations = new Combinations();
    int n = 4;
    int k = 2;
    combinations.getCombinations(combinations.res, n, k, 1, new LinkedList<>());
    System.out.print(combinations.res);
  }

  private static void letterCombination() {
    LetterCombinations letterCombinations = new LetterCombinations(123);
    System.out.print(letterCombinations.getLetterCombinations());
  }

  private static void intervalRanges() {
    System.out.println("Interval Ranges");
    int[] input = {0, 1, 2, 4, 5, 7};
    IntervalRanges intervalRanges = new IntervalRanges(input);
    System.out.print(intervalRanges.intervalRanges());
  }

  private static void lruChache() {

    System.out.println("LRU Cache");
    LruCache cache = new LruCache(2);
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
    LargestNextNumber largestNextNumber = new LargestNextNumber(nextLargestNoInput);
    System.out.print("Next Largest Number = " + largestNextNumber.nextLargestNumber());
  }
}
