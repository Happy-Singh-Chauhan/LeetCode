class Solution {
    public int waysToMakeFair(int[] nums) {
        int count=0;
        int odd=0;
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                even+=nums[i];
            }
            else{
                odd+=nums[i];
            }
        }
        int prev=0;
        for(int i=0;i<nums.length;i++){
            int newOdd=even-nums[i]+prev;
            int newEven=odd;
            prev=nums[i];
            if(newOdd == newEven){
                count++;
            }
            even=odd;
            odd=newOdd;
        }
        return count;
    }
}