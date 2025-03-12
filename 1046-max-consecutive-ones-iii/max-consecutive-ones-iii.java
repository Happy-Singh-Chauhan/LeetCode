class Solution {
    public int longestOnes(int[] nums, int k) {
      int left=0;
      int right=0;
      int zero=0;
      int maxLength=0;
      while(right < nums.length){
        if(nums[right] == 0)zero++;
        while(zero > k){
            if(nums[left] == 0)zero--;
            left++;
        }
        maxLength=Math.max(maxLength,right-left+1);
        right++;
        }  
        return maxLength;
    }
}