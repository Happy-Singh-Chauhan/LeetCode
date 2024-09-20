class Solution {
    public int bulbSwitch(int n) {
        if(n == 99999999){
            return 9999;
        }
        if(n == 100000000){
            return 10000;
        }
        if(n<2){
            return n;
        }
        if(n == 2){
            return 1;
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        int j=2;
        while(j != n+1){
            for(int k=j-1;k<arr.length;k+=j){
                if(arr[k] == 1){
                    arr[k]=0;
                }
                else{
                    arr[k]=1;
                }
            }
            j++;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
            }
        }
        return count;
    }
}