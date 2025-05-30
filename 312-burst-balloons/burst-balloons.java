class Solution {
    public int f(int i,int j,int[] coins,int[][] dp){
        if(i > j)return 0;
        if(dp[i][j] != -1)return dp[i][j];
        int max=Integer.MIN_VALUE;
        for(int ind=i;ind<=j;ind++){
            int cost=(coins[i-1]*coins[ind]*coins[j+1])+f(i,ind-1,coins,dp)+f(ind+1,j,coins,dp);
            max=Math.max(max,cost);
        }
        return dp[i][j]=max;
    }
    public int maxCoins(int[] nums) {
     int n=nums.length;
     int[] coins=new int[n+2];
     coins[0]=1;
     coins[n+1]=1;
     for(int i=0;i<n;i++){
        coins[i+1]=nums[i];
     }   
     int[][] dp=new int[n+2][n+2];
    for(int i=n;i>=1;i--){
        for(int j=1;j<=n;j++){
            if(i > j)continue;
            int max=Integer.MIN_VALUE;
        for(int ind=i;ind<=j;ind++){
            int cost=(coins[i-1]*coins[ind]*coins[j+1])+dp[i][ind-1]+dp[ind+1][j];
            max=Math.max(max,cost);
        }
        dp[i][j]=max;
        }
    }
     return dp[1][n];
    }
}