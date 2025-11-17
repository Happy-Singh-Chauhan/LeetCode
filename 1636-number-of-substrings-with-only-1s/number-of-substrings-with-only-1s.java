class Solution {
    public int numSub(String s) {
       int mod=(int)1e9+7;
       long cnt=0;
     long ans=0; 
        for(char c:s.toCharArray()){
            if(c == '1')cnt++;
            else{
                if(cnt != 0){
                ans+=(cnt*(cnt+1))/2;
                ans%=mod;
                cnt=0;
                }
            }
        }
            ans+=(cnt*(cnt+1))/2;
            ans%=mod;
        return (int)ans;
    }
}