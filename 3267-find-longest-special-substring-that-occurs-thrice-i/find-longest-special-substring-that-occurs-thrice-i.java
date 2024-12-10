class Solution {
    public boolean check(String str,String s){
        int k=str.length();
        int count=0;
        for(int i=0;i<=s.length()-k;i++){
            String q="";
            for(int j=i;j<i+k;j++){
                q+=s.charAt(j);
            }
            if(q.equals(str)){
                count++;
            }
            if(count == 3) return true;
        }
        return false;
    }
    public int maximumLength(String s) {
       int ans=-1;
       String str="";
        for(int i=0;i<s.length();i++){
            if(i == 0){
                str+=s.charAt(i);
            }
            else if(s.charAt(i) == s.charAt(i-1)){
                str+=s.charAt(i);
            }
            else{
                str="";
                str+=s.charAt(i);
            }
            if(check(str,s)){
                ans=Math.max(ans,str.length());
            }
        }
        return ans;
    }
}