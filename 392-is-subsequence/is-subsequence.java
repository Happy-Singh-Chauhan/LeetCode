class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int count=0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                count++;
                i++;
            }
            j++;
        }
        return s.length() == count;
    }
}