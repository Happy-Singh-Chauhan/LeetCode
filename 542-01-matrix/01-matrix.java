class Pair{
    int first;
    int second;
    int third;
    Pair(int _first,int _second,int _third){
        this.first=_first;
        this.second=_second;
        this.third=_third;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        boolean[][] visited=new boolean[n][m];
        int[][] dist=new int[n][m];
        Queue<Pair> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0){
                    queue.add(new Pair(i,j,0));
                    visited[i][j]=true;
                }
            }
        }
        int[] delrow={-1,0,1,0};
        int[] delcol={0,1,0,-1};
        while(!queue.isEmpty()){
            int row=queue.peek().first;
            int col=queue.peek().second;
            int steps=queue.peek().third;
            queue.remove();
            dist[row][col]=steps;
            for(int i=0;i<4;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !visited[nrow][ncol]){
                    visited[nrow][ncol]=true;
                    queue.add(new Pair(nrow,ncol,steps+1));
                }
            }
        }
        return dist;
    }
}