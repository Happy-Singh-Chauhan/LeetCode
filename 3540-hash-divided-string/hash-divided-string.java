class Solution {
    public String stringHash(String s, int k) {
        if(k == 1)return s;
        String ans="";
        Character[] arr=new Character[26];
        for(int i=0;i<26;i++){
            arr[i]=(char)(97+i);
        }
        char[] words=s.toCharArray();
        int i=0;
        while(i<words.length){
            int value=0;
            for(int j=i;j<i+k;j++){
                value+=(words[j]-97);
            }
            value%=26;
            ans+=arr[value];
            i+=k;
        }
        return ans;
    }
}