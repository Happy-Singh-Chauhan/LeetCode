class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        int partition=1;
        for(int j=0;j<n;j++){
            if(nums[j] - nums[i] > k){
                i=j;
                partition++;
            }
        }
        return partition;
    }
}