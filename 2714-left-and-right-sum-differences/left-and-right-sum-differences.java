class Solution {
    public int[] leftRightDifference(int[] nums) {
        if(nums.length == 1){
            return new int[] {0};
        }
        int[] answer=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            if(i==0){
                for(int j=i+1;j<nums.length;j++){
                    sum+=nums[j];
                }
            }
            else{
                int sum1=0;
                int sum2=0;
                for(int j=i+1;j<nums.length;j++){
                    sum1+=nums[j];
                }
                for(int k=i-1;k>=0;k--){
                    sum2+=nums[k];
                }
                sum=Math.abs(sum1-sum2);
            }
            answer[i]=sum;
        }
        return answer;
    }
}