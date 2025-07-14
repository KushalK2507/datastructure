package C_arrays;

public class M_KnapsackProblem {

        public static int knapsack(int W, int[] weight, int[] profit, int N) {
            int[][] dp = new int[N + 1][W + 1];

            for (int i = 1; i <= N; i++) {
                for (int w = 0; w <= W; w++) {
                    if (weight[i - 1] <= w) {
                        dp[i][w] = Math.max(dp[i - 1][w], profit[i - 1] + dp[i - 1][w - weight[i - 1]]);
                    } else {
                        dp[i][w] = dp[i - 1][w];
                    }
                }
            }

            return dp[N][W];
        }

}
