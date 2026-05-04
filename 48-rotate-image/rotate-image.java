class Solution {
    public void transpose(int[][] matrix,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i != j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        return;
    }
    public void reverse(int[][] matrix,int n){
        for(int i=0;i<n;i++){
            int j=0;
            int k=n-1;
            while(j < k){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;
                k--;
            }
        }
        return;
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
       transpose(matrix,n);
       reverse(matrix,n);
       return; 
    }
}