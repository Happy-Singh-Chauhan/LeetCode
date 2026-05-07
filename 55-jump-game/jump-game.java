class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n == 1)return true;
        int count=1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] >= count){
                count=1;
                continue;
            }
            else{
                count++;
            }
        }
        return (nums[0] >= count)? true:false;
    }
}