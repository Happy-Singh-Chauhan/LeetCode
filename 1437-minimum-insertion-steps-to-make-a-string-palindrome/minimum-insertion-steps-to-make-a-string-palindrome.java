class Solution {
    public int lcs(String text1,String text2){
        int n=text1.length();
        int[][] dp=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return n-dp[n][n];
    }
    public int minInsertions(String s) {
        String str=new StringBuilder(s).reverse().toString();
        return lcs(s,str);
    }
}