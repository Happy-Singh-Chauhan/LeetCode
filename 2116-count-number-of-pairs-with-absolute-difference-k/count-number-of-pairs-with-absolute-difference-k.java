class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int ans=nums[j]-nums[i];
                int sum=Math.abs(ans);
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}