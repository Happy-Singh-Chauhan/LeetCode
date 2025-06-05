class Solution {
    public boolean isPalindrome(int start,int end,String s){
        while(start < end){
            if(s.charAt(start++) != s.charAt(end--))return false;
        }
        return true;
    }
    public int f(int start,int end,String s,int[] dp){
        if(start == end)return 0;
        if(dp[start] != -1)return dp[start];
        int min=Integer.MAX_VALUE;
        for(int j=start;j<end;j++){
            if(isPalindrome(start,j,s)){
                int cost=1+f(j+1,end,s,dp);
                min=Math.min(min,cost);
            }
        }
        return dp[start]=min;
    }
    public int minCut(String s) {
        int n=s.length();
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return f(0,n,s,dp)-1;
    }
}