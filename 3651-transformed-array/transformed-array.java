class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int m=0;
            if(nums[i] > 0){
                m=(i+nums[i])%n;
                arr[i]=nums[m];
            }
            else if(nums[i] < 0){
                m=((i+nums[i])%n+n)%n;
                arr[i]=nums[m];
            }
            else arr[i]=nums[i];
        }
        return arr;
    }
}