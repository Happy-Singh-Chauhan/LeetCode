class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() > goal.length()){
            return false;
        }
        String str=s;
        for(int i=0;i<s.length();i++){
            str+=s.charAt(i);
            if(str.contains(goal)){
                return true;
            }
        }
        return false;
    }
}