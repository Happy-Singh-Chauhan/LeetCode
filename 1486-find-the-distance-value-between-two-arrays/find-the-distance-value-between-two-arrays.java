class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        int count1=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                int num=Math.abs(arr1[i]-arr2[j]);
                if(num>d){
                    count++;
                }
            }
            if(count == arr2.length){
                    count1++;
                }
                count=0;
        }
        return count1;
    }
}