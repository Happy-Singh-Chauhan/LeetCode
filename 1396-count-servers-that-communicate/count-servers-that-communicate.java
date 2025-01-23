class Solution {
    public boolean check(int[][] grid,int i,int j){
        int count=0;
        for(int k=0;k<grid.length;k++){
            if(grid[k][j] == 1){
                count++;
            }
            if(count >= 2)return false;
        }
        count=0;
        for(int k=0;k<grid[0].length;k++){
            if(grid[i][k] == 1)count++;
            if(count >= 2) return false;
        }
        return true;
    }
    public int countServers(int[][] grid) {
        int countSet=0;
        int countUnset=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    countSet++;
                    if(check(grid,i,j)){
                        countUnset++;
                    }
                }
            }
        }
        return countSet-countUnset;
    }
}