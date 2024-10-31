class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result=new int[nums.length];
        int p=0;
        for(int n:nums){
            if(n < pivot){
                result[p++]=n;
            }
        }
        for(int n:nums){
            if(n == pivot){
                result[p++]=n;
            }
        }
        for(int n:nums){
            if(n>pivot){
                result[p++]=n;
            }
        }
        return result;
    }
}