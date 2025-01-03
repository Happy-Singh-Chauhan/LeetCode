class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long leftSum=0;
        long rightSum=0;
        for(int num:nums){
            rightSum+=num;
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            leftSum+=nums[i];
            rightSum-=nums[i];
            if(leftSum >= rightSum){
                count++;
            }
        }
        return count;
    }
}