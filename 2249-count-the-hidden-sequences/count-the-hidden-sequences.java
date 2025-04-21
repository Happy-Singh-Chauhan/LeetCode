class Solution {
    public int numberOfArrays(int[] difference, int lower, int upper) {
        int n=difference.length;
        long[] hidden=new long[n+1];
        hidden[0]=0;
        long max=0;
        long min=0;
        for(int i=1;i<hidden.length;i++){
            hidden[i]=hidden[i-1]+difference[i-1];
            min=Math.min(min,hidden[i]);
            max=Math.max(max,hidden[i]);
        }
        int ans=(upper-lower+1)-(int)(max-min);
        if(ans < 0)return 0;
        return ans;
    }
}