class Solution {
    public void combinations(int index,List<List<Integer>> ans,int[] candidates,int target,List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i > index && candidates[i] == candidates[i-1])continue;
            if(candidates[i] > target)break;
            list.add(candidates[i]);
            combinations(i+1,ans,candidates,target-candidates[i],list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        combinations(0,ans,candidates,target,new ArrayList<>());
        return ans;
    }
}