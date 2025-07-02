class Solution {
    static int mod=1000000007;
    public int possibleStringCount(String word, int k) {
        if(k > word.length())return 0;
        List<Integer> list=new ArrayList<>();
        int cnt=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i) == word.charAt(i-1))cnt++;
            else{
                list.add(cnt);
                cnt=1;
            }
        }
        list.add(cnt);
        long ans=1;
        for(int num:list)ans=(ans * num) % mod;
        if(list.size() >= k)return (int)ans;
        int n=list.size();
        int[][] dp=new int[n+1][k+1];
        for(int i=k-1;i>=0;i--){
            dp[n][i]=1;
        }
        for(int i=n-1;i>=0;i--){
            int[] prefix=new int[k+1];
            for(int h=1;h<=k;h++){
                prefix[h]=(prefix[h-1]+dp[i+1][h-1]) % mod;
            }
            for(int count=k-1;count>=0;count--){
                int l=count+1;
                int r=count+list.get(i);
                if(r+1 > k) r=k-1;
                if(l <= r){
                    dp[i][count]=(prefix[r+1] - prefix[l] + mod) % mod;
                }
            }
        }
        long invalid=dp[0][0];
        return (int)(ans-invalid + mod) % mod;
    }
}