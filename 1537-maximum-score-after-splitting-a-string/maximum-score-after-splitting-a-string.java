class Solution {
    public int maxScore(String s) {
        int max=Integer.MIN_VALUE;
        int zeroes=0;
        int ones=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == '1'){
                ones++;
            }
            else{
                zeroes++;
            }
            max=Math.max(max,zeroes-ones);
        }
        if(s.charAt(s.length()-1) == '1')ones++;
        return max+ones;
    }
}