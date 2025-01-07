class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<>();
        Set<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i != j && words[i].contains(words[j])){
                    set.add(words[j]);
                }
            }
        }
        for(String s:set){
            ans.add(s);
        }
        return ans;
    }
}