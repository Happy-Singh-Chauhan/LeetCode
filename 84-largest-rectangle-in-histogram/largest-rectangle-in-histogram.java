class Solution {
    public int getMaxArea(int[] heights,Stack<Integer> stack,int max,int i){
        int maxArea;
        int popped=stack.pop();
        if(stack.isEmpty()){
            maxArea=heights[popped]*i;
        }
        else maxArea=heights[popped] * (i-1-stack.peek());
        return Math.max(max,maxArea);
    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int max=0;
        for(int i=1;i<n;i++){
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                max=getMaxArea(heights,stack,max,i);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            max=getMaxArea(heights,stack,max,n);
        }
        return max;
    }
}