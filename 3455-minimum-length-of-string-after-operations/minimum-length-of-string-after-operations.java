class Solution {
    public int minimumLength(String s) {
        if(s.length() < 3)return s.length();
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int minLen=0;
        for(int count:freq){
            if(count == 0)continue;
            if(count % 2 == 0)minLen+=2;
            else minLen+=1;
        }
        return minLen;
    }
}