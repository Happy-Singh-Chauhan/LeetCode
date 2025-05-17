class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] after=new int[2][3];
        int[][] curr=new int[2][3];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                for(int k=1;k<=2;k++){
                    int maxProfit=0;
                    if(j == 1){
                        curr[j][k]=Math.max(-prices[i]+after[0][k],after[1][k]);
                    }
                    else{
                        curr[j][k]=Math.max(prices[i]+after[1][k-1],after[0][k]);
                    }
                }
            }
            for(int l=0;l<=1;l++){
                for(int m=0;m<=2;m++){
                    after[l][m]=curr[l][m];
                }
            }
        }
        return after[1][2];
    }
}