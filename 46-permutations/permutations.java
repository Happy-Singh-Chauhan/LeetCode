class Solution {
    public void generate(int index,List<List<Integer>> ans,int[] nums,List<Integer> list){
        if(index == nums.length){
            if(list.size() == nums.length){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i]))continue;
            list.add(nums[i]);
            generate(index+1,ans,nums,list);
            list.remove(list.size()-1);
            generate(index+1,ans,nums,list);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        generate(0,ans,nums,new ArrayList<>());
        return ans;
    }
}