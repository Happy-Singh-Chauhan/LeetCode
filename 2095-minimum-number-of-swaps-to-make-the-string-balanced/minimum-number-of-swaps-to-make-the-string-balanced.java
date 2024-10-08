class Solution {
    public int minSwaps(String s) {
        int imbalance=0;
        int swapCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '['){
                imbalance++;
            }
            if(s.charAt(i) == ']' && imbalance != 0){
                imbalance--;
            }
            else if(s.charAt(i) == ']' && imbalance == 0){
                imbalance++;
                swapCount++;
            }
        }
        return swapCount;
    }
}