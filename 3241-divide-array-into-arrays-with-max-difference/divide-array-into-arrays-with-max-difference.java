class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int part=n/3;
        int[][] arr=new int[part][3];
        int p=0;
        for(int j=0;j<part;j++){
            for(int l=0;l<3;l++){
                arr[j][l]=nums[p];
                p++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i][2] - arr[i][0] > k)return new int[][]{};
        }
        return arr;
    }
}