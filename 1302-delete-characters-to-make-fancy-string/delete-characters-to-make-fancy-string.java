class Solution {
    public String makeFancyString(String s) {
        if(s.length() < 3){
            return s;
        }
        StringBuilder sb=new StringBuilder();
        char prev=s.charAt(0);
        sb.append(prev);
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == prev){
                count++;
            }
            else{
                prev=s.charAt(i);
                count=0;
            }
            if(count < 2){
                sb.append(prev);
            }
        }
        return String.valueOf(sb);
    }
}