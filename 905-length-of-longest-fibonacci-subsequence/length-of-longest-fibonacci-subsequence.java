class Solution {
    public int lenLongestFibSubseq(int[] arr) {
       int n=arr.length;
       Set<Integer> set=new HashSet<>();
       for(int num:arr){
        set.add(num);
       } 
       int maxLength=0;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            int prev=arr[i];
            int current=arr[j];
            int len=2;
            while(set.contains(prev+current)){
                int temp=current;
                current+=prev;
                prev=temp;
                maxLength=Math.max(maxLength,++len);
            }
        }
       }
       return maxLength;
    }
}