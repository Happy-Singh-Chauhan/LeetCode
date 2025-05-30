class Solution {
    public int minCost(int n, int[] cuts) {
        int m=cuts.length;
        int[] stick=new int[m+2];
        stick[m+1]=n;
        for(int i=0;i<m;i++){
            stick[i+1]=cuts[i];
        }
        Arrays.sort(stick);
        int[][] dp=new int[m+2][m+2];

        for(int len=2;len<stick.length;len++){
            for(int i=0;i+len<stick.length;i++){
                int j=i+len;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i+1;k<j;k++){
                    int cost=dp[i][k]+dp[k][j]+stick[j]-stick[i];
                    dp[i][j]=Math.min(cost,dp[i][j]);
                }
            }
        }
        return dp[0][m+1];
    }
}