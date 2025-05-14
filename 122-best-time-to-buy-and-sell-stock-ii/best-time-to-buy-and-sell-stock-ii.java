class Solution {
    public int f(int[] prices,int buy,int index,int[][] dp){
        if(index == prices.length)return 0;
        if(dp[index][buy] != -1)return dp[index][buy];
        int profit=0;
        if(buy == 1){
        profit=Math.max(-prices[index]+f(prices,0,index+1,dp),f(prices,1,index+1,dp));
        }
        else{
            profit=Math.max(+prices[index]+f(prices,1,index+1,dp),f(prices,0,index+1,dp));
        }
        return dp[index][buy]=profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int[] row:dp)Arrays.fill(row,-1);
        return f(prices,1,0,dp);
    }
}