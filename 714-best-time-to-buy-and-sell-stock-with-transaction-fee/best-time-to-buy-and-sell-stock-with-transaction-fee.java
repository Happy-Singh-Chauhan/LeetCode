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
        int[][] dp=new int[n+1][2];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                if(j == 1){
                    dp[i][j]=Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);
                }
                else{
                    dp[i][j]=Math.max(prices[i]-fee+dp[i+1][1],dp[i+1][0]);
                }
            }
        }
        return dp[0][1];
    }
}