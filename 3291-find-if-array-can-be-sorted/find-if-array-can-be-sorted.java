class Solution {
    public boolean canSortArray(int[] nums) {
        int[] arr=nums.clone();

        for(int i=0;i<arr.length-1;i++){

            if(arr[i] > arr[i+1]){
                if(Integer.bitCount(arr[i]) == Integer.bitCount(arr[i+1])){
                    int k=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=k;
                }
                else{
                    return false;
                }
            }
        }

        for(int i=arr.length-1;i>0;i--){

            if(arr[i] < arr[i-1]){
                if(Integer.bitCount(arr[i]) == Integer.bitCount(arr[i-1])){
                    int k=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=k;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}