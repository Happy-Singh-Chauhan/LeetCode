class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        List<Integer> list=new ArrayList<>();
        list.add(startTime[0]);
        for(int i=1;i<startTime.length;i++){
            list.add(startTime[i]-endTime[i-1]);
        }
        list.add(eventTime - endTime[startTime.length - 1]);
        int n=list.size();
        int[] maxLeftFree=new int[n];
        int[] maxRightFree=new int[n];

        for(int i=n-2;i>=0;i--){
            maxRightFree[i]=Math.max(maxRightFree[i+1],list.get(i+1));
        }
        for(int i=1;i<n;i++){
            maxLeftFree[i]=Math.max(maxLeftFree[i-1],list.get(i-1));
        }

        int res=0;
        for(int i=1;i<n;i++){
            int currDuration=endTime[i-1] - startTime[i-1];
            if(currDuration <= Math.max(maxLeftFree[i-1],maxRightFree[i])){
                res=Math.max(res,list.get(i-1) + currDuration + list.get(i));
            }
            res=Math.max(res,list.get(i-1) + list.get(i));
        }
        return res;
    }
}