class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int count=0;
        int i;
        for(i=0;i<n-1;i++){
            if(nums[i] != 0){
                if(nums[i] == nums[i+1]){
                    arr[count]=2*nums[i];
                    i++;
                }
                else arr[count]=nums[i];
                count++;
            }
        }
        if(i != n)arr[count]=nums[n-1];
        return arr;
    }
}