class Solution {
    public int findComplement(int num) {
        int count=0;
        int temp=num;
       while(num != 0){
        num=num>>1;
        count++;
       }
       int power=(int)(Math.pow(2,count)-1);
      return temp^power;
    }
}