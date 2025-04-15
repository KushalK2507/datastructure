package C_arrays;

public class BuyAndSellMaxProfit {

    int[] arr;
    public int maxProfit;

    public BuyAndSellMaxProfit(int[] arr){
        this.arr = arr;
        this.maxProfit = 0;
    }

    public void maxProfit1(){
        int buy = arr[0];
        for (int i=1;i<arr.length;i++){

            if (buy > arr[i]){
                buy = arr[i];
            }
            if (maxProfit < arr[i] - buy){
                maxProfit = arr[i] - buy;
            }
        }
    }

    public void maxProfit2(){

        for (int i=0;i<arr.length-1;i++){
            if (arr[i] < arr[i+1]){
                maxProfit = maxProfit+ arr[i+1]-arr[i];
            }
        }
    }

}
