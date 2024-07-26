class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        ArrayList ans=new ArrayList();
        for(int i=0;i<n;i++){
            int a=words[i].length();
            for(int j=0;j<a;j++){
                if(words[i].charAt(j) == x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}