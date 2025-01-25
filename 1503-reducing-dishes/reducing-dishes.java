class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int maxSatisfaction=0;
        int cumulativeSum=0;
        for(int i=satisfaction.length-1;i>=0;i--){
            if(cumulativeSum + satisfaction[i] > 0){
                cumulativeSum+=satisfaction[i];
                maxSatisfaction+=cumulativeSum;
            }
            else{
                break;
            }
        }
        return maxSatisfaction;
    }
}