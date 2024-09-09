class Solution {
    public int findNthDigit(int n) { 
        int digit=1;
        long count=9;
        int start=1;
        while(n > digit*count){
            n-=digit*count;
            digit++;
            count*=10;
            start*=10;
        }
        start+=(n-1)/digit;
        String s=Integer.toString(start);
        return Character.getNumericValue(s.charAt((n-1)%digit));
    }
}