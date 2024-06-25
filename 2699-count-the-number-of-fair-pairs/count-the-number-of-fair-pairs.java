class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long result=0;
        for(int i=0;i<nums.length;i++){
            int lowerbound=BinarySearchLower(nums,nums[i],i+1,lower,upper);
            int upperbound=BinarySearchUpper(nums,nums[i],i+1,lower,upper);

            result+=(upperbound - lowerbound);
        }
        return result;
    }
    public int BinarySearchLower(int[] nums,int current,int start,int lower,int upper){
        int end=nums.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=lower-current){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public int BinarySearchUpper(int[] nums,int current,int start,int lower,int upper){
        int end=nums.length;
        while(start<end){
            int mid=start+(end - start)/2;
            if(nums[mid]<=upper-current){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
}