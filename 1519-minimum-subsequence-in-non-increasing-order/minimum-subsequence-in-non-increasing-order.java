class Solution {
    public List<Integer> minSubsequence(int[] nums) {
     Arrays.sort(nums);
     List<Integer> list=new ArrayList<>();
     int sum=0;
     for(int n:nums){
        sum+=n;
     }
     int sum1=0;
     for(int i=nums.length-1;i>=0;i--){
        sum-=nums[i];
        sum1+=nums[i];
        list.add(nums[i]);
        if(sum < sum1)break;
     }   
     return list;
    }
}