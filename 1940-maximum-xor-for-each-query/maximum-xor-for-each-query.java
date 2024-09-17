class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int x=0;
        int n=nums.length;
        int[] ans=new int[n];
        int k=(1<<maximumBit)-1;
        for(int i:nums){
            x^=i;
        }
        for(int i=0;i<n;i++){
            ans[i]=x^k;
            x^=nums[n-i-1];
        }
        return ans;
    }
}