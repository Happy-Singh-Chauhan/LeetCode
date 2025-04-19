class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int num:nums)total+=num;
        if(total % 2 == 1)return false;
        int target=total/2;
        boolean[] dp=new boolean[target + 1];
        dp[0]=true;
        for(int num:nums){
            for(int j=target;j>=num;j--){
                dp[j]=dp[j] | dp[j-num];
            }
            if(dp[target])return true;
        }
        return dp[target];
    }
}