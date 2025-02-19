class Solution {
    public void generateHappyString(int n,String currentString,List<String> list){
        if(currentString.length() == n){
            list.add(currentString);
            return;
        }
        for(char ch='a';ch<='c';ch++){
            if(currentString.length() > 0 && currentString.charAt(currentString.length()-1) == ch)continue;
            generateHappyString(n,currentString + ch,list);
        }
    }
    public String getHappyString(int n, int k) {
       String currentString="";
       List<String> list=new ArrayList<>();

        generateHappyString(n,currentString,list);
        if(list.size() < k)return "";
        return list.get(k-1);
    }
}