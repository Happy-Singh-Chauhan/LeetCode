class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0;
        int n=nums.length;
        int start=-1, mini=-1, maxi=-1;
        for(int i=0;i<n;i++){
            if(nums[i] > maxK || nums[i] < minK)start=i;
            if(nums[i] == minK)mini=i;
            if(nums[i] == maxK)maxi=i;
            count+=Math.max(0,Math.min(maxi,mini)-start);
        }
        return count;
    }
}