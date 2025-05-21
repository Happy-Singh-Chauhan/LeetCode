class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i]){
                dp[i]=Math.max(1+dp[j],dp[i]);
                }
            }
        }
        int max=0;
        for(int num:dp)max=Math.max(max,num);
        return max;
    }
}