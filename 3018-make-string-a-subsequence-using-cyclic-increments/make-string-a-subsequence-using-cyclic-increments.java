class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int index=0;
        for(int i=0;i<str1.length() && index<str2.length();i++){
            if(str1.charAt(i) == str2.charAt(index) || (str1.charAt(i)+1 == str2.charAt(index)) || (str1.charAt(i)-25) == str2.charAt(index)-0){
                index++;
            }
        }
        return index == str2.length();
    }
}