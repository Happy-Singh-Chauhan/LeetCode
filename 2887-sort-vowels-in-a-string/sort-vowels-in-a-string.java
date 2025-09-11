class Solution {
    public boolean isVowel(char c){
        if(c == 'a' || c == 'A' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')return true;
        return false;
    }
    public String sortVowels(String s) {
        int cnt=0;
        for(char c:s.toCharArray()){
            if(isVowel(c))cnt++;
        }
        if(cnt == 0)return s;
        char[] arr=new char[cnt];
        cnt=0;
        for(char c:s.toCharArray()){
            if(isVowel(c))arr[cnt++]=c;
        }
        Arrays.sort(arr);
        cnt=0;
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(isVowel(c))sb.append(arr[cnt++]);
            else sb.append(c);
        }
        return sb.toString();
    }
}