class Solution {
    public void bfs(int node,int[][] isConnected,boolean[] visited){
        int n=isConnected.length;
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(node);
        visited[node]=true;

        while(!queue.isEmpty()){
            node=queue.poll();
            for(int i=0;i<n;i++){
                if(isConnected[node][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i]=true;
                }
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
                bfs(i,isConnected,visited);
            }
        }
        return noOfProvinces;
    }
}