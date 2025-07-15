package P_dynamic.B_1DP;

public class C_ClimbStairs {

    int noOfStairs;
    public C_ClimbStairs(int noOfStairs){
        this.noOfStairs = noOfStairs;
    }

    public int climbStairs(){

        if (noOfStairs<=2){
            return noOfStairs;
        }

        int x=1,y=2;
        for (int k=2;k<noOfStairs;k++){
            int temp = x;
            x=y;
            y=temp+y;
        }

        return y;
    }
}
