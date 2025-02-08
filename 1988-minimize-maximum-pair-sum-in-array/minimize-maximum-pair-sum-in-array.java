class Solution {
    public int minPairSum(int[] nums) {
       Arrays.sort(nums);
       int start=0;
       int end=nums.length-1;
       int max=0;
       while(start < end){
        int sum=nums[start]+nums[end];
        max=Math.max(max,sum);
        start++;
        end--;
       } 
       return max;
    }
}