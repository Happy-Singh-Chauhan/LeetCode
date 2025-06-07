class Solution {
    public int getArea(Stack<Integer> stack,int[] heights,int max,int i){
        int area;
        int popped=stack.pop();
        if(stack.isEmpty()){
            area=heights[popped]*i;
        }
        else area=heights[popped]*(i-1-stack.peek());
        return Math.max(max,area); 
    }
    public int getMaxArea(int[] heights){
        int n=heights.length;
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int max=0;
        for(int i=1;i<n;i++){
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                max=getArea(stack,heights,max,i);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            max=getArea(stack,heights,max,n);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] arr=new int[m];
        int maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == '1')arr[j]+=1;
                else arr[j]=0;
            }
            int area=getMaxArea(arr);
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}