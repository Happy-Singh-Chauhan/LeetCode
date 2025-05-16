class Solution {
    public int f(int[] prices,int buy,int allowed,int index,int[][][] dp){
        if(index == prices.length)return 0;
        if(allowed == 0)return 0;
        if(dp[index][buy][allowed] != -1)return dp[index][buy][allowed];
        int maxProfit=0;
        if(buy == 1){
            maxProfit=Math.max(-prices[index]+f(prices,0,allowed,index+1,dp),f(prices,1,allowed,index+1,dp));
        }
        else{
            maxProfit=Math.max(prices[index]+f(prices,1,allowed-1,index+1,dp),f(prices,0,allowed,index+1,dp));
        }
        return dp[index][buy][allowed]=maxProfit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n+1][2][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<=1;j++){
                dp[i][j][0]=0;
            }
        }
        for(int i=0;i<=1;i++){
            for(int j=0;j<=2;j++){
                dp[n][i][j]=0;
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                for(int k=0;k<=2;k++){
                    int maxProfit=0;
                    if(j == 1){
            dp[i][j][k]=Math.max(-prices[i]+dp[i+1][0][k],dp[i+1][1][k]);
        }
        else{
            if(k != 0){
            dp[i][j][k]=Math.max(prices[i]+dp[i+1][1][k-1],dp[i+1][0][k]);
            }
        }
                }
            }
        }
       return dp[0][1][2]; 
    }
}