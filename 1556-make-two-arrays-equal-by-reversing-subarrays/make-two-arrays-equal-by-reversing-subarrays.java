class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(target[i] == arr[i]){
                continue;
            }
            else{
                return false;
            }
        }
    return true;
    }
}