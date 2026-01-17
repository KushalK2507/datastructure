package K_Dynanic.B_1DP.tester;

import K_Dynanic.B_1DP.J_CoinChange;
import K_Dynanic.B_1DP.N_ClimbStairs;
import K_Dynanic.B_1DP.O_HouseRobbers;

import java.util.Arrays;

public class OneDpTester {

    public static void main(String[] args){
        // CoinChange
        coinChange();
        System.out.println();
        System.out.println("--------------------");

        climbStairs();
        System.out.println();
        System.out.println("--------------------");

        houseRobbers();
        System.out.println();
        System.out.println("--------------------");

    }

    private static void houseRobbers() {
        int[] money = {1, 2, 3, 1};
        O_HouseRobbers houseRobbers = new O_HouseRobbers();
        System.out.println("Input Array is "+ Arrays.toString(money));
        System.out.print("Max Amount Robbed = " + houseRobbers.totalSumInRobber(money));
    }

    private static void climbStairs() {
        N_ClimbStairs climbStairs = new N_ClimbStairs();
        System.out.print("ClimbStairs of 3 is = " + climbStairs.climStepsCombination(3));
    }

    private static void coinChange() {
        J_CoinChange coinChange = new J_CoinChange();
        int[] coins = {1, 2, 5};
        System.out.println("Input Array is "+ Arrays.toString(coins));
        System.out.print(coinChange.coinChange(coins, 11));
    }



}
