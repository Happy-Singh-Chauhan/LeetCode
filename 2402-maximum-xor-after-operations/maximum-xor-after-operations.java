class Solution {
    public int maximumXOR(int[] nums) {
        int ans=nums[0];
        for(int n:nums){
            ans|=n;
        }
        return ans;
    }
}