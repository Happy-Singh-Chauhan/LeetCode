class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        if(n == 1 || m == 1){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    list.add(matrix[i][j]);
                }
            }
            return list;
        }
        int k=0;
        for(int i=k;i<n;i++){
            if(list.size() == matrix.length*matrix[0].length)break;
            int r=0;
            for(int j=k;j<m;j++){
                list.add(matrix[i][j]);
                r=j;
            }
            int t=0;
            if(r == m-1 && i == k){
                for(int s=k+1;s<n;s++){
                    list.add(matrix[s][r]);
                    t=s;
                }
            }
            int q=0;
            if(t == n-1 && r == m-1){
                for(int s=r-1;s>=k;s--){
                    list.add(matrix[t][s]);
                    q=s;
                }
            }
            if(q == k && t == n-1){
                for(int s=t-1;s>=k+1;s--){
                    list.add(matrix[s][q]);
                }
            }
            m--;
            n--;
            k++;
        }
        return list;
    }
}