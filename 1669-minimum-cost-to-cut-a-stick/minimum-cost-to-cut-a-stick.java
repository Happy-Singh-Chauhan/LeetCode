class Solution {
    public int f(int i,int j,int[] newCuts,int[][] dp){
        if(dp[i][j] != -1)return dp[i][j];
        if(j - i == 1)return 0;
        int min=Integer.MAX_VALUE;
        for(int ind=i+1;ind<j;ind++){
            int cost=f(i,ind,newCuts,dp)+f(ind,j,newCuts,dp)+newCuts[j]-newCuts[i];
            min=Math.min(min,cost);
        }
        return dp[i][j]=min;
    }
    public int minCost(int n, int[] cuts) {
        int m=cuts.length;
        int[] newCuts=new int[m+2];
        newCuts[0]=0;
        newCuts[m+1]=n;
        for(int i=0;i<m;i++){
            newCuts[i+1]=cuts[i];
        }
        Arrays.sort(newCuts);
        int[][] dp=new int[m+2][m+2];
        for(int[] row:dp)Arrays.fill(row,-1);
        return f(0,m+1,newCuts,dp);
    }
}