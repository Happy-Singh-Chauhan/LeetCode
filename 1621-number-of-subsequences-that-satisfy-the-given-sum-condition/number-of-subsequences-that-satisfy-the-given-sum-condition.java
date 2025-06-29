class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod=(int)1e9+7;
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);

        int[] pow=new int[n];
        pow[0]=1;
        for(int i=1;i<n;i++){
            pow[i]=(pow[i-1] * 2)%mod;
        }
        int left=0,right=n-1;
        while(left <= right){
            if(nums[left] + nums[right] <= target){
                count=(count + pow[right-left])%mod;
                left++;
            }
            else right--;
        }
        return count;
    }
}