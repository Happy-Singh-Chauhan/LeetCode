class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int mod=(int)1e9+7;
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<t;i++){
            int num=freq[25];
            for(int j=25;j>=1;j--){
                freq[j]=freq[j-1];
            }
            freq[0]=num;
            freq[1]=(num+freq[1])%mod;
        }
        int res=0;
        for(int i=0;i<26;i++){
            res=(res+freq[i])%mod;
        }
        return res;
    }
}