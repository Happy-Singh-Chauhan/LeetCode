class Solution {
    public int concatenatedBinary(int n) {
        long result=0;
        long modulo=1000000007;
        for(int i=1;i<=n;i++){
            int temp=i;
            while(temp>0){
                temp/=2;
                result*=2;
            }
            result=(result+i) % modulo;
        }
        return (int) result;
    }
}