class Solution {
    public void generate(int index,List<List<Integer>> ans,int[] nums,List<Integer> list){
        ans.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++){
            if(i > index && nums[i] == nums[i-1])continue;
            list.add(nums[i]);
            generate(i+1,ans,nums,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        generate(0,ans,nums,new ArrayList<>());
        return ans;
    }
}