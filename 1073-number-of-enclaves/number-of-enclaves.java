class Solution {
    public void dfs(int row,int col,int[][] grid,boolean[][] visited){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || visited[row][col] || grid[row][col] == 0)return;
        visited[row][col]=true;
        dfs(row-1,col,grid,visited);
        dfs(row,col+1,grid,visited);
        dfs(row+1,col,grid,visited);
        dfs(row,col-1,grid,visited);
        return;
    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<m;i++){
            if(grid[0][i] == 1 && !visited[0][i]){
                dfs(0,i,grid,visited);
            }
        }
        for(int i=0;i<n;i++){
            if(grid[i][0] == 1 && !visited[i][0]){
                dfs(i,0,grid,visited);
            }
        }
        for(int i=0;i<m;i++){
            if(grid[n-1][i] == 1 && !visited[n-1][i]){
                dfs(n-1,i,grid,visited);
            }
        }
        for(int i=0;i<n;i++){
            if(grid[i][m-1] == 1 && !visited[i][m-1]){
                dfs(i,m-1,grid,visited);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1 && !visited[i][j])count++;
            }
        }
        return count;
    }
}