class Solution {
    public boolean canSortArray(int[] nums) {
        int i=0;
        while(i<nums.length-1){
            if(nums[i] > nums[i+1] && Integer.bitCount(nums[i]) == Integer.bitCount(nums[i+1])){
                int k=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=k;
                i=0;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length-1;j++){
            if(nums[j] > nums[j+1]){
                return false;
            }
        }
        return true;
    }
}