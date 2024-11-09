package dynamic;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {

        int[] coins = {1,2,5};
        coinChange(coins,11);

    }
//    Input: coins = [1,2,5], amount = 11
//    Output: 3
//    Explanation: 11 = 5 + 5 + 1
//    Example 2:
//
//    Input: coins = [2], amount = 3
//    Output: -1
//    Example 3:
//
//    Input: coins = [1], amount = 0
//    Output: 0

    public static int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;

        for(int i=1;i<amount+1;i++){
            for(int coin:coins){
                if(i-coin >= 0 && dp[i-coin] !=Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }

        if(dp[amount] == Integer.MAX_VALUE){
            return -1;
        }

        return dp[amount];


    }
}
