class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;
        int[] maxScoreLeft=new int[n];
        int maxScore=0;
        maxScoreLeft[0]=values[0];

        for(int i=1;i<n;i++){
            int currentScore=values[i]-i;
            maxScore=Math.max(maxScore,currentScore+maxScoreLeft[i-1]);
            int current=values[i]+i;
            maxScoreLeft[i]=Math.max(maxScoreLeft[i-1],current);
        }
        return maxScore;
    }
}