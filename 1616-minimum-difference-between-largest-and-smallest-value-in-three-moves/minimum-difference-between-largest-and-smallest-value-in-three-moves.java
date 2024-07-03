class Solution {
    public int minDifference(int[] nums) {
        int n=nums.length;
        if(n<5){
            return 0;
        }
        Arrays.sort(nums);
        int a=nums[n-4]-nums[0];
        int b=nums[n-3]-nums[1];
        int c=nums[n-2]-nums[2];
        int d=nums[n-1]-nums[3];
        int min1=Math.min(a,b);
        int min2=Math.min(c,d);
        return Math.min(min1,min2);
    }
}