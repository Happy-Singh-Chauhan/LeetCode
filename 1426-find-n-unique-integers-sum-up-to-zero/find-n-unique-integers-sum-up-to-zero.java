class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        if(n == 1){
            arr[0]=0;
            return arr;
        }
        if(n % 2 !=0){
            arr[0]=0;
            for(int i=1;i<n;i=i+2){
                arr[i]=i;
                arr[i+1]=-i;
            }
        }
        else{
            for(int j=1;j<=n;j=j+2){
                arr[j]=j;
                arr[j-1]=-j;
            }
        }
        return arr;
    }
}