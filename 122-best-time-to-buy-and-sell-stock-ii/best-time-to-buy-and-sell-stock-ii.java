class Solution {
    public int maxProfit(int[] prices) 
    {
        // buy is the minimum cost to buy
        // modified kadane's algorithm
        int profit = 0;
        int buy = prices[0];
        int n = prices.length;
        for(int i=1;i<n;i++) 
        {
            if(buy < prices[i]) 
                profit += prices[i] - buy;
            buy = prices[i];
        }
        return profit;
    }
}