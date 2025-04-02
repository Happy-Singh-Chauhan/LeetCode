class Solution {
    public long maximumTripletValue(int[] nums) {
        long max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    long num=(long)(nums[i]-nums[j])*nums[k];
                    max=Math.max(max,num);
                }
            }
        }
        if(max <= 0)return 0;
        return max;
    }
}