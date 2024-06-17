class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length == 1){
            return pref;
        }
       int[] arr=new int[pref.length];
       arr[0]=pref[0]; 
       for(int i=0;i<arr.length-1;i++){
        arr[i+1]=pref[i]^pref[i+1];
       }
       return arr;
    }
}