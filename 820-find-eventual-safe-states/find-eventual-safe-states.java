class Solution {
    public boolean dfs(int node,int[][] graph,boolean[] visited,boolean[] inStack){
        if(inStack[node])return true;
        if(visited[node])return false;
        visited[node]=true;
        inStack[node]=true;
        for(int i:graph[node]){
            if(dfs(i,graph,visited,inStack))return true;
        }
        inStack[node]=false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        boolean[] visited=new boolean[n];
        boolean[] inStack=new boolean[n];

        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,graph,visited,inStack);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!inStack[i])list.add(i);
        }
        return list;
    }
}