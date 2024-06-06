class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<=nums.length-1;i++){
            sum+=nums[i];
        }
        int sum1=0;
        for(int j=0;j<=nums.length-1;j++){
            if(nums[j]<10){
                sum1+=nums[j];
            }
            else if(nums[j]>9){
                while(nums[j] !=0){
                    sum1+=nums[j]%10;
                    nums[j]=nums[j]/10;
                }
            }
        }
        int ans=sum-sum1;
        if(ans<0){
            ans= -1 * ans;
        }
        return ans;
    }
}