class Solution {
    public int f(int[] coins,int amount,int index,int[][] dp){
        if(index == 0){
            if(amount % coins[0] == 0){
                return amount/coins[0];
            }
            return (int)1e8;
        }
        if(dp[index][amount] != -1)return dp[index][amount];
        int np=f(coins,amount,index-1,dp);
        int p=Integer.MAX_VALUE;
        if(coins[index] <= amount){
            p=1+f(coins,amount-coins[index],index,dp);
        }
        return dp[index][amount]=Math.min(np,p);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=f(coins,amount,n-1,dp);
        if(ans >= 1e8)return -1;
        return ans;
    }
}