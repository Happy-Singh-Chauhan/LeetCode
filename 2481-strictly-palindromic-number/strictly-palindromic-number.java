class Solution {
    public boolean check(int n,int num){
        String str="";
        while(n>0){
            str+=n%num;
            n/=num;
        }
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            if(!check(n,i)){
                return false;
            }
        }
        return true;
    }
}