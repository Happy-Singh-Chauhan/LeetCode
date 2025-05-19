class Solution {
    public int f(int[] prices,int index,int buy,int[][] dp){
        if(index >= prices.length)return 0;
        if(dp[index][buy] != -1)return dp[index][buy];
        if(buy == 1){
            return dp[index][buy]=Math.max(-prices[index]+f(prices,index+1,0,dp),f(prices,index+1,1,dp));
        }
        return dp[index][buy]=Math.max(prices[index]+f(prices,index+2,1,dp),f(prices,index+1,0,dp));
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] row:dp)Arrays.fill(row,-1);
        return f(prices,0,1,dp);
    }
}