class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long> set=new HashSet<>();
        for(long n:nums){
            set.add(n);
        }
        int max=-1;
        for(long num:nums){
            int ans=1;
            while(set.contains(num*num)){
                ans++;
                num=num*num;
                max=Math.max(max,ans);
            }
        }
        return max;
    }
}