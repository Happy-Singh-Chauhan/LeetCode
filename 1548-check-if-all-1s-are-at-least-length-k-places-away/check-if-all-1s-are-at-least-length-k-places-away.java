class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=nums.length;
        int i=-1;
        for(int j=0;j<n;j++){
            if(nums[j] == 1){
                if(i >= 0 && i != j && j-i <= k)return false;
                i=j;
            }
        }
        return true;
    }
}