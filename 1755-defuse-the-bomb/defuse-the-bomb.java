class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] ans=new int[n];
        if(k == 0){
            for(int i=0;i<n;i++){
                ans[i]=0;
            }
            return ans;
        }
        int j=0;
        while(j<n){
            if(k > 0){
                for(int m=1;m<=k;m++){
                ans[j]+=code[(j+m+n)%n];
            }
            }
            else{
                for(int m=Math.abs(k);m>=1;m--){
                ans[j]+=code[(j-m+n)%n];
            }
            }
            j++;
        }
        return ans;
    }
}