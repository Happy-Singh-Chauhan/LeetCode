class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<arr.length;i++){
            int a=Integer.bitCount(i);
            arr[i]=a;
        }
        return arr;
    }
}