class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq=new int[A.length];
        int[] ans=new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            freq[A[i]-1]++;
            freq[B[i]-1]++;
            if(A[i]-1 == B[i]-1 && freq[A[i]-1] == 2)count++;
            else{
                if(freq[A[i]-1] == 2)count++;
                if(freq[B[i]-1] == 2)count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}