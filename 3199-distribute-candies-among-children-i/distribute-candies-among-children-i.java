class Solution {
    public int distributeCandies(int n, int limit) {
        int[] arr=new int[limit+1];
        int m=arr.length;
        int count=0;
        for(int i=0;i<m;i++)arr[i]=i;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                    for(int k=0;k<m;k++){
                    if(arr[i]+arr[j]+arr[k] == n)count++;
                }
            }
        }
        return count;
    }
}