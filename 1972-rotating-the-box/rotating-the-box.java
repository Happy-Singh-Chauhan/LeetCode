class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n=boxGrid.length;
        int m=boxGrid[0].length;
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                if(boxGrid[i][j] == '.'){
                int a=j;
                    while(j >= 0){
                        if(boxGrid[i][j] == '*')break;
                        else if(boxGrid[i][j] == '#'){
                            boxGrid[i][a]='#';
                            boxGrid[i][j]='.';
                            a--;
                        }
                        j--;
                    }
                }
            }
        }
        char[][] rotated=new char[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rotated[j][n-1-i]=boxGrid[i][j];
            }
        }
        return rotated;
    }
}