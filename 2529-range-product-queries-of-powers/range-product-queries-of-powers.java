class Solution {
    public int checkQuery(int left,int right,int[] power,int mod){
        long ans=1L;
        long m=mod;
        for(int i=left;i<=right;i++){
            ans=(ans*power[i]) % mod;
        }
        return (int)ans;
    }
    public int[] productQueries(int n, int[][] queries) {
        int mod=(int)1e9 + 7;
        int[] ans=new int[queries.length];
        List<Integer> list=new ArrayList<>();
        int cnt=Integer.bitCount(n);
        int[] power=new int[cnt];
        int m=n;
        int q=0;
        int k=0;
        while(m > 0){
            if((m & 1) == 1){
                power[k++]=(int)Math.pow(2,q);
            }
            q++;
            m/=2;
        }
        System.out.println(Arrays.toString(power));
        for(int i=0;i<queries.length;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            ans[i]=checkQuery(left,right,power,mod);
        }
        return ans;
    }
}