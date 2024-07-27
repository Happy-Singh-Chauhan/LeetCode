class Solution {
    public int mostWordsFound(String[] sentences) {
        int MaxCount=0;
        for(int i=0;i<sentences.length;i++){
            MaxCount=Math.max(MaxCount,count(sentences[i]));
        }
        return MaxCount;
    }
    public int count(String s){
        int count=1;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==' '){
                count++;
            }
        }
        return count;
    }
}