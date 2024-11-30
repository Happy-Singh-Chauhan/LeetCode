class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> set=new HashSet<>();
        int count=0;
        for(String s:bannedWords){
            set.add(s);
        }
        for(String str:message){
            if(set.contains(str)){
                count++;
            }
            if(count == 2){
            return true;
        }
        }
        
        return false;
    }
}