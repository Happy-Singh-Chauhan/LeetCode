class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left=0,right=0,maxLength=0,mask=0;

        while(right < nums.length){
            if((mask & nums[right]) == 0){
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