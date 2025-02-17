class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int count=1;
        int top=0;
        int left=0;
        int down=n-1;
        int right=n-1;
        int square=n*n;
        while(count <= square){
            for(int i=left;i<=right;i++){
                matrix[top][i]=count;
                count++;
            }
            for(int i=top+1;i<=down;i++){
                matrix[i][right]=count;
                count++;
            }

                for(int i=right-1;i>=left;i--){
                    matrix[down][i]=count;
                    count++;
                }
            
                for(int i=down-1;i>=top+1;i--){
                    matrix[i][left]=count;
                    count++;
                }
                
            left++;
            right--;
            top++;
            down--;
        }
        return matrix;
    }
}