class Solution {
    public int concatenatedBinary(int n) {
        long ans=0;
        long modulo=1000000007;
        int curr=0;
        for(int i=1;i<=n;i++){
            if((1 << curr) == i){
                curr++;
            } 
            ans= ((ans << curr) + i) % modulo;
        }
        return (int) ans;
    }
}