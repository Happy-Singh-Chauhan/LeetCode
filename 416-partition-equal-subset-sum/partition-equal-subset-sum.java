class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int num:nums)sum+=num;
        if(sum % 2 == 1)return false;
        int target=sum/2;
        boolean[][] dp=new boolean[n][target+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        dp[0][0]=true;
        for(int i=1;i<n;i++){
            for(int j=1;j<=target;j++){
                boolean notTake=dp[i-1][j];
                boolean take=false;
                if(nums[i] <= j){
                    take=dp[i-1][j-nums[i]];
                }
                dp[i][j]=take | notTake;
            }
        }
        return dp[n-1][target];
    }
}