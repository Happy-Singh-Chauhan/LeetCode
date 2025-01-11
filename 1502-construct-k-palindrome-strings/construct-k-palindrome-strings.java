class Solution {
    public boolean canConstruct(String s, int k) {
        if(k > s.length())return false;
        if(k == s.length()) return true;
        Set<Character> set=new HashSet<>();
        int count=0;
        for(char c:s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                count++;
            }
            else{
                count--;
                set.remove(c);
            }
        }
        if(count > k) return false;
        return true;
    }
}