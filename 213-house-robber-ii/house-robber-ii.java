class Solution {
    public int f(int start,int end,int[] nums){
        int j=start;
        int curr=0;
        int prev=nums[start];
        int prev2=0;
        for(int i=start+1;i<=end;i++){
            int pick=nums[i];
            if(i > j+1)pick+=prev2;
            int skip=prev;
            curr=Math.max(pick,skip);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        if(nums.length == 1)return nums[0];
        if(nums.length == 2)return Math.max(nums[0],nums[1]);
        int n=nums.length;
        return Math.max(f(0,n-2,nums),f(1,n-1,nums));
    }
}