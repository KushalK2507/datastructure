package P_dynamic;

import java.util.Arrays;
import java.util.Map;

public class CoinChange {


    public int coinChange(int[] coins, int target){

        int[] dp = new int[target+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i=1;i<dp.length;i++){
            for (int coin:coins){
                if (i-coin >=0 && dp[i-coin] != Integer.MAX_VALUE){
                 dp[i] = Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        if (dp[target] == Integer.MAX_VALUE){
            return -1;
        }

        return dp[target];
    }
    public int noOfCoinsCombinationToTargetAmount(int[] coins,int length,int remainingAmount){

        if (remainingAmount == 0){
            return 1;
        }
        if (remainingAmount < 0){
            return 0;
        }

        if (length <= 0){
            return 0;
        }

        return noOfCoinsCombinationToTargetAmount(coins,length-1,remainingAmount)+noOfCoinsCombinationToTargetAmount(coins,length,remainingAmount-coins[length-1]);

    }
}
