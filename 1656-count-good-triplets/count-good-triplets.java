class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int A=Math.abs(arr[i]-arr[j]);
                if(A <= a){
                    for(int k=j+1;k<n;k++){
                        int B=Math.abs(arr[j]-arr[k]);
                        int C=Math.abs(arr[k]-arr[i]);
                        if(B <= b && C <= c)count++;
                    }
                }
            }
        }
        return count;
    }
}