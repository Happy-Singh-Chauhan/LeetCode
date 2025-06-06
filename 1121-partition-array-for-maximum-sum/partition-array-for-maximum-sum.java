class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
       int n=arr.length;
       int[] dp=new int[n+1];
       for(int i=n-1;i>=0;i--){
        int len=0;
        int maxSum=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for(int j=i;j<Math.min(n,i+k);j++){
            len++;
            max=Math.max(max,arr[j]);
            int sum=len*max + dp[j+1];
            maxSum=Math.max(maxSum,sum);
        }
        dp[i]=maxSum;
       }
       return dp[0]; 
    }
}