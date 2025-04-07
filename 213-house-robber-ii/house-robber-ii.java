class Solution {
    public int rob(int[] nums) {
       int n=nums.length;
        if(nums.length == 1)return nums[0];
        if(nums.length == 2)return Math.max(nums[0],nums[1]);

       int curr=0;
       int prev=nums[0];
       int prev2=0;

       for(int i=1;i<n-1;i++){
        int pick=nums[i];
        if( i > 1)pick+=prev2;
        int skip=prev;
        curr=Math.max(pick,skip);
        prev2=prev;
        prev=curr;
       }
       int ans1=prev;

       prev=nums[1];
       prev2=0;
       curr=0;

       for(int i=2;i<n;i++){
        int pick=nums[i];
        if(i > 2)pick+=prev2;
        int skip=prev;
        curr=Math.max(pick,skip);
        prev2=prev;
        prev=curr;
       }
       int ans2=prev;

       return Math.max(ans1,ans2);
    }
}