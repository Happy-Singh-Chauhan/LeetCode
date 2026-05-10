class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int layers=Math.min(m/2,n/2);
        for(int layer=0;layer<layers;layer++){
            List<Integer> elements=new ArrayList<>();
            int top=layer;
            int right=m-layer-1;
            int bottom=n-layer-1;
            int left=layer;

        for(int j=left;j<=right;j++){
            elements.add(grid[top][j]);
        }
        for(int i=top+1;i<bottom;i++){
            elements.add(grid[i][right]);
        }
        for(int j=right;j>=left;j--){
            elements.add(grid[bottom][j]);
        }
        for(int i=bottom-1;i>top;i--){
            elements.add(grid[i][left]);
        }
        int size=elements.size();
        int index=k%size;

        for(int j=left;j<=right;j++){
            grid[top][j]=elements.get(index);
            index=(index+1)%size;
        }
        for(int i=top+1;i<bottom;i++){
            grid[i][right]=elements.get(index);
            index=(index+1)%size;
        }
        for(int j=right;j>=left;j--){
            grid[bottom][j]=elements.get(index);
            index=(index+1)%size;
        }
        for(int i=bottom-1;i>top;i--){
            grid[i][left]=elements.get(index);
            index=(index+1)%size;
        }
        }
        return grid;
    }
}