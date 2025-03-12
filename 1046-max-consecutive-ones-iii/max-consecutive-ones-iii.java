class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int maxLength=0;
        while(right < nums.length){
            while(right < nums.length && nums[right] == 1)right++;
            maxLength=Math.max(maxLength,right-left+1);
            while(right < nums.length && nums[right] == 0 && k > 0){
                right++;
                k--;
            }
            maxLength=Math.max(maxLength,right-left+1);
            if(right < nums.length && nums[right] == 0 && k == 0){
                while(nums[left] == 1)left++;
                if(nums[left] == 0 ){
                    k++;
                    left++;
                }
            }
        }
        return maxLength-1;
    }
}