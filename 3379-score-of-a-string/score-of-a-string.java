class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        for(int i=1;i<s.length();i++){
            int sum=(s.charAt(i)-'0') - (s.charAt(i-1)-'0');
            ans+=Math.abs(sum);
        }
        return ans;
    }
}