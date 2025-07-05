class Solution {
    public int findLucky(int[] arr) {
        int[] freq=new int[501];
        int max=-1;
        for(int num:arr){
            freq[num]++;
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i] == i){
                max=Math.max(max,freq[i]);
            }
        }
        return max;
    }
}