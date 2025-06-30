class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                min=Math.min(nums[i],nums[j]);
                max=Math.max(nums[i],nums[j]);
                if(nums[j] - nums[i] == 1){
                    count=Math.max(count,j-i+1);
                }
                else if(nums[j] - nums[i] < 1){
                    if(max != min){
                        count=Math.max(count,j-i+1);
                    }
                }
                else break;
            }
        }
        return count;
    }
}