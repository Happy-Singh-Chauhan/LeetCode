class Solution {
    public int largestCombination(int[] candidates) {
        int[] arr=new int[24];
        for(int i=0;i<24;i++){
            for(int num:candidates){
                if((num &(1<<i)) != 0){
                    arr[i]++;
                }
            }
        }
        int max=0;
        for(int num:arr){
            if(num > max){
                max=num;
            }
        }
        return max;
    }
}