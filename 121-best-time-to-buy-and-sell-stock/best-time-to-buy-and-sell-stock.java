class Solution {
    public int maxProfit(int[] prices) 
    {
        int i, l=prices.length;

        int maxProfit=0;
        int BestBuy=prices[0];

        for(i=1;i<l;i++)
        {
            
            if(prices[i]-BestBuy > 0)
            {
                maxProfit=Math.max(maxProfit, prices[i]-BestBuy);
            }
            BestBuy = Math.min(prices[i], BestBuy);
        }

        return maxProfit;
    }
}