class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length<4){
            return -1;
        }
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
            i+=3;
        }
        return nums[i];
    }
}