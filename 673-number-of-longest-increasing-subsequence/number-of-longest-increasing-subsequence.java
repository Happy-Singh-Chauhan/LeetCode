class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int[] cnt=new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(cnt,1);
        int max=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i] && 1+dp[j] > dp[i]){
                    dp[i]=1+dp[j];
                    cnt[i]=cnt[j];
                }
                else if(nums[j] < nums[i] && 1+dp[j] == dp[i]){
                    cnt[i]+=cnt[j];
                }
            }
            max=Math.max(max,dp[i]);
        }
        int nos=0;
        for(int i=0;i<n;i++){
            if(dp[i] == max)nos+=cnt[i];
        }
        return nos;
    }
}