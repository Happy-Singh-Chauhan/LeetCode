class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1)return 1;
        int ans=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                count++;
            }
            else{
                ans=Math.max(ans,count);
                count=1;
            }
            ans=Math.max(ans,count);
        }
        int count1=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])count1++;
            else{
                ans=Math.max(ans,count1);
                count1=1;
            }
            ans=Math.max(ans,count1);
        }
        return ans;
    }
}