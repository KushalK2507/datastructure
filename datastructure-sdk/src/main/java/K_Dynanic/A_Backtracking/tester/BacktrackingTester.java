package K_Dynanic.A_Backtracking.tester;

import K_Dynanic.A_Backtracking.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BacktrackingTester {

  public static void main(String[] args) {

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
    System.out.println("Input Array is " + Arrays.toString(input) + " target sum is " + target);
    List<List<Integer>> result = new LinkedList<>();
    combinationSum.combinationSums(input, target, result, new LinkedList<>());
    System.out.print(result);
  }

  private static void permutationFromArray() {
    F_PermutationOfStringAndNumber permutations = new F_PermutationOfStringAndNumber();
    List<List<Integer>> result = new LinkedList<>();
    int[] arr = {1, 2, 3};
    System.out.println("Input Array " + Arrays.toString(arr));
    permutations.permutationOfNumber(arr, new LinkedList<>(), result);
    System.out.print(result);
  }

  private static void permutationFromGivenString() {
    F_PermutationOfStringAndNumber permutations = new F_PermutationOfStringAndNumber();
    List<String> result = new LinkedList<>();
    String s = "abc";
    System.out.println("Input String =" + s);
    permutations.permutationOfString(s, "", result);
    System.out.print("Permutation = " + result);
  }

  private static void combinations() {
    E_Combinations combinations = new E_Combinations();
    int n = 4;
    int k = 2;
    List<List<Integer>> res = new ArrayList<>();
    System.out.println("Combination of n=4 and k=2 are");
    combinations.combinations(n, k, 1, res, new LinkedList<>());
    System.out.print(res);
  }

  private static void letterCombination() {
    D_LetterCombination letterCombinations = new D_LetterCombination();
    System.out.print("Letter Combination of 123 is " + letterCombinations.letterCombination(123));
  }
}
