package P_dynamic.B_1DP;

public class D_HouseRobbers {

    int[] arr;

    public D_HouseRobbers(int[] arr){
        this.arr = arr;
    }

    public int maxAmountRob(){

        int prev1=0;
        int prev2=0;
        for (int i=0;i<arr.length;i++){
            int dp = Math.max(arr[i]+prev1,prev2);
            prev1=prev2;
            prev2=dp;
        }

        return prev2;

    }
}
