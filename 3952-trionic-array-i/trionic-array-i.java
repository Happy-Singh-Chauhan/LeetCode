class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums[1] < nums[0])return false;
        int n=nums.length;
        boolean toggle=false;
        int count=0;
        for(int i=1;i<n;i++){
            if(!toggle && nums[i] > nums[i-1]){
                toggle = !toggle;
                count++;
            }
            else if(toggle && nums[i] < nums[i-1]){
                toggle = !toggle;
                count++;
            }
            else if(nums[i] == nums[i-1])return false;
        }
            return (toggle) && (count == 3);
    }
}