class Solution {
    public void floodFillColor(int i,int j,int[][] image,int color,int currVal,boolean[][] visited){
        if(i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != currVal || visited[i][j])return;
        visited[i][j]=true;
        image[i][j]=color;

        floodFillColor(i,j-1,image,color,currVal,visited);
        floodFillColor(i-1,j,image,color,currVal,visited);
        floodFillColor(i,j+1,image,color,currVal,visited);
        floodFillColor(i+1,j,image,color,currVal,visited);
        return;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currVal=image[sr][sc];
        int n=image.length;
        int m=image[0].length;
        boolean[][] visited=new boolean[n][m];
        floodFillColor(sr,sc,image,color,currVal,visited);
        return image;
    }
}