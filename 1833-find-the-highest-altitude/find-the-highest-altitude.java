class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int sum=0;
        for(int n : gain){
            sum+=n;
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}