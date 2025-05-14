class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] prev=new int[n+1];
        int[] curr=new int[n+1];
        prev[0]=0;
        prev[1]=0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                int profit=0;
                if(j == 1){
                    profit=Math.max(-prices[i]+prev[0],prev[1]);
                }
                else{
                    profit=Math.max(prices[i]+prev[1],prev[0]);
                }
               curr[j]=profit;
            }
            prev=curr;
        }
        return prev[1];
    }
}