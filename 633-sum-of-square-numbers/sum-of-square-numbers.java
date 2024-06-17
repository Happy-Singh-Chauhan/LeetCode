class Solution {
    public boolean judgeSquareSum(int c) {
        int a=0;
        int b=(int)Math.sqrt(c);
        
        
        while(a<=b){
            long sum=(long)(Math.pow(a,2) + Math.pow(b,2));
            if(sum == c){
                return true;
            }
            else if(sum>c){
                b--;
            }
            else{
                a++;
            }
        }
        return false;
    }
}