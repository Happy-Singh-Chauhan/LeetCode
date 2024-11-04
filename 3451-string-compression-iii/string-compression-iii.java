class Solution {
    public String compressedString(String word) {
        String str="";
        int pos=0;
        while(pos < word.length()){
            int count=0;
            char ch=word.charAt(pos);
            while(pos < word.length() && count < 9 && word.charAt(pos) == ch){
                count++;
                pos++;
            }
            str+=count;
            str+=ch;
        }
        return str;
    }
}