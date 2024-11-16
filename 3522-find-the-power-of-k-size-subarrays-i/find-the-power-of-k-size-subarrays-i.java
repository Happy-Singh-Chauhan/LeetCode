class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if( k == 1){
            return nums;
        }
        int[] arr=new int[nums.length-k+1];
        int i=0;
        while(i<arr.length){
            int max=0;
            for(int j=i;j<i+k-1;j++){
                if(nums[j+1] == nums[j]+1){
                    max=Math.max(max,Math.max(nums[j],nums[j+1]));
                }
                else{
                    max=-1;
                    break;
                }
            }
            arr[i]=max;
            i++;
        }
        return arr;
    }
}