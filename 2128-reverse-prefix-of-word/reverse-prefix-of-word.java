class Solution {
    public String reversePrefix(String word, char ch) {
        int j=word.indexOf(ch);
        if(j == -1) return word;
        char[] arr=word.toCharArray();
        for(int i=0;i<j;i++,j--){
            char t =arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
        return String.valueOf(arr);
    }
}