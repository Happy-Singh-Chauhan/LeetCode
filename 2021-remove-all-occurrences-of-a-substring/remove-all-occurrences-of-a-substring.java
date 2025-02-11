class Solution {
    public String removeOccurrences(String s, String part) {
        String str="";
        for(int i=0;i<s.length();i++){
            str+=s.charAt(i);
            if(str.contains(part)){
                StringBuilder sb=new StringBuilder(str);
                int len=part.length();
                while(len > 0){
                    sb.deleteCharAt(sb.length()-1);
                    len--;
                }
                str=sb.toString();
            }
        }
        return str;
    }
}