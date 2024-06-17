class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0;i<stones.length();i++){
            char str=stones.charAt(i);
            for(int j=0;j<jewels.length();j++){
                char str2=jewels.charAt(j);
                if(str == str2){
                    count++;
                }
            }
        }
        return count;
    }
}