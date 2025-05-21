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
}
