class Solution {
    public int minOperations(int[] nums, int k) {
        for(int n:nums){
            k^=n;
        }
        return Integer.bitCount(k);
    }
}