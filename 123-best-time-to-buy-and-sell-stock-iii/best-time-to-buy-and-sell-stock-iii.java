class Solution {
    public int f(int[] prices,int index,int transaction,int[][] dp){
        if(index == prices.length || transaction == 4)return 0;
        if(dp[index][transaction] != -1)return dp[index][transaction];
        if(transaction % 2 == 0){
            return dp[index][transaction]=Math.max(-prices[index]+f(prices,index+1,transaction+1,dp),f(prices,index+1,transaction,dp));
        }
        return dp[index][transaction]=Math.max(prices[index]+f(prices,index+1,transaction+1,dp),f(prices,index+1,transaction,dp));
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][4];
        for(int[] row:dp)Arrays.fill(row,-1);
        return f(prices,0,0,dp);
    }
}