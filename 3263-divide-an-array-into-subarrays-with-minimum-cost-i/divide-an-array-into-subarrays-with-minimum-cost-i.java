class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        if(n == 3)return nums[0]+nums[1]+nums[2];
        int ans=nums[0];
        int[] arr=new int[n-1];
        for(int i=1;i<n;i++){
            arr[i-1]=nums[i];
        }
        Arrays.sort(arr);
        return ans+arr[0]+arr[1];
    }
}