class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
       List<String> list=new ArrayList<>();
       list.add(words[0]);
       for(int i=1;i<groups.length;i++){
        if(groups[i] != groups[i-1]){
            list.add(words[i]);
        }
       } 
       return list;
    }
}