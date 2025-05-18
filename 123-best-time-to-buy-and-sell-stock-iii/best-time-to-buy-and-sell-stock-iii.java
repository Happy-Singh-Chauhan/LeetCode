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
        int[][] dp=new int[n+1][5];

        for(int i=n-1;i>=0;i--){
            for(int j=3;j>=0;j--){
                if(j % 2 == 0){
                    dp[i][j]=Math.max(-prices[i]+dp[i+1][j+1],dp[i+1][j]);
                }
                else{
                    dp[i][j]=Math.max(prices[i]+dp[i+1][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
}