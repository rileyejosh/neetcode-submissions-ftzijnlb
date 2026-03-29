class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int max = 0;
        int i = 0;

        for(int j = 1; j < prices.length; j++) {

            if(prices[i] > prices[j]) {
                i++;
                while(prices[i] > prices[j] && i != j) {
                    i++;
                }
            }
            else {
                profit = prices[j] - prices[i];
                max = Math.max(profit, max);

            }
        }

        return max;
    }
}
