class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int n:nums){
            if(n<10){
                sum+=n;
            }
            else{
                sum+=max(n);
            }
        }
        return sum;
    }
    public int max(int n){
        int max=0;
        int num=n;
        while(n>0){
            max=Math.max(max,n%10);
            n/=10;
        }
        int ans=0;
        int pw=0;
        while(num>0){
            ans+=(Math.pow(10,pw))*max;
            pw++;
            num/=10;
        }
        return ans;
    }
}