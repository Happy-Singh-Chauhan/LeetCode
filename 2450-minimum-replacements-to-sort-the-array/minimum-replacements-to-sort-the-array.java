class Solution {
    public long minimumReplacement(int[] nums) {
        long ans=0;
        int prev=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(prev >= nums[i]){
                prev=nums[i];
            }
            else{
                int parts=(int)(Math.ceil((double)nums[i]/prev)-1);
                ans+=parts;
                prev=Math.min(prev,nums[i]/(parts+1));
            }
        }
        return ans;
    }
}