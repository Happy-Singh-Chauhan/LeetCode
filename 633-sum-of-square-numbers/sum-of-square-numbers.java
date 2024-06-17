class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0;
        long b=(long)Math.sqrt(c);
        if(c == 2){
            return true;
        }
        
        while(a<=b){
            long sum=(long)(Math.pow(a,2) + Math.pow(b,2));
            if(sum == c){
                return true;
            }
            else if(sum>c){
                b--;
            }
            else if(sum<c){
                a++;
            }
        }
        return false;
    }
}