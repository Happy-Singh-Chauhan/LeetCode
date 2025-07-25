class Solution {
    public int maxSum(int[] nums) {
        int maxVal=Integer.MIN_VALUE;
        int ans=0;
        for(int num:nums){
            maxVal=Math.max(maxVal,num);
        }
        if(maxVal < 0)return maxVal;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(num > 0 && !set.contains(num)){
            ans+=num;
            set.add(num);
            }
        }
        return ans;
    }
}