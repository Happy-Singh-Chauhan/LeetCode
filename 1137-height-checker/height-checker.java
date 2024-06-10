class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
        for(int i=0;i<=heights.length-1;i++){
            arr[i]=heights[i];
        }
        Arrays.sort(heights);
        int count=0;
        for(int j=0;j<=arr.length-1;j++){
            if(arr[j] !=heights[j]){
                count++;
            }
        }
        return count;
    }
}