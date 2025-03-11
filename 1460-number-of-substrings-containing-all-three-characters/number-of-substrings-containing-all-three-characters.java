class Solution {
    public boolean hasAllChar(int[] freq){
        return freq[0] > 0 && freq[1] > 0 && freq[2] > 0;
    }
    public int numberOfSubstrings(String s) {
        int len=s.length();
        int left=0;
        int right=0;
        int total=0;
        int[] freq=new int[3];
        while(right < len){
            char current=s.charAt(right);
            freq[current-'a']++;
            while(hasAllChar(freq)){
                char last=s.charAt(left);
                total+=len-right;
                freq[last-'a']--;
                left++;
            }
        right++;
        }
        return total;
    }
}