class Solution {
    public int longestOnes(int[] nums, int k) {
      int left=0;
      int zero=0;
      int maxLength=0;
      for(int right=0;right<nums.length;right++){
        if(nums[right] == 0)zero++;
        while(zero > k){
            if(nums[left] == 0)zero--;
            left++;
        }
        maxLength=Math.max(maxLength,right-left+1);
        }  
        return maxLength;
    }
}