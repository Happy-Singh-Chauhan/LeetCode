class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:nums){
            if(num < k)pq.add(num);
        }
        int totalOperations=0;
        while(!pq.isEmpty()){
            int x=pq.poll();
            totalOperations++;
            if(pq.isEmpty())break;
            int y=pq.poll();
            long newValue=(2L*x)+y;
            if(newValue < k)pq.add((int)newValue);
        }
        return totalOperations;
    }
}