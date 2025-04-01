class Solution {
    public String getPermutation(int n, int k) {
      List<Integer> list=new ArrayList<>();
      int fact=1;
      for(int i=1;i<=n;i++){
            fact*=i;
            list.add(i);
      }  
      fact/=n;
      k-=1;
      String ans="";
      while(true){
        ans+=list.get(k / fact);
        list.remove(k / fact);
        if(list.size() == 0)break;
        k%=fact;
        fact/=list.size();
      }
      return ans;
    }
}