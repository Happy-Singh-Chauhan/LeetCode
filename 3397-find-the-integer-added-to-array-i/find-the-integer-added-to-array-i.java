class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1=0;
        int sum2=0;
        for(int n:nums1){
            sum1+=n;
        }
        for(int m:nums2){
            sum2+=m;
        }
        int ans=(sum2-sum1)/nums1.length;
        return ans;
    }
}