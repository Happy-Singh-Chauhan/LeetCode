class Solution {
    public int buildChar(int[] freq){
        int totalCount=0;
        for(int i=0;i<26;i++){
            if(freq[i] > 0){
                totalCount++;
                freq[i]--;
                totalCount+=buildChar(freq);
                freq[i]++;
            }
        }
        return totalCount;
    }
    public int numTilePossibilities(String tiles) {
        int[] freq=new int[26];
        for(char c:tiles.toCharArray()){
            freq[c-'A']++;
        }
        return buildChar(freq);
    }
}