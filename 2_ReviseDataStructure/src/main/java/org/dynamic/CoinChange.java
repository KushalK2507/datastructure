package org.dynamic;

public class CoinChange {

    public static void main(String[] args) {
        int[] arr= {2};
        int amount =3;
        System.out.print("Coin Change = "+coinChange(arr,amount,arr.length));

    }

    private static int coinChange(int[] arr,int amount,int n){

        if (amount==0){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]<=amount){
                int resSub = coinChange(arr,amount-arr[i],n);
                if (resSub != Integer.MAX_VALUE && resSub+1<res){
                    res=resSub+1;
                }
            }
        }
        return res;



    }
}
