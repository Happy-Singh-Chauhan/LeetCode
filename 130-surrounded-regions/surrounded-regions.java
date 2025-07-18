class Solution {
    public void dfs(int row,int col,char[][] board,boolean[][] visited){
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col] || board[row][col] == 'X')return;
        visited[row][col]=true;
        dfs(row-1,col,board,visited);
        dfs(row,col+1,board,visited);
        dfs(row+1,col,board,visited);
        dfs(row,col-1,board,visited);
        return;
    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<m;i++){
            if(board[0][i] == 'O' && !visited[0][i]){
                dfs(0,i,board,visited);
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][0] == 'O' && !visited[i][0]){
                dfs(i,0,board,visited);
            }
        }
        for(int i=0;i<m;i++){
            if(board[n-1][i] == 'O' && !visited[n-1][i]){
                dfs(n-1,i,board,visited);
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][m-1] == 'O' && !visited[i][m-1]){
                dfs(i,m-1,board,visited);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 'O' && !visited[i][j]){
                    board[i][j]='X';
                }
            }
        }
        return;
    }
}