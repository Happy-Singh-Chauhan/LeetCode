class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        long totalPairs=((long)n*(n-1))/2;
        long goodPairs=0;
        for(int i=0;i<n;i++){
            int diff=nums[i]-i;
            goodPairs+=map.getOrDefault(diff,0);
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        return totalPairs-goodPairs;
    }
}