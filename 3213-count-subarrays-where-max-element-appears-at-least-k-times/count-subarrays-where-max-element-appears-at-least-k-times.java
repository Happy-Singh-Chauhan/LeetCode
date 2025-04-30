class Solution {
    public long countSubarrays(int[] nums, int k) {
        long count=0;
        int n=nums.length;
        int left=0;
        int max=Integer.MIN_VALUE;
        for(int num:nums)max=Math.max(max,num);
        for(int right=0;right<n;right++){
            if(nums[right] == max)k--;
            while(k == 0){
                count++;
                count+=n-1-right;
                while(nums[left] != max){
                    count++;
                    count+=n-1-right;
                    left++;
                }
                if(nums[left] == max){
                    k++;
                    left++;
                }
            }
        }
        return count;
    }
}