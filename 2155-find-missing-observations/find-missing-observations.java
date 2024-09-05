class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m=rolls.length;
        int total=mean*(n+m);
        int observed=0;
        for(int k:rolls){
            observed+=k;
        }
        int missing=total-observed;
        if(missing<n || missing> 6*n){
            return new int[]{};
        }
        int quotient=missing/n;
        int remainder=missing%n;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=quotient;
        }
        for(int i=0;i<remainder;i++){
            result[i]++;
        }
        return result;
    }
}