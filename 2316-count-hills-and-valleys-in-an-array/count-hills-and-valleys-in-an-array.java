class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=1;i<n-1;i++){
            if(nums[i] == nums[i-1])continue;
            int j=i-1;
            int k=i+1;
            int temp1=0;
            int temp2=0;
            while(j >= 0){
                if(nums[i] != nums[j]){
                    temp1=nums[j];
                    break;
                }
                j--;
            }
            while(k < n){
                if(nums[i] != nums[k]){
                    temp2=nums[k];
                    break;
                }
                k++;
            }
            if(temp1 == 0 || temp2 == 0)continue;
            int[] arr=new int[2];
            if(temp1 < nums[i] && temp2 < nums[i] || temp1 > nums[i] && temp2 > nums[i]){
            ans++;
            }
        }
        return ans;
    }
}