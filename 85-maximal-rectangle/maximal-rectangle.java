class Solution {
     private int getMax(int[] arr,Stack<Integer> stack,int max,int i){
        int area;
        int popped=stack.pop();
        if(stack.isEmpty()){
            area=arr[popped]*i;
        }
        else{
            area=arr[popped]*(i-1-stack.peek());
        }
        return Math.max(max,area);
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int max=0;
        stack.push(0);
        for(int i=1;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                max=getMax(heights,stack,max,i);
            } 
            stack.push(i);
        }
        int i=heights.length;
        while(!stack.isEmpty()){
            max=getMax(heights,stack,max,i);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] area=new int[m];
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == '1')area[j]+=1;
                else area[j]=0;
            }
            int maxArea=largestRectangleArea(area);
            max=Math.max(max,maxArea);
        }
        return max;
    }
}