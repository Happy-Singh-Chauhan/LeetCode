class Solution {
    public void dfs(int row,int col,char[][] grid){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0')return;
        grid[row][col]='0';

        dfs(row,col-1,grid);
        dfs(row-1,col,grid);
        dfs(row,col+1,grid);
        dfs(row+1,col,grid);
        return;
    }
    public int numIslands(char[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       int count=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j] == '1'){
                count++;
                dfs(i,j,grid);
            }
        }
       } 
       return count;
    }
}