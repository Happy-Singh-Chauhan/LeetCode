class Solution {
    public boolean canBeDistributed(int[] candies,long k,int distributing){
        long maxDistributing=0;
        for(int i=0;i<candies.length;i++){
            maxDistributing+=(candies[i]/distributing);
        }
        return maxDistributing >= k;
    }
    public int maximumCandies(int[] candies, long k) {
        int maxCandies=0;
        for(int num:candies){
            maxCandies=Math.max(maxCandies,num);
        }
        int start=0;
        int end=maxCandies;
        while(start < end){
            int middle=(start+end+1)/2;
            if(canBeDistributed(candies,k,middle)){
                start=middle;
            }
            else{
                end=middle-1;
            }
        }
        return start;
    }
}