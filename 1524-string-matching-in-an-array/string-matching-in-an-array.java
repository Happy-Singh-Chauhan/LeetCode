class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i != j && words[i].contains(words[j])){
                    if(ans.contains(words[j]))continue;
                    ans.add(words[j]);
                }
            }
        }
        return ans;
    }
}