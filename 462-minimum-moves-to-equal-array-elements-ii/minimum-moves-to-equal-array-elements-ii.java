class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int median=0;
        int ans=0;
        if(n % 2 == 0){
            median=(nums[n/2-1]+nums[n/2])/2;
        }
        else median =nums[n/2];
        for(int num:nums){
            ans+=Math.abs(num-median);
        }
        return ans;
    }
}