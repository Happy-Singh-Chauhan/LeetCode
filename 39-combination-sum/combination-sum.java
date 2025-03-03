class Solution {
    public void combinations(int index,List<List<Integer>> ans,int[] candidates,int target,List<Integer> list){
        if(index == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[index] <= target){
            list.add(candidates[index]);
            target-=candidates[index];
            combinations(index,ans,candidates,target,list);
            target+=candidates[index];
            list.remove(list.size()-1);
        }
        combinations(index+1,ans,candidates,target,list);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        combinations(0,ans,candidates,target,new ArrayList<>());
        return ans;
    }
}