class Solution {
    public int f(int i,int j,String s,String t,int[][] dp){
        if(j < 0)return 1;
        if(i < 0)return 0;
        if(dp[i][j] != -1)return dp[i][j];
        if(s.charAt(i) == t.charAt(j)){
            return dp[i][j]=f(i-1,j,s,t,dp)+f(i-1,j-1,s,t,dp);
        }
        return dp[i][j]=f(i-1,j,s,t,dp);
    }
    public int numDistinct(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[][] dp=new int[n][m];
        for(int[] row:dp)Arrays.fill(row,-1);
        return f(n-1,m-1,s,t,dp);
    }
}