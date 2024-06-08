class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<10){
                ans.add(i);
            }
            else{
               if(check(i)){
                ans.add(i);
               }
            }
        }
        return ans;
    }
    static boolean check(int num){
        for (int n = num; n > 0; n /= 10){
      if (n % 10 == 0 || num % (n % 10) != 0){
        return false;
      }
        }
    return true;
    }
}