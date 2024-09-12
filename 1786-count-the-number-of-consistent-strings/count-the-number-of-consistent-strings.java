class Solution {
    static boolean check(String s,String allowed){
        if(s.length() == 1){
            if(allowed.contains(""+s.charAt(0))){
                return true;
            }
            return false;
        }
        for(int j=0;j<s.length();j++){
            if(!allowed.contains(""+s.charAt(j))){
                return false;
            }
        }
        return true;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            boolean ans=check(words[i],allowed);
            if(ans){
                count++;
            }
        }
        return count;
    }
}