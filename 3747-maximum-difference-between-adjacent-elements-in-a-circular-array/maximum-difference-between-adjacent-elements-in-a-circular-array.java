class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            max=Math.max(max,Math.abs(nums[i] - nums[i-1]));
        }
        max=Math.max(max,Math.abs(nums[0] - nums[n-1]));
        return max;
    }
}