class Solution {
    public int maxVowels(String s, int k) {
        int maxVowel=0;
        int left=0;
        int vowel=0;
        for(int right=0;right<s.length();right++){
            if(s.charAt(right) == 'a' || s.charAt(right) == 'e' || s.charAt(right) == 'i' || s.charAt(right) == 'o' || s.charAt(right) == 'u' )vowel++;
            if((right-left+1) == k){
                maxVowel=Math.max(maxVowel,vowel);
                if(s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' || s.charAt(left) == 'o' || s.charAt(left) == 'u' )vowel--;
                left++;
            }
        }
        return maxVowel;
    }
}