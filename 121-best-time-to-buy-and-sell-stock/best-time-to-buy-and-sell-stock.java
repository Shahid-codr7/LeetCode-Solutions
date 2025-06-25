class Solution {
    public int maxProfit(int[] prices) 
    {
        // using Kadane's Algorithm (modified)
        /** Every day is a selling day starting from index 1 
        and we will see the minimum price in the previous subarray 
        and pick the minimum which will be the 'BestBuy'.**/

        int i,j,n=prices.length;
        int Maxprofit=0, BestBuy=prices[0];
        for(i=1;i<n;i++)
        {
            if(prices[i]-BestBuy > Maxprofit)
            {
                Maxprofit=prices[i]-BestBuy;
            }
            else if(prices[i] < BestBuy)
            {
                BestBuy = prices[i];
            }
            
        }
        return Maxprofit;
    }
}