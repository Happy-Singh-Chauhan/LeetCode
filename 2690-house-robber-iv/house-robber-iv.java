class Solution {
    public int minCapability(int[] nums, int k) {
        int left=1;
        int right=0;
        for(int num:nums){
            right=Math.max(right,num);
        }
        while(left < right){
            int mid=(left+right)/2;
            int ways=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] <= mid){
                    ways++;
                    i++;
                }
            }
            if(ways >= k)right=mid;
            else left=mid+1;
        }
        return left;
    }
}