class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr=new int[m][n];
        if(m*n != original.length){
            return new int[][]{};
        }
        if(m == 1 ){
            for(int i=0;i<n;i++){
                arr[0][i]=original[i];
            }
        }
        else if(n == 1){
            for(int i=0;i<m;i++){
                arr[i][0]=original[i];
            }
        }
        else{
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=original[ans];
                ans++;
            }
        }
        }
        return arr;
    }
}