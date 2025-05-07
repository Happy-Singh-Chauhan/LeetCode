class Solution {
    public int lcs(String text1,String text2){
        int n=text1.length();
        int[] prev=new int[n+1];
        int[] curr=new int[n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    curr[j]=1+prev[j-1];
                }
                else{
                    curr[j]=Math.max(prev[j],curr[j-1]);
                }
            }
            for(int k=0;k<prev.length;k++)prev[k]=curr[k];
        }
        return n-prev[n];
    }
    public int minInsertions(String s) {
        String str=new StringBuilder(s).reverse().toString();
        return lcs(s,str);
    }
}