class Solution {
    public boolean canBeDistributed(int[] candies,int distributing,long k){
        long distributed=0;
        for(int i=0;i<candies.length;i++){
            distributed+=(candies[i]/distributing);
        }
        return distributed >= k;
    }
    public int maximumCandies(int[] candies, long k) {
        int start=0;
        int end=0;
        long sum=0;
        for(int num:candies){
            end=Math.max(end,num);
            sum+=num;
        }
        if(sum < k)return 0;
        while(start < end){
            int mid=(start+end+1)/2;
            if(canBeDistributed(candies,mid,k)){
                start=mid;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}