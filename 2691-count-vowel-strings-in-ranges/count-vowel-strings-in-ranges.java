class Solution {
    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int len=queries.length;
        int[] res=new int[len];
        int[] vow=new int[words.length];
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1)) ){
                vow[i]=1;
            }
            else{
                vow[i]=0;
            }
        }
        for(int i=1;i<vow.length;i++){
            vow[i]+=vow[i-1];
        }
        for(int i=0;i<len;i++){
            int j=queries[i][0];
            int k=queries[i][1];
            if(j == 0){
                res[i]=vow[k];
            }
            else{
                res[i]=vow[k]-vow[j-1];
            }
        }
        return res;
    }
}