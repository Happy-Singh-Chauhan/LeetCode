class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] ans=new int[n*m];
        int p=0;
        int i=0;
        int j=0;
        boolean flag=true;
        while(p < n*m){
            ans[p++]=mat[i][j];
            if(flag){
                if(j == m-1){
                    i++;
                    flag=false;
                }
                else if(i == 0){
                    j++;
                    flag=false;
                }
                else{
                    i--;
                    j++;
                }
            } 
            else{
                if(i == n-1){
                    j++;
                    flag=true;
                }
                else if(j == 0){
                    i++;
                    flag=true;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}