class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] arr=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int n=nums.get(i);
            if(nums.get(i) == 2){
                arr[i]=-1;
            }
            else{
                int copy=n;
                int count=0;
                while((n & 1) == 1){
                    count++;
                    n=n>>1;
                }
                arr[i]=copy-(1 << (count-1));
            }
        }
        return arr;
    }
}