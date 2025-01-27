class Solution {
    public String countAndSay(int n) {
        if(n == 1)return "1";
        String ans="1";
        return helper(n-1,ans);
    }
    public String helper(int n,String ans){
        if(n == 0)return ans;
        ans=pair(ans);
        return helper(n-1,ans);
    }
    public String pair(String ans){
        if(ans.length() == 1)return "11";
        int count=1;
        String s="";
        for(int i=0;i<ans.length()-1;i++){
            if(ans.charAt(i) == ans.charAt(i+1)){
                count++;
            }
            else{
                s=s+count+ans.charAt(i);
                count=1;
            }
        }
        s=s+count+ans.charAt(ans.length()-1);
        return s;
    }
}