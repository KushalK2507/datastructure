package array;

public class BestTimeToBuySell {

    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {

            if (buy > prices[i]) {
                buy = prices[i];
            } else if (prices[i] - buy > maxProfit) {
                maxProfit = prices[i] - buy;
            }

        }

        return maxProfit;
    }
}
