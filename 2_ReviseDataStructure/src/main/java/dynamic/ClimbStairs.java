package dynamic;

public class ClimbStairs {

    int noOfStairs;
    public ClimbStairs(int noOfStairs){
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
