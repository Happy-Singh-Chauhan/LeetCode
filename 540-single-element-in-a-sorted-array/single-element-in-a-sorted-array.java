class Solution {
    public int singleNonDuplicate(int[] nums) {
        int unique=0;
        for(int n:nums){
            unique^=n;
        }
        return unique;
    }
}