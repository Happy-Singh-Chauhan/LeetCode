class Solution {
    public void generate(List<List<Integer>> ans,int[] nums,List<Integer> list){
            if(list.size() == nums.length){
                ans.add(new ArrayList<>(list));
                return;
            }
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i]))continue;
            list.add(nums[i]);
            generate(ans,nums,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        generate(ans,nums,new ArrayList<>());
        return ans;
    }
}