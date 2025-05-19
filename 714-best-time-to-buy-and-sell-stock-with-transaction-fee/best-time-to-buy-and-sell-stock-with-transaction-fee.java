class Solution {
    public int f(int[] prices,int index,int buy,int fee,int[][] dp){
        if(index == prices.length)return 0;
        if(dp[index][buy] != -1)return dp[index][buy];
        if(buy == 1){
            return dp[index][buy]=Math.max(-prices[index]+f(prices,index+1,0,fee,dp),f(prices,index+1,1,fee,dp));
        }
        return dp[index][buy]=Math.max(prices[index]-fee+f(prices,index+1,1,fee,dp),f(prices,index+1,0,fee,dp));
    }
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] row:dp)Arrays.fill(row,-1);
        return f(prices,0,1,fee,dp);
    }
}