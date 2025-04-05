class Solution {
    int sum=0;
    public void generateSubsets(int index,int[] nums,List<Integer> list){
        if(index == nums.length){
            int xor=0;
            for(int num:list){
                xor^=num;
            }
            sum+=xor;
            return;
        }
        list.add(nums[index]);
        generateSubsets(index+1,nums,list);
        list.remove(list.size()-1);
        generateSubsets(index+1,nums,list);
    }
    public int subsetXORSum(int[] nums) {
        int index=0;
        generateSubsets(index,nums,new ArrayList<>());
        return sum;
    }
}