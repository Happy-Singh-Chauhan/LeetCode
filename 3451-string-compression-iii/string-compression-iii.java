class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        int j=0;
        while(j < word.length()){
            char ch=word.charAt(j);
            int count=0;

            while(j < word.length() && ch == word.charAt(j)){
                count++;
                j++;
            }
            if(count <= 9){
                char value=(char)(count+'0');
                sb.append(value);
                sb.append(ch);
            }
            else{
                while(count > 9){
                    sb.append('9');
                    sb.append(ch);
                    count-=9;
                }
                char value=(char)(count+'0');
                sb.append(value);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}