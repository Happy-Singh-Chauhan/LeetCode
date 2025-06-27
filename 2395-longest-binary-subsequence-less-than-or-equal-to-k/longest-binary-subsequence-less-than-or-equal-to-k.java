class Solution {
    public int longestSubsequence(String s, int k) {
        int n=s.length();
        int ans=0;
        long power=1;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == '0')ans++;
            else if(power <= k){
               ans++;
               k-=power;
            }
            if(power <= k){
            power<<=1;
            }
        }
        return ans;
    }
}