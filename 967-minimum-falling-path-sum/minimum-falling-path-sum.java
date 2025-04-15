class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[] prev=new int[n];
        int[] curr=new int[n];
        for(int i=0;i<matrix.length;i++){
            prev[i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int s=matrix[i][j]+prev[j];
                int dl=matrix[i][j];
                int dr=matrix[i][j];
                if(j-1 >= 0){
                    dl+=prev[j-1];
                }
                else dl+=(int)1e9;
                if(j+1 < n){
                    dr+=prev[j+1];
                }
                else dr+=(int)1e9;
                curr[j]=Math.min(s,Math.min(dl,dr));
            }
            for(int l=0;l<n;l++){
                prev[l]=curr[l];
            }
        }
        int min=(int)1e9;
        for(int i=0;i<n;i++){
            min=Math.min(min,prev[i]);
        }
        return min;
    }
}