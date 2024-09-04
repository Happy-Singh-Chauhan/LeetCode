class Solution {
    public boolean check(int[] arr2,int n,int d){
        for(int m:arr2){
           if(-d + m<=n && n<=m+d){
            return false;
           } 
        }
        return true;
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int n:arr1){
            if(check(arr2,n,d)){
                count++;
            }
        }
        return count;
    }
}