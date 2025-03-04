class Solution {
    public boolean check(int[] arr,int n,Set<Integer> set){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] <= n){
                if(set.contains(i))return false;
                else set.add(i);
                n-=arr[i];
                if(n == 2)return false;
                if(n <= 1)return true;
            }
        }
        return false;
    }
    public boolean checkPowersOfThree(int n) {
        if(n == 2)return false;
      int[] arr=new int[17];
      for(int i=0;i<17;i++){
        arr[i]=(int)(Math.pow(3,i));
      }  
      Set<Integer> set=new HashSet<>();
      return check(arr,n,set);
    }
}