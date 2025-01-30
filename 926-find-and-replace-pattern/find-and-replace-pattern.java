class Solution {
    public boolean check(String a,String b){
        for(int i=0;i<a.length();i++){
            if(a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i)))return false;
        }
        return true;
    }
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        for(String word:words){
            if(check(word,pattern))ans.add(word);
        }
        return ans;
    }
}