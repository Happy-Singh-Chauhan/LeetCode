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
        int[][][] dp=new int[n][2][3];
        for(int[][] row:dp){
            for(int[] col:row)Arrays.fill(col,-1);
        }
       return f(prices,1,2,0,dp); 
    }
}