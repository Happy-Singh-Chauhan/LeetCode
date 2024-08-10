class Solution {
    public String truncateSentence(String s, int k) {
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch == ' '){
                k--;
            }
            if(k == 0){
                return s.substring(0,i);
            }
        }
        return s;
    }
}