class Solution {
    public int maxProfit(int k, int[] prices) {
     int n=prices.length;
        int[][] after=new int[2][k+1];
        int[][] curr=new int[2][k+1];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                for(int k1=1;k1<=k;k1++){
                    int maxProfit=0;
                    if(j == 1){
                        curr[j][k1]=Math.max(-prices[i]+after[0][k1],after[1][k1]);
                    }
                    else{
                        curr[j][k1]=Math.max(prices[i]+after[1][k1-1],after[0][k1]);
                    }
                }
            }
            for(int l=0;l<=1;l++){
                for(int m=0;m<=k;m++){
                    after[l][m]=curr[l][m];
                }
            }
        }
        return after[1][k];
    }
}
