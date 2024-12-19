class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int prefixSum=0;
        int sortedPrefixSum=0;
        int chunks=0;
        for(int i=0;i<n;i++){
            prefixSum+=arr[i];
            sortedPrefixSum+=i;

            if(prefixSum == sortedPrefixSum){
                chunks++;
            }
        }
        return chunks;
    }
}