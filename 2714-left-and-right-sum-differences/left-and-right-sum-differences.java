class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int rsum=sum;
        int lsum=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            rsum-=nums[i];
            ans[i]=Math.abs(lsum-rsum);
            lsum+=nums[i];
        }
        return ans;
    }
}