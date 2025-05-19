class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int[] after=new int[2];
        int[] curr=new int[2];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                if(j == 1){
                    curr[j]=Math.max(-prices[i]+after[0],after[1]);
                }
                else{
                    curr[j]=Math.max(prices[i]-fee+after[1],after[0]);
                }
            }
            after=curr;
        }
        return after[1];
    }
}