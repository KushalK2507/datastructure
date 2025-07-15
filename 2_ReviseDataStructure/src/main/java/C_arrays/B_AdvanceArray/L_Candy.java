package C_arrays.B_AdvanceArray;

//
// Example 1:
//
//        Input: ratings = [1,0,2]
//        Output: 5
//        Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies
// respectively.
public class L_Candy {

  public int candy(int[] ratings) {
    int n = ratings.length;
    int[] candies = new int[n];

    // Step 1: Give each child at least one candy
    for (int i = 0; i < n; i++) candies[i] = 1;

    // Step 2: Left to Right
    for (int i = 1; i < n; i++) {
      if (ratings[i] > ratings[i - 1]) {
        candies[i] = candies[i - 1] + 1;
      }
    }

    // Step 3: Right to Left
    for (int i = n - 2; i >= 0; i--) {
      if (ratings[i] > ratings[i + 1]) {
        candies[i] = Math.max(candies[i], candies[i + 1] + 1);
      }
    }

    // Step 4: Total candies
    int totalCandies = 0;
    for (int c : candies) totalCandies += c;

    return totalCandies;
  }
}
