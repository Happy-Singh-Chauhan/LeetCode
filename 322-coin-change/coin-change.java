class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] prev=new int[amount+1];
        int[] curr=new int[amount+1];
        for(int i=0;i<=amount;i++){
            if(i % coins[0] == 0)prev[i]=i/coins[0];
            else prev[i]=(int)1e8;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=amount;j++){
                 int np=prev[j];
                 int p=Integer.MAX_VALUE;
                 if(coins[i] <= j){
                p=1+curr[j-coins[i]];
                }
            curr[j]=Math.min(np,p);
            }
            for(int k=0;k<prev.length;k++){
                prev[k]=curr[k];
            }
        }
        int ans=prev[amount];
        if(ans >= 1e8)return -1;
        return ans;
    }
}