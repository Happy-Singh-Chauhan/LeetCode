class Solution {
    public int xorBeauty(int[] nums) {
        int ans=0;
        for(int n: nums){
            ans^=n;
        }
        return ans;
    }
}