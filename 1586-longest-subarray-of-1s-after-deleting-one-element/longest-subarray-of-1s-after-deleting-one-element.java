class Solution {
    public int longestSubarray(int[] nums) {
       int n=nums.length;
       int count=0;
       int maxCount=0;
       int left=0;
       int k=2;
       for(int right=0;right<n;right++){
        if(nums[right] == 1)count++;
        else k--;
        while(k == 0){
            if(nums[left] == 1)count--;
            else k++;
            left++;
        }
        maxCount=Math.max(maxCount,count);
       } 
       if(maxCount == n)return maxCount-1;
       return maxCount;
    }
}