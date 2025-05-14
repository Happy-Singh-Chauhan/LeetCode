class Solution {
    public int maxProfit(int[] prices) {
        int minCost=prices[0];
        int n=prices.length;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            int cost=prices[i]-minCost;
            maxProfit=Math.max(maxProfit,cost);
            minCost=Math.min(minCost,prices[i]);
        }
        return maxProfit;
    }
}