class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)return nums[0];
        
       
       int n=nums.length;
       int[] dp=new int[n];
       Arrays.fill(dp,-1);
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
       Arrays.fill(dp,-1);
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