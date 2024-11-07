class Solution {
    public int largestCombination(int[] candidates) {
        int[] arr=new int[24];
        int max=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int num:candidates){
                if((num & (1<<i)) != 0){
                    count++;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}