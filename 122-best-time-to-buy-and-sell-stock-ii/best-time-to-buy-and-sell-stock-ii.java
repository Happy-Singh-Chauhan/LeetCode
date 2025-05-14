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
        int[][] dp=new int[n+1][2];
        dp[n][0]=0;
        dp[n][1]=0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                int profit=0;
                if(j == 1){
                    profit=Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);
                }
                else{
                    profit=Math.max(prices[i]+dp[i+1][1],dp[i+1][0]);
                }
               dp[i][j]=profit;
            }
        }
        return dp[0][1];
    }
}