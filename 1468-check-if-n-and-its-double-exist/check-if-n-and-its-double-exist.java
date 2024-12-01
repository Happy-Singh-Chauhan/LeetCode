class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[i] == 2*arr[j] || arr[j] == 2*arr[i]) return true;
            }
        }
        return false;
    }
}