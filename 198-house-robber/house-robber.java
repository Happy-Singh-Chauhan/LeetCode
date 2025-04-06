class Solution {
    public int rob(int[] nums) {
       int n=nums.length;
       int curr=0;
       int prev=nums[0];
       int prev2=0;

       for(int i=1;i<n;i++){
        int pick=nums[i];
        if(i > 1)pick+=prev2;
        int nonpick=prev;
        curr=Math.max(pick,nonpick);
        prev2=prev;
        prev=curr;
       } 
       return prev;
    }
}