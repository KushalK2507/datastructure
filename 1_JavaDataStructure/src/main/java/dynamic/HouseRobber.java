package dynamic;

public class HouseRobber {


    public static void main(String[] args) {

    }

//    Input: nums = [1,2,3,1]
//    Output: 4
//    Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//    Total amount you can rob = 1 + 3 = 4.

    public int rob(int[] nums) {

        int prev1 = 0;
        int prev2 = 0;

        // arr = [prev1,prev2,num,num+1]
        //In below when we are considering prev2 we cannot consider num
        // hence prev1+num and then doing iteration to get the max

        for (int num : nums) {
            int dp = Math.max(num + prev1, prev2);
            prev1 = prev2;
            prev2 = dp;
        }

        return prev2;

    }
}
