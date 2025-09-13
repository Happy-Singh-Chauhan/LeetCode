class Solution {
    public int maxFreqSum(String s) {
        int[] vowel=new int[26];
        int[] consonent=new int[26];
        for(char c:s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')vowel[c-'a']++;
            else consonent[c-'a']++;
        }
        int maxVow=0;
        int maxConst=0;
        for(int num:vowel)maxVow=Math.max(maxVow,num);
        for(int num:consonent)maxConst=Math.max(maxConst,num);
        return maxVow+maxConst;
    }
}