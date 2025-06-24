package P_dynamic;

import java.util.Arrays;
import java.util.Map;

public class CoinChange {

    public int noOfCoinsCombinationToTargetAmount(int[] coins,int length,int remainingAmount){

        if (remainingAmount == 0){
            return 1;
        }
        if (remainingAmount < 0 || length==0){
            return 0;
        }

        return noOfCoinsCombinationToTargetAmount(coins,length-1,remainingAmount)+
                noOfCoinsCombinationToTargetAmount(coins,length,remainingAmount-coins[length-1]);

    }
	
	
	 public int numberOfMinCoin(int[] coins,int amount){

         int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1); // high value to indicate "unreachable"
    dp[0] = 0;

    for (int coin : coins) {
        for (int i = coin; i <= amount; i++) {
            dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        }
    }

    return dp[amount] > amount ? -1 : dp[amount];

    }
}
