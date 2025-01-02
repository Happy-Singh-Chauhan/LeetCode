class Solution {
    public boolean isVowel(Character c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int len=queries.length;
        int[] ans=new int[len];
        int[] vow=new int[words.length];

        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1))){
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
            int start=queries[i][0];
            int end=queries[i][1];
            if(start == 0){
                ans[i]=vow[end];
            }
            else{
                ans[i]=vow[end]-vow[start-1];
            }
        }
        return ans;
    }
}