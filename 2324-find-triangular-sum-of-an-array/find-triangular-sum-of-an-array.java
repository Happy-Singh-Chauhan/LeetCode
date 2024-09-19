class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        if(n == 1){
            return nums[0];
        }
        int[] arr=new int[n-1];
        while(n != 1){
            if(n == nums.length){
            for(int i=0;i<n-1;i++){
                arr[i]=nums[i]+nums[i+1];
            }
            }
            else{
                 for(int i=0;i<n-1;i++){
                arr[i]=arr[i]+arr[i+1];
                if(arr[i]>10){
                    arr[i]%=10;
                }
            }
            }
            
            n--;
        }
        if(arr[0] >= 10){
            arr[0]%=10;
        }
        return arr[0];
    }
}