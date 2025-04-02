class Solution {
    public long maximumTripletValue(int[] nums) {
        long res=0;
        long imax=0;
        long dmax=0;
        for(int num:nums){
            res=Math.max(res,dmax*num);
            dmax=Math.max(dmax,imax-num);
            imax=Math.max(imax,num);
        }
        return res;
    }
}