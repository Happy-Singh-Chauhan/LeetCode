class Solution {
    public long minEnd(int n, int x) {
        long res=x;
        while(--n > 0){
            res=(res+1) | x;
        }
        return res;
    }
}