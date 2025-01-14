class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq=new int[A.length+1];
        int[] ans=new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            if(++freq[A[i]] == 2)count++;
            if(++freq[B[i]] == 2)count++;
            ans[i]=count;
        }
        return ans;
    }
}