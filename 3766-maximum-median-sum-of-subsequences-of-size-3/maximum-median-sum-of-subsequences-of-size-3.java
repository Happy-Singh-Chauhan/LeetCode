class Solution {
    public long maximumMedianSum(int[] nums) {
       long ans=0;
       Arrays.sort(nums);
       int n=nums.length;
       int i=0;
       int j=n-2;
       while(i < j){
        ans+=nums[j];
        i++;
        j-=2;
       } 
       return ans;
    }
}