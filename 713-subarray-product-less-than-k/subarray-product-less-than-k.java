class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k == 0)return 0;
        int n=nums.length;
        int product=1;
        int left=0;
        int count=0;
        for(int right=0;right<n;right++){
            product*=nums[right];
            if(product < k){
                count+=right-left+1;
            }
            else{
                while(product >= k && left < right){
                    product=(int)(product/nums[left]);
                    left++;
                }
                if(product < k){
                count+=right-left+1;
                }
            }
        }
        return count;
    }
}