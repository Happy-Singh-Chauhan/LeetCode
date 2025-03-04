class Solution {
    public void generateSubsets(int index,List<List<Integer>> ans,int[] nums,List<Integer> list){
        if(index == nums.length){
            if(!ans.contains(list)){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(nums[index]);
        generateSubsets(index+1,ans,nums,list);
        list.remove(list.size()-1);
        generateSubsets(index+1,ans,nums,list);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        generateSubsets(0,ans,nums,new ArrayList<>());
        return ans;
    }
}