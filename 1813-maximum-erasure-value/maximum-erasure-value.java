class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int[] freq=new int[100001];
        int left=0;
        int maxSum=0;
        int currSum=0;
        for(int right=0;right<n;right++){
            int num=nums[right];
            while(freq[num] > 0){
                currSum-=nums[left];
                freq[nums[left]]--;
                left++;
            }
            freq[num]++;
            currSum+=num;
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}