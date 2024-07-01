class Solution {
    public int reverse(int x) {
        int sign=1;
        if(x<0){
            sign=(-1);
        }
        x=Math.abs(x);
        int ans=0;
        while(x>0){
            int rem=x%10;
            if(ans>(Integer.MAX_VALUE - rem)/10){
                return 0;
            }
            ans=ans*10+rem;
            x/=10;
        }
        return sign*ans;
    }
}