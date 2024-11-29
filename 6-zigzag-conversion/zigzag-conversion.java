class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()) return s;
        String[][] mat=new String[numRows][s.length()];
        int row=0;
        int col=0;
        int curr=0;

        while(curr < s.length()){
            while(row < numRows && curr < s.length()){
                mat[row++][col]=String.valueOf(s.charAt(curr++));
            }

            row=Math.max(0,row-2);

            while(row > 0 && curr < s.length()){
                mat[row--][++col]=String.valueOf(s.charAt(curr++));
            }
            col++;
        }

        StringBuilder ans=new StringBuilder();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] != null){
                    ans.append(mat[i][j]);
                }
            }
        }
        return ans.toString();
    }
}