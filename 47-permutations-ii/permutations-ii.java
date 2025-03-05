class Solution {
    public void generate(List<List<Integer>> ans,int[] nums,List<Integer> list){
            if(list.size() == nums.length){
                List<Integer> list2=new ArrayList<>();
                    for(int i=0;i<list.size();i++){
                        list2.add(nums[list.get(i)]);
                    }
                    if(!ans.contains(list2)){
                    ans.add(new ArrayList<>(list2));
                    }
                    return;
                }
        for(int i=0;i<nums.length;i++){
            if(list.contains(i))continue;
            list.add(i);
            generate(ans,nums,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        generate(ans,nums,new ArrayList<>());
        return ans;
    }
}