class Solution {
    public int minimizeMax(int[] nums, int p) {
        if(p==0){
            return 0;
        }
        Arrays.sort(nums);
        int left=0;
        int right=nums[nums.length-1]-nums[0];
        while(left<right){
            int mid=(left+right)/2;
            if(countDigits(nums,mid)>=p){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public int countDigits(int[] nums,int max){
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<=max){
                count++;
                i++;
            }
        }
        return count;
    }
}