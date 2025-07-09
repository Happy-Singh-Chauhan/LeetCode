class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n=startTime.length;
        List<Integer> list=new ArrayList<>();
        list.add(startTime[0]);
        for(int i=1;i<n;i++){
            list.add(startTime[i]-endTime[i-1]);
        }
        list.add(eventTime-endTime[n-1]);

        int i=0,j=0;
        int maxSum=0,currSum=0;
        while(j < list.size()){
            currSum+=list.get(j);
            if(i < list.size() && j-i+1 > k+1){
                currSum-=list.get(i);
                i++;
            }
            maxSum=Math.max(maxSum,currSum);
            j++;
        }
        return maxSum;
    }
}