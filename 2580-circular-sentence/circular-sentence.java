class Solution {
    public boolean isCircularSentence(String sentence) {
        if(sentence.charAt(0) != sentence.charAt(sentence.length()-1)){
            return false;
        }
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i) == ' '){
                if(sentence.charAt(i-1) != sentence.charAt(i+1)){
                    return false;
                }
            }
        }
        return true;
    }
}