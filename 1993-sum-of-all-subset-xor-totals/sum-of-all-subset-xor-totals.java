class Solution {
    public void generateSubsets(List<List<Integer>> list,int index,int[] nums,List<Integer> list1){
        if(index == nums.length){
            list.add(new ArrayList<>(list1));
            return;
        }
        list1.add(nums[index]);
        generateSubsets(list,index+1,nums,list1);
        list1.remove(list1.size()-1);
        generateSubsets(list,index+1,nums,list1);
    }
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int index=0;
        generateSubsets(list,index,nums,new ArrayList<>());
        int sum=0;
        for(List<Integer> lst:list){
            int xor=0;
            for(int num:lst){
                xor^=num;
            }
            sum+=xor;
        }
        return sum;
    }
}