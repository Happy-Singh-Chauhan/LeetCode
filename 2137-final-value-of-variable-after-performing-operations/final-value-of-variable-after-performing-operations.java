class Solution {
    static int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(int i=0;i<=operations.length-1;i++){
            if("X++".equals(operations[i]) || "++X".equals(operations[i])){
                X++;
            }
            else if("X--".equals(operations[i]) || "--X".equals(operations[i])){
                X--;
            }
        }
        return X;
    }
}