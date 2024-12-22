class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        int ans=0;
        int last=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int min=nums[i]-k;
            int max=nums[i]+k;
            if(last < min){
                last=min;
                ans++;
            }
            else if(last < max){
                last++;
                ans++;
            }
        }
        return ans;
    }
}