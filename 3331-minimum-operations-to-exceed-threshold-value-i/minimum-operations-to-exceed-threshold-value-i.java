class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= k)return i;
        }
        return -1;
    }
}