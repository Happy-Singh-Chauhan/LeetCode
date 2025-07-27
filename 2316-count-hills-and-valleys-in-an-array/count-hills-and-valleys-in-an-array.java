class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=1;i<n-1;i++){
            if(nums[i] == nums[i-1])continue;
            int j=i-1;
            int k=i+1;
            while(j >= 0){
                if(nums[i] != nums[j]){
                    break;
                }
                j--;
            }
            while(k < n){
                if(nums[i] != nums[k]){
                    break;
                }
                k++;
            }
            if(j >= 0 && k < n ){
            if( nums[i] < nums[j] && nums[i] < nums[k] || nums[i] > nums[j] && nums[i] > nums[k]){
            ans++;
            }
            }
        }
        return ans;
    }
}