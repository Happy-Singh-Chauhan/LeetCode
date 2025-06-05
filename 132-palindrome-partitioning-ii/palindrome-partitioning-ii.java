class Solution {
    public boolean isPalindrome(int start,int end,String s){
        while(start < end){
            if(s.charAt(start++) != s.charAt(end--))return false;
        }
        return true;
    }
    public int minCut(String s) {
        int n=s.length();
        int[] dp=new int[n+1];
        for(int i=n-1;i>=0;i--){
        int min=Integer.MAX_VALUE;
        for(int j=i;j<n;j++){
            if(isPalindrome(i,j,s)){
                int cost=1+dp[j+1];
                min=Math.min(min,cost);
            }
        }
        dp[i]=min;
    }
    return dp[0]-1;
    }
}