class Solution {
    public int bitwiseComplement(int n) {
        if( n == 0) return 1;
        int count=0;
        int temp=n;
       while(n != 0){
        n=n>>1;
        count++;
       }
       int power=(int)(Math.pow(2,count)-1);
      return temp^power;
    }
}