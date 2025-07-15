class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3)return false;
        int numberCount=0;
        int vowelCount=0;
        int consonantCount=0;
        String number="0123456789";
        String vowel="aeiouAEIOU";
        String consonant="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for(char c:word.toCharArray()){
            if(number.contains(""+c))numberCount++;
            else if(vowel.contains(""+c))vowelCount++;
            else if(consonant.contains(""+c))consonantCount++;
            else return false;
        }
        return (vowelCount > 0 && consonantCount > 0)? true : false;
    }
}