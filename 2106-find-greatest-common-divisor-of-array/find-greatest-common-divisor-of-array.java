class Solution {
    public int findGCD(int[] nums) {
       Arrays.sort(nums);
       int a=nums[0];
       int b=nums[nums.length-1];
       while(a != b){
        if(a > b){
            a-=b;
        }
        else b-=a;
       } 
       return b;
    }
}