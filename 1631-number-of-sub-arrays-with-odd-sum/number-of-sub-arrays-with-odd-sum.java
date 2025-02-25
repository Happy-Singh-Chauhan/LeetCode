class Solution {
    public int numOfSubarrays(int[] arr) {
        int prefixSum=0;
        int oddCount=0;
        int evenCount=1;
        int count=0;

        for(int num:arr){
            prefixSum+=num;
            if(prefixSum % 2 == 0){
                count+=oddCount;
                evenCount++;
            }
            else{
                count+=evenCount;
                oddCount++;
            }
            count%= 1000000007;
        }
        return count;
    }
}