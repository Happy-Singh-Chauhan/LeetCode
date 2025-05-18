class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] after=new int[5];
        int[] curr=new int[5];

        for(int i=n-1;i>=0;i--){
            for(int j=3;j>=0;j--){
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