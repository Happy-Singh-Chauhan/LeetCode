class Solution {
    public int maximumCount(int[] nums) {
        int count=0;
        int count1=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i] == 0){
                continue;
            }
            if(nums[i]<0){
                count++;
            }
            else{
                count1++;
            }
        }
        int max=Integer.max(count,count1);
        return max;
    }
}