class Solution {
    public boolean canConstruct(String s, int k) {
        if(k > s.length())return false;
        if(k == s.length()) return true;
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int oddCount=0;
        for(int count:freq){
            if(count % 2 == 1)oddCount++;
        }
        return oddCount<=k;
    }
}