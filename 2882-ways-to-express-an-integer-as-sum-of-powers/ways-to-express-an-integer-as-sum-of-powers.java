class Solution {
    public int expressed(int i,int j,int[][] dp,List<Integer> list,int mod){
        if(j == 0)return 1;
        if(i < 0 || j < 0)return 0;
        if(dp[i][j] != -1)return dp[i][j];
        int unPick=expressed(i-1,j,dp,list,mod);
        int pick=expressed(i-1,j-list.get(i),dp,list,mod);
        return dp[i][j]=(pick + unPick)%mod;
    }
    public int numberOfWays(int n, int x) {
        int mod=(int)1e9+7;
        List<Integer> list=new ArrayList<>();
        int number=1;
        while (true) {
            long power = 1;
            for (int k = 0; k < x; k++) power *= number;
            if (power <= n) list.add((int) power);
            else break;
            number++;
        }
        int m=list.size();
        int[][] dp=new int[m][n+1];
        for(int[] row:dp)Arrays.fill(row,-1);
        return expressed(m-1,n,dp,list,mod);
    }
}