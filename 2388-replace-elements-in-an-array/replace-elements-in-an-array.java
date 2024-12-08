class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int[] pos=new int[1000001];
        for(int i=0;i<nums.length;i++){
            pos[nums[i]]=i;
        }
        for(int i=0;i<operations.length;i++){
            int oldNum=operations[i][0];
            int newNum=operations[i][1];
            int index=pos[oldNum];
            nums[index]=newNum;
            pos[newNum]=index;
        }
        return nums;
    }
}