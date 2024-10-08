class Solution {
    public int minSwaps(String s) {
        int opening =0;
        int unbalanced=0;
        for(char c:s.toCharArray()){
            if(c == '['){
                opening++;
            }
            else{
                if(opening>0){
                    opening--;
                }
                else{
                    unbalanced++;
                }
            }
        }
        return unbalanced/2 + unbalanced%2;
    }
}