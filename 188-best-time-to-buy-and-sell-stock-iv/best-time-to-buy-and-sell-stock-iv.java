class Solution {
    public int f(int[] prices,int index,int buy,int transaction,int[][][] dp){
        if(index == prices.length || transaction == 0)return 0;
        if(dp[index][buy][transaction] != -1)return dp[index][buy][transaction];
        if(buy == 1){
            return dp[index][buy][transaction]=Math.max(-prices[index]+f(prices,index+1,0,transaction,dp),f(prices,index+1,1,transaction,dp));
        }
        return dp[index][buy][transaction]=Math.max(prices[index]+f(prices,index+1,1,transaction-1,dp),f(prices,index+1,0,transaction,dp));
    }
    public int maxProfit(int k, int[] prices) {
      int n=prices.length;
      int[][][] dp=new int[n][2][2*k];
        for(int[][] row:dp){
            for(int[] col:row)Arrays.fill(col,-1);
        }
        return f(prices,0,1,k,dp);
    }
}