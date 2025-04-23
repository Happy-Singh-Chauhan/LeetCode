class Solution {
    public int helper(int[] nums,int target,int index,int sum){
        if(index >= nums.length)return sum == target ? 1:0;
        int subtract=helper(nums,target,index+1,sum-nums[index]);
        int add=helper(nums,target,index+1,sum+nums[index]);
        return add+subtract;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
}