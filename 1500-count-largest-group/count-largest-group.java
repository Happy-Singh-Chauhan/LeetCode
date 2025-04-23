class Solution {
    public int check(int n){
        int a=0;
        while(n > 0){
            a+=n%10;
            n/=10;
        }
        return a;
    }
    public int countLargestGroup(int n) {
        int[] arr=new int[10+n];
        for(int i=1;i<=n;i++){
            if(i < 1)arr[i]++;
            else arr[check(i)]++;
        }
        int max=0;
        int count=0;
        for(int num:arr)max=Math.max(max,num);
        for(int num:arr)if(num == max)count++;
        return count;
    }
}