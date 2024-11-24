class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int min=Integer.MAX_VALUE;
        int negative=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                sum+=Math.abs(matrix[i][j]);
                if(matrix[i][j] < 0){
                    negative++;
                }
                min=Math.min(min,Math.abs(matrix[i][j]));
            }
        }

        if(negative % 2 != 0 ){
            sum-=(2*min);
        }
        return sum;
    }
}