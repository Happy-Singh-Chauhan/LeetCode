class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1=0;
        int xor2=0;
        for(int n:nums1){
            xor1^=n;
        }
        for(int n:nums2){
            xor2^=n;
        }
        if(nums2.length % 2 == 0)xor1=0;
        if(nums1.length % 2 == 0)xor2=0;
        return xor1^xor2;
    }
}