class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0;
        int left=0;
        int right=m-1;
        int down=n-1;

        while(list.size() < n*m){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            for(int i=top+1;i<=down;i++){
                list.add(matrix[i][right]);
            }
            if(top != down){
            for(int i=right-1;i>=left;i--){
                list.add(matrix[down][i]);
            }
            }
            if(left != right){
            for(int i=down-1;i>=top+1;i--){
                list.add(matrix[i][left]);
            }
            }
            top++;
            left++;
            right--;
            down--;
        }
        return list;
    }
}