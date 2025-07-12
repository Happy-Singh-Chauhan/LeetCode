class Solution {
    public void dfs(int node,int[][] isConnected,boolean[] visited){
        int n=isConnected.length;
        visited[node]=true;
        for(int i=0;i<n;i++){
            if(isConnected[node][i] == 1 && !visited[i]){
                dfs(i,isConnected,visited);
            }
        }
        return;
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int noOfProvinces=0;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                noOfProvinces++;
                dfs(i,isConnected,visited);
            }
        }
        return noOfProvinces;
    }
}