class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        L = 0
        max_profit = 0
        for R in range(1, len(prices)):
            profit = prices[R] - prices[L]
            if profit <= 0:
                profit = 0
                L = R
            else:
                max_profit = max(max_profit, profit)

        return max_profit