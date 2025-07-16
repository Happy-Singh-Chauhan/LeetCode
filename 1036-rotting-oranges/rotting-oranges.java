class Pair{
    int row;
    int col;
    int tm;
    Pair(int _row,int _col,int _tm){
        this.row=_row;
        this.col=_col;
        this.tm=_tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> queue=new LinkedList<>();
        int[][] visited=new int[n][m];
        int countFresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    queue.add(new Pair(i,j,0));
                }
                else if(grid[i][j] == 1)countFresh++;
            }
        }
        if(countFresh == 0)return 0;
        if(queue.isEmpty())return -1;
        int cnt=0;
        int tm=0;
        int[] delrow={-1,0,1,0};
        int[] delcol={0,1,0,-1};
        while(!queue.isEmpty()){
            int r=queue.peek().row;
            int c=queue.peek().col;
            int t=queue.peek().tm;
            tm=Math.max(tm,t);
            queue.remove();
            for(int i=0;i<4;i++){
                int nrow=r+delrow[i];
                int ncol=c+delcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                    queue.add(new Pair(nrow,ncol,t+1));
                    visited[nrow][ncol]=2;
                    cnt++;
                }
            }
        }
        return (cnt != countFresh)? -1 : tm;
    }
}