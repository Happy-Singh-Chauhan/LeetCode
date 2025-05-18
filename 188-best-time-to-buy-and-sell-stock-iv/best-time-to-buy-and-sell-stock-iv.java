class Solution {
    public int maxProfit(int k, int[] prices) {
     int n=prices.length;
        int[] after=new int[2*k+1];
        int[] curr=new int[2*k+1];

        for(int i=n-1;i>=0;i--){
            for(int j=2*k-1;j>=0;j--){
                if(j % 2 == 0){
                    curr[j]=Math.max(-prices[i]+after[j+1],after[j]);
                }
                else{
                    curr[j]=Math.max(prices[i]+after[j+1],after[j]);
                }
            }
            after=curr;
        }
        return after[0];
    }
}
