class Solution {
    public char helper(String s,int k){
        if(s.length() >= k)return s.charAt(k-1);
        StringBuilder sb=new StringBuilder(s);
        int index=0;
        while(index < s.length()){
            char ch=s.charAt(index);
            if(ch == 'z')sb.append('a');
            else sb.append((char)(ch + 1));
            index++;
        }
        return helper(sb.toString(),k);
    }
    public char kthCharacter(int k) {
        String s="a";
        return helper(s,k);
    }
}