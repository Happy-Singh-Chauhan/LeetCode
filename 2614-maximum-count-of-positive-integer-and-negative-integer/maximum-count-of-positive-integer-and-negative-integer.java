class Solution {
    public int maximumCount(int[] nums) {
        int max=0;
        int neg=0;
        int pos=0;
        for(int num:nums){
            if(num > 0)pos++;
            else if(num < 0)neg++;
        }
        max=Math.max(neg,pos);
        return max;
    }
}