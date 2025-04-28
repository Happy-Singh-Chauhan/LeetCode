class Solution {
    public long countSubarrays(int[] nums, long k) {
        long count=0;
        long sum=0;
        int left=0;
        int n=nums.length;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            if(sum*(right-left+1) < k){
                count+=right-left+1;
            }
            else{
                while(sum*(right-left+1) >= k){
                    sum-=nums[left];
                    left++;
                }
                count+=right-left+1;
            }
        }
        return count;
    }
}