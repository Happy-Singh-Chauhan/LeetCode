class Solution {
    public int f(int index,int[] nums,int[] dp){
        if(index < 0)return 0;
        if(index == 0)return nums[index];
        if(dp[index] != -1)return dp[index];

        int pick=nums[index]+f(index-2,nums,dp);
        int nonpick=0+f(index-1,nums,dp);

        return dp[index]=Math.max(pick,nonpick);
    }
    public int rob(int[] nums) {
        if(nums.length == 1)return nums[0];
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        f(n-1,nums,dp);
        return dp[n-1];
    }
}