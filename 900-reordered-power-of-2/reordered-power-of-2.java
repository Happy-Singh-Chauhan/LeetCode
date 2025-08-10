class Solution {
    public boolean Reordering(int n,int curr){
        int[] freq=new int[10];
        while(curr > 0){
            freq[curr%10]++;
            curr/=10;
        }
        while(n > 0){
            freq[n%10]--;
            n/=10;
        }
        for(int num:freq){
            if(num != 0)return false;
        }
        return true;
    }
    public boolean reorderedPowerOf2(int n) {
        int[] pow=new int[30];
        for(int i=0;i<30;i++){
            pow[i]=(int)Math.pow(2,i);
        }
        for(int i=0;i<30;i++){
            if(Reordering(n,pow[i]))return true;
        }
        return false;
    }
}