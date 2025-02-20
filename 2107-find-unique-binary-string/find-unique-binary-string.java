class Solution {
    public String stringVersion(int n,int i){
        String s=Integer.toBinaryString(i);
        if(s.length() != n){
            while(s.length() != n){
                s="0"+s;
            }
        }
        return s;
    }
    public String findDifferentBinaryString(String[] nums) {
      int n=nums.length;
      Set<String> set=new HashSet<>();
      for(String s:nums){
        set.add(s);
      }  
      int limit=(int)(Math.pow(2,n)-1);
      for(int i=0;i<=limit;i++){
        String s=stringVersion(n,i);
        if(!set.contains(s))return s;
      }
      return "";
    }
}