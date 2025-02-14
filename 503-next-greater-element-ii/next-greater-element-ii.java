class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2*n];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i%n];
        }
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            nums[i]=-1;
            for(int j=i;j<arr.length;j++){
                if(arr[j] > num){
                nums[i]=arr[j];
                break;
                }
            }
        }
        return nums;
    }
}