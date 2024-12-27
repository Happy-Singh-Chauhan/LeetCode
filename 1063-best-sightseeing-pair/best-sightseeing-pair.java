class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;
        int maxScore=0;
        int maxScoreLeft=values[0];
        
        for(int i=1;i<n;i++){
            int currentScore=values[i]-i;
            maxScore=Math.max(maxScore,currentScore+maxScoreLeft);
            int current=values[i]+i;
            maxScoreLeft=Math.max(maxScoreLeft,current);
        }
        return maxScore;
    }
}