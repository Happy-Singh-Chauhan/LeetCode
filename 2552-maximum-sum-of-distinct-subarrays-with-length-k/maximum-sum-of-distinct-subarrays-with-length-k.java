class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long currSum=0;
        long ans=0;
        int start=0;
        int end=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(end < nums.length){
            int currNum=nums[end];
            int last=map.getOrDefault(currNum,-1);

            while(start <= last || end-start+1 > k){
                currSum-=nums[start];
                start++;
            }
            map.put(currNum,end);
            currSum+=nums[end];
            if(end-start+1 == k){
                ans=Math.max(ans,currSum);
            }
            end++;
        }
        return ans;
    }
}