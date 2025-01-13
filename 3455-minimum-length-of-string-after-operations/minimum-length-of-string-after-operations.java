class Solution {
    public int minimumLength(String s) {
        if(s.length() < 3)return s.length();
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int minLen=0;
        for(int count:freq){
            while(count >= 3){
                count-=2;
            }
            minLen+=count;
        }
        return minLen;
    }
}