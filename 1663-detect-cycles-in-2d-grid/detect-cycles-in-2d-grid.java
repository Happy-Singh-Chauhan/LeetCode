class Solution {
    public boolean dfs(int i,int j,char[][] grid,boolean[][] visited,int pi,int pj,char val){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || val != grid[i][j])return false;
        if(visited[i][j])return true;
        visited[i][j]=true;
        int[][] d={{-1,0},{0,1},{1,0},{0,-1}};
        for(int[] di:d){
            int ni=i+di[0];
            int nj=j+di[1];
            if(ni == pi && nj == pj)continue;
            if(dfs(ni,nj,grid,visited,i,j,val))return true;
        }
        return false;
    }
    public boolean containsCycle(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j]){
                if(dfs(i,j,grid,visited,-1,-1,grid[i][j]))return true;
                }
            }
        }
        return false;
    }
}