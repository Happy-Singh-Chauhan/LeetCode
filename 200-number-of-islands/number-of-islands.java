class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}

class Solution {
    public void bfs(int ro,int co,char[][] grid){
        Queue<Pair> queue=new LinkedList<Pair>();
        queue.add(new Pair(ro,co));
        int n=grid.length;
        int m=grid[0].length;

        while(!queue.isEmpty()){
            int row=queue.peek().first;
            int col=queue.peek().second;
            queue.remove();
            int[] delrow={-1,0,1,0};
            int[] delcol={0,1,0,-1};
            for(int k=0;k<4;k++){
                int nrow=row+delrow[k];
                int ncol=col+delcol[k];

                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1'){
                    grid[nrow][ncol]='0';
                    queue.add(new Pair(nrow,ncol));
                    }
                }
            }
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
                    bfs(i,j,grid);
                }
            }
        }
        return count;
    }
}