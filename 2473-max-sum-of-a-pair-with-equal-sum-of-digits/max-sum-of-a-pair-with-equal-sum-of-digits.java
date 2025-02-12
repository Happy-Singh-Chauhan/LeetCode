class Solution {
    public int digits(int num){
        int sum=0;
        while(num > 0){
            sum+=num % 10;
            num/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int[] arr=new int[90];
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int digitSum=digits(nums[i]);
            if(arr[digitSum] != 0){
                ans=Math.max(ans,arr[digitSum]+nums[i]);
            }
            arr[digitSum]=Math.max(arr[digitSum],nums[i]);
        }
        return ans;
    }
}