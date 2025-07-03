class Solution {
    public String createString(String ans){
        String str=""+ans;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'z')ans+='a';
            else ans+=(char)(str.charAt(i)+1);
        }
        return ans;
    }
    public char kthCharacter(int k) {
        String ans="a";
        while(ans.length() < k){
            ans=""+createString(ans);
        }
        return ans.charAt(k-1);
    }
}