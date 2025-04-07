class Solution {
    public int f(int index,int[] nums,int[] dp){
        if(index < 1)return 0;
        if(index == 1)return nums[index];
        if(dp[index] != -1)return dp[index];
        int pick=nums[index]+f(index-2,nums,dp);
        int nonpick=f(index-1,nums,dp);
        return dp[index]=Math.max(pick,nonpick);
    }
    public int rob(int[] nums) {
        if(nums.length == 1)return nums[0];
        if(nums.length == 2)return Math.max(nums[0],nums[1]);
      int n=nums.length;
      int[] dp=new int[n];
      Arrays.fill(dp,-1);
      f(n-1,nums,dp);
      int ans1=dp[n-1];  

      Arrays.fill(dp,-1);
     dp[0]=nums[0];
     for(int i=1;i<n-1;i++){
        int pick=nums[i];
        if(i>1)pick+=dp[i-2];
        int nonpick=dp[i-1];
        dp[i]=Math.max(pick,nonpick);
     }
     int ans2=dp[n-2];
     return Math.max(ans1,ans2);
    }
}