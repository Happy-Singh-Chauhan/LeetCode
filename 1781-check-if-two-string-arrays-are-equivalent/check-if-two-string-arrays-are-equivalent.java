class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(String str1:word1){
            s1.append(str1);
        }
        for(String str2:word2){
            s2.append(str2);
        }
        String ans1=s1.toString();
        String ans2=s2.toString();
        if(ans1.equals(ans2)){
            return true;
        }
        return false;
    }
}