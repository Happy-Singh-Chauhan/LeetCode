class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        int totalOperations=0;
        double sum=0;
        for(int num:nums){
            pq.add(num*1.0);
            sum+=num;
        }
        double halveSum=sum/2;
        while(sum > halveSum){
            totalOperations++;
            double num=pq.poll();
            sum-=num/2;
            pq.add(num/2);
        }
        return totalOperations;
    }
}