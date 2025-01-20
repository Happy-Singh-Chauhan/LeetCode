class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int[] numRow=new int[row];
        int[] numCol=new int[col];
        Map<Integer,int[]> numPos=new HashMap<>();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int value=mat[i][j];
                numPos.put(value,new int[]{i,j});
            }
        }
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            int[] pos=numPos.get(val);
            int r=pos[0];
            int c=pos[1];

            numRow[r]++;
            numCol[c]++;

            if(numRow[r] == col || numCol[c] == row)return i;
        }
        return -1;
    }
}