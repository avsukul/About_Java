package leetcode;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices = {1,2,3,4,5};
        int m = maxProfit(prices);
        System.out.println(m);
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < prices.length; i++) {

            // Checking for lower buy value
            if (buy > prices[i])
                buy = prices[i];

                // Checking for higher profit
            else if (prices[i] - buy > max_profit)
                max_profit = prices[i] - buy;
        }
        return max_profit;
    }
}