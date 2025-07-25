class Solution {
    public int maxSum(int[] nums) {
        int maxVal=Integer.MIN_VALUE;
        int ans=0;
        for(int num:nums){
            maxVal=Math.max(maxVal,num);
        }
        if(maxVal < 0)return maxVal;
        int[] freq=new int[101];
        for(int num:nums){
            if(num > 0 && freq[num] == 0){
            ans+=num;
            freq[num]++;
            }
        }
        return ans;
    }
}