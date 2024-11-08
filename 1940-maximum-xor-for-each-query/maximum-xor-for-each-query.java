class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n=nums.length;
        int[] arr=new int[n];
        int x=0;
        int k=(1<<maximumBit)-1;
        for(int num:nums){
            x^=num;
        }
        for(int i=0;i<n;i++){
            arr[i]=x^k;
            x^=nums[n-i-1];
        }
        return arr;
    }
}