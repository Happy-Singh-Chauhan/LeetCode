class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k > 0){
            int min=Arrays.stream(nums).min().getAsInt();
            for(int i=0;i<nums.length;i++){
                if(nums[i] == min){
                    nums[i]=nums[i]*multiplier;
                    break;
                }
            }
            k--;
        }
        return nums;
    }
}