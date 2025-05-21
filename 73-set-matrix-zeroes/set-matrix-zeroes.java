class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int count=0;
        for(int[] row:matrix){
            for(int num:row){
                if(num == 0)count++;
            }
        }
        int[][] arr=new int[count][2];
        int a=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    arr[a][0]=i;
                    arr[a][1]=j;
                    a++;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    for(int[] s:arr){
                        if(s[0] == i && s[1] == j){
                            for(int k=0;k<m;k++){
                                matrix[k][j]=0;
                            }
                            for(int k=0;k<n;k++){
                                matrix[i][k]=0;
                            }
                        }
                    }
                }
            }
        }
    }
}