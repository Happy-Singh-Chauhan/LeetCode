class Solution {
    public int countTriplets(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            int xor1=0;
            for(int j=i+1;j<n;j++){
                xor1^=arr[j-1];
                int xor2=0;
                for(int k=j;k<n;k++){
                    xor2^=arr[k];
                    if(xor1 == xor2)count++;
                }
            }
        }
        return count;
    }
}