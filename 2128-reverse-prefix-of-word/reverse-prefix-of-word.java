class Solution {
    public String reversePrefix(String word, char ch) {
        String str="";
        for(int i=0;i<word.length();i++){
            str+=word.charAt(i);
            if(word.charAt(i) == ch){
                str=reverse(str);
                for(int j=i+1;j<word.length();j++){
                    str+=word.charAt(j);
                }
                break;
            }
        }
        return str;
    }
    public String reverse(String s){
        String str1="";
        for(int i=s.length()-1;i>=0;i--){
            str1+=s.charAt(i);
        }
        return str1;
    }
}