package dynamic;

public class ClimbStair {

//    Input: n = 2
//    Output: 2
//    Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//    Example 2:
//
//    Input: n = 3
//    Output: 3
//    Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step


    public int climbStairs(int n) {

        if(n<=2){
            return n;
        }

        int x=1,y=2;

        for(int i=2;i<n;i++){
            int temp = x;
            x=y;
            y =temp+y;
        }

        return y;



    }
}
