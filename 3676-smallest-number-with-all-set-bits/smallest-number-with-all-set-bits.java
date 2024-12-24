class Solution {
    public int smallestNumber(int n) {
        int count=0;
        while(n > 0){
            count++;
            n=n>>1;
        }
        return (int)Math.pow(2,count)-1;
    }
}