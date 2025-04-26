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
                int nt=prev[j];
                int t=Integer.MAX_VALUE;
                if(coins[i] <= j){
                    t=1+prev[j-coins[i]];
                }
                prev[j]=Math.min(nt,t);
            }
        }
        int ans=prev[amount];
        return(ans >= (int)1e8)? -1:ans;
    }
}