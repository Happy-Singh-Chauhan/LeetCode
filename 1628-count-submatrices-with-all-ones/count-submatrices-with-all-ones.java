class Solution {
    public int numSubmat(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] dp=new int[n][m];
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j == 0){
                    dp[i][j]=mat[i][j];
                }
                else{
                    dp[i][j]=(mat[i][j] == 0)? 0:dp[i][j-1]+1;
                }
                int curr=dp[i][j];
                for(int k=i;k>=0;k--){
                    curr=Math.min(curr,dp[k][j]);
                    if(curr == 0)break;
                    res+=curr;
                }
            }
        }
        return res;
    }
}