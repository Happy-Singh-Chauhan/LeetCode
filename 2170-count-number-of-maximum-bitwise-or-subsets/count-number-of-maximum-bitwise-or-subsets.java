class Solution {
    public int countSubsets(int[] nums, int index, int currentOr, int targetOr,int[][] dp) {
        if(index == nums.length){
            return (currentOr == targetOr)? 1:0;
        }
        if (dp[index][currentOr] != -1)return dp[index][currentOr];
        int notTake=countSubsets(nums,index+1,currentOr,targetOr,dp);
        int take=countSubsets(nums,index+1,currentOr | nums[index],targetOr,dp);
        return dp[index][currentOr]=take+notTake;
    }

    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }
        int[][] dp = new int[n][maxOr + 1];
        for(int[] row:dp){
        Arrays.fill(row,-1);
        }
        return countSubsets(nums, 0, 0, maxOr,dp);
    }
}