class Solution {
    public String[] divideString(String s, int k, char fill) {
       int n=s.length();
       int part=n/k;
       int rem=n%k;
       if(rem != 0)part++;
       String[] arr=new String[part];
       int f=k-rem;
       while(f > 0){
        s+=fill;
        f--;
       }
       int l=0;
       for(int i=0;i<n;i+=k){
        arr[l++]=s.substring(i,i+k);
       }
       return arr;
    }
}