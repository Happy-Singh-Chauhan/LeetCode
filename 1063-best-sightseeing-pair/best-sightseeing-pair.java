class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;
        int[] maxLeft=new int[n];
        maxLeft[0]=values[0];
        int maxScore=0;
        for(int i=1;i<n;i++){
            int currentScore=values[i]-i;
            maxScore=Math.max(maxScore,maxLeft[i-1]+currentScore);
            int current=values[i]+i;
            maxLeft[i]=Math.max(maxLeft[i-1],current);
        }
        return maxScore;
    }
}