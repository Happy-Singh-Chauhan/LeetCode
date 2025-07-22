class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int currSum=0;
        int maxSum=0;
        while(right < n){
            if(!map.containsKey(nums[right])){
                currSum+=nums[right];
                map.put(nums[right],right);
            }
            else{
                int p=map.get(nums[right]);
                while(left <= p){
                    currSum-=nums[left];
                    map.remove(nums[left]);
                    left++;
                }
                currSum+=nums[right];
                map.put(nums[right],right);
            }
            maxSum=Math.max(currSum,maxSum);
            right++;
        }
        return maxSum;
    }
}