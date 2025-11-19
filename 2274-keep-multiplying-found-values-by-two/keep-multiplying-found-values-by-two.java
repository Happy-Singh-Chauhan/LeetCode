class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int num:nums){
            if(num == original){
                original=findFinalValue(nums,original*2);
            }
        }
        return original;
    }
}