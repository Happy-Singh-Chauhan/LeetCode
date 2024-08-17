class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }
        int[] ans=new int[arr.length];
        int temp=-1;
        ans[ans.length-1]=temp;
        for(int i=arr.length-1;i>=1;i--){
            if(arr[i]>temp){
                temp=arr[i];
            }
            ans[i-1]=temp;
        }
        return ans;
    }
}