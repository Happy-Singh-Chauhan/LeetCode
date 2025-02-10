class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=1;i<sb.length();i++){
            int ch=(int)sb.charAt(i);
            if(ch > 47 && ch < 58){
                sb.deleteCharAt(i);
                while(i > 0){
                    if((int)sb.charAt(i-1) > 96){
                        sb.deleteCharAt(i-1);
                        i=0;
                        break;
                    }
                    i--;
                }
            }
        }
        return sb.toString();
    }
}