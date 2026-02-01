class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        if(n == 3)return nums[0]+nums[1]+nums[2];
        int ans=nums[0];
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(nums[i] < min1){
                min2=min1;
                min1=nums[i];
            }
            else if(nums[i] < min2){
                min2=nums[i];
            }
        }
        return ans+min1+min2;
    }
}