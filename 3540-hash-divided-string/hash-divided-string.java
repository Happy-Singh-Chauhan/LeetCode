class Solution {
    public String stringHash(String s, int k) {
        if(k == 1)return s;
        StringBuilder ans=new StringBuilder();
        Character[] arr=new Character[26];
        for(int i=0;i<26;i++){
            arr[i]=(char)(97+i);
        }
        char[] words=s.toCharArray();
        for(int i=0;i<words.length;i+=k){
            int value=0;
            for(int j=i;j<i+k;j++){
                value+=(words[j]-97);
            }
            value%=26;
            ans.append(arr[value]);
        }
        return ans.toString();
    }
}