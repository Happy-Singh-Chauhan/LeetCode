class Solution {
    public int maximumDifference(int[] nums) {
        int current=nums[0];
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<current){
                current=nums[i];
            }
            if(nums[i]-current>max){
                max=nums[i]-current;
            }
        }
        if(max == 0) return -1;
        return max;
    }
}