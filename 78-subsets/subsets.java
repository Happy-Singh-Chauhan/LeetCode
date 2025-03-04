class Solution {
    public void generateSubsets(int index,List<List<Integer>> ans,int[] nums,Set<List<Integer>> set,List<Integer> list){
        if(index == nums.length){
            if(!set.contains(list)){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(nums[index]);
        generateSubsets(index+1,ans,nums,set,list);
        list.remove(list.size()-1);
        generateSubsets(index+1,ans,nums,set,list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        generateSubsets(0,ans,nums,set,new ArrayList<>());
        return ans;
    }
}