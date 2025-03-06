class Solution {
    public boolean isPalindrome(String s,int start,int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--))return false;   
        }
        return true;
    }
    public void palindrome(int index,List<List<String>> ans,List<String> list,String s){
        if(index == s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                list.add(s.substring(index,i+1));
                palindrome(i+1,ans,list,s);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> list=new ArrayList<>();
        palindrome(0,ans,list,s);
        return ans;
    }
}