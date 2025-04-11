class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int right=0;
                int down=0;
                if(i == 0 && j == 0)continue;
                if(i > 0){
                     right=dp[i-1][j];
                }
                if(j > 0){
                     down=dp[i][j-1];
                }
                dp[i][j]=right+down;
            }
        }
        return dp[m-1][n-1];
    }
}