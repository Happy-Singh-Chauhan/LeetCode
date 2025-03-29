class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left=0;
        int right=0;
        int maxLength=1;
        int mask=0;
        while(right < nums.length){
            if((nums[right] & mask) == 0){
                mask|=nums[right];
                maxLength=Math.max(maxLength,right-left+1);
                right++;
            }
            else{
                mask^=nums[left];
                left++;
            }
        }
        return maxLength;
    }
}