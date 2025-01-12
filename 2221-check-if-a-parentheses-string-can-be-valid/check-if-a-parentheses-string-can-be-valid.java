class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length() % 2 == 1)return false;
        int upper=0;
        int lower=0;
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i) == '1'){
                if(s.charAt(i) == '('){
                    upper++;
                    lower++;
                }
                else{
                    upper--;
                    lower--;
                }
            }
            else{
                upper++;
                lower--;
            }
                if(lower < 0)lower+=2;
                if(upper < 0)return false;
        }
        return lower == 0;
    }
}