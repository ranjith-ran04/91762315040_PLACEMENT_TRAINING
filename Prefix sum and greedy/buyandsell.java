class Solution {
    public int maxProfit(int[] prices) {
        int mincost=Integer.MAX_VALUE;
        int maxprofit=0,i=0;
        while(i<prices.length){
            if(prices[i]<mincost){
                mincost=prices[i];
            }
            if(prices[i]!=mincost){
                int profit=prices[i]-mincost;
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            }
            i++;
        }
        return maxprofit;
    }
}