class Solution {
    public int helper(List<Integer> list,int ans,int max){
        if(list.isEmpty())return max;
        Collections.sort(list);
        for(int i=1;i<=list.size();i++){
            ans+=i*list.get(i-1);
        }
        list.remove(list.get(0));
        max=Math.max(max,ans);
        return helper(list,0,max);
    }
    public int maxSatisfaction(int[] satisfaction) {
        List<Integer> list=new ArrayList<>();
        for(int n:satisfaction){
            list.add(n);
        }
        int ans=0;
        int max=0;
        return helper(list,ans,max);
    }
}