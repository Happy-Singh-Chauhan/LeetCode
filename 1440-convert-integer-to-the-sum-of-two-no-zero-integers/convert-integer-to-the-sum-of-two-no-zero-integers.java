class Solution {
    public boolean check(int n){
        String s=""+n;
        if(s.contains("0"))return false;
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
      for(int i=1;i<=n;i++){
        int a=i;
        int b=n-i;
        if(check(a) && check(b)){
            return new int[]{a,b};
        }
      }
      return new int[]{};
    }
}