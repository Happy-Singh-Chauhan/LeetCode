class Solution {
    public int f(int i,int j,int[][] grid,int[][] dp){
        if(i == 0 && j == 0)return grid[0][0];
        if(i<0 || j<0)return (int)1e9;
        if(dp[i][j] != -1)return dp[i][j];
        int left=grid[i][j]+f(i-1,j,grid,dp);
        int up=grid[i][j]+f(i,j-1,grid,dp);
        return dp[i][j]=Math.min(left,up);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return f(m-1,n-1,grid,dp);
    }
}