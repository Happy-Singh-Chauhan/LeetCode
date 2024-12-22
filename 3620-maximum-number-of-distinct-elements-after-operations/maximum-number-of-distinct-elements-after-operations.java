class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        int prev=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int x=Math.max(prev+1,nums[i]-k);
            if(x <= nums[i]+k){
                set.add(x);
                prev=x;
            }
        }
        return set.size();
    }
}