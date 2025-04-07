class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)return nums[0];
        if(nums.length == 2)return Math.max(nums[0],nums[1]);
       int n=nums.length;
       int[] dp=new int[n];
       Arrays.fill(dp,-1);
       dp[0]=nums[0];
       for(int i=1;i<n-1;i++){
        int pick=nums[i];
        if( i > 1)pick+=dp[i-2];
        int skip=dp[i-1];
        dp[i]=Math.max(pick,skip);
       }
       int ans1=dp[n-2];
       Arrays.fill(dp,-1);
       dp[1]=nums[1];
       for(int i=2;i<n;i++){
        int pick=nums[i];
        if(i > 2)pick+=dp[i-2];
        int skip=dp[i-1];
        dp[i]=Math.max(pick,skip);
       }
       int ans2=dp[n-1];
       return Math.max(ans1,ans2);
    }
}