class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int m=prerequisites.length;
        for(int i=0;i<m;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i] == 0)q.add(i);
        }
        List<Integer> topo=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            topo.add(node);
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0)q.add(it);
            }
        }
        if(topo.size() != numCourses) return new int[]{};
        int[] ans=new int[topo.size()];
        int j=0;
        for(int i=topo.size()-1;i>=0;i--){
            ans[j++]=topo.get(i);
        }
        return ans;
    }
}