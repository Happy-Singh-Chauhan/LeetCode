class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] answer=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int ans=0;
            int start=queries[i][0];
            int end=queries[i][1];
            if(start == end){
                ans=arr[start];
            }
            else{
            for(int j=start;j<=end;j++){
                ans^=arr[j];
            }
            }
            answer[i]=ans;
        }
        return answer;
    }
}