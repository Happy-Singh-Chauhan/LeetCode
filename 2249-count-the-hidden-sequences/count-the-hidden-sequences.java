class Solution {
    public int numberOfArrays(int[] difference, int lower, int upper) {
        long curr=0;
        long max=0;
        long min=0;
        for(int num:difference){
            curr+=num;
            min=Math.min(min,curr);
            max=Math.max(max,curr);
        }
        int ans=(upper-lower+1)-(int)(max-min);
        return (ans < 0)? 0 : ans;
    }
}