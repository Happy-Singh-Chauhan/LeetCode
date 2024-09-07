class Solution {
    static boolean check(int num){
        for(int i=2;i<num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int ans1=0;
        int ans2=0;
        for(int i=0;i<nums.length;i++){
            if(check(nums[i]) && nums[i] != 1){
                ans1=i;
                break;
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(check(nums[j]) && nums[j] != 1){
                ans2=j;
                break;
            }
        }
        return ans2-ans1;
    }
}