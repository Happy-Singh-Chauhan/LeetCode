class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[][] dp=new int[n][n];
        for(int i=0;i<matrix.length;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int s=matrix[i][j]+dp[i-1][j];
                int dl=matrix[i][j];
                int dr=matrix[i][j];
                if(j-1 >= 0){
                    dl+=dp[i-1][j-1];
                }
                else dl+=(int)1e9;
                if(j+1 < n){
                    dr+=dp[i-1][j+1];
                }
                else dr+=(int)1e9;
                dp[i][j]=Math.min(s,Math.min(dl,dr));
            }
        }
        int min=(int)1e9;
        for(int i=0;i<n;i++){
            min=Math.min(min,dp[n-1][i]);
        }
        return min;
    }
}