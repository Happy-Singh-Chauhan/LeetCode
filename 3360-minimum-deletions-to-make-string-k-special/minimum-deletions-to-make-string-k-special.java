class Solution {
    public int minimumDeletions(String word, int k) {
        int res=word.length();
        int[] freq=new int[26];
        for(char c:word.toCharArray()){
            freq[c-'a']++;
        }
        for(int a:freq){
            
            int deleted=0;
            for(int b:freq){
                
                if(a > b)deleted+=b;
                else if(b > a+k)deleted+=b-(a+k);
            }
            res=Math.min(res,deleted);
        }
        return res;
    }
}